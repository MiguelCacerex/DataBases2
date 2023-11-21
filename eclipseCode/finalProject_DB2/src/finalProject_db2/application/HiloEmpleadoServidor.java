package finalProject_db2.application;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import finalProject_db2.connection.Conexion;
import oracle.jdbc.OracleTypes;

public class HiloEmpleadoServidor extends Thread {

	// aqui hace la conexion al bd

	private BufferedReader flujoEntradaComunicacion;
	private PrintWriter flujoSalidaComunicacion;

	//private ObjectOutputStream fuljoSalida;

	ServidorEmpleado servidor;
	private String tipoServicio;

	public void inicializar(BufferedReader in, PrintWriter out, ServidorEmpleado servidor) {

		this.flujoEntradaComunicacion = in;
		this.flujoSalidaComunicacion = out;
		this.servidor = servidor;
	}

	@Override
	public void run() {

		try {
			tipoServicio = flujoEntradaComunicacion.readLine();

			switch (tipoServicio) {

			case "validarCredencialesLogin":

				String correo = flujoEntradaComunicacion.readLine(); //Obtener los datos que envia el cliente al servidor
				String contrasenia = flujoEntradaComunicacion.readLine();

				String datos = consultarEmpleados(correo, contrasenia);

				if (datos != null) {
					enviarMensaje("valido");
				} else {
					enviarMensaje("NoValidado");
				}

				break;

			case "registrarEmpleado":
				String datosEmpleado = flujoEntradaComunicacion.readLine();

				String mensaje = registrarEmpleado(datosEmpleado);

				if(mensaje != null){
					enviarMensaje("Empleado registrado");
				}
				else{
					enviarMensaje("Empleado NO registrado");
				}

			case "obtenerEmpleados":

				String mensaje1 = obtenerEmpleados();

				if(mensaje1 != null){
					enviarMensaje(mensaje1);
				}
				else{
					enviarMensaje("Empleados NO encontrados");
				}


			default:
				break;
			}

		} catch (IOException e) {
			e.printStackTrace();
		}


	}



	//conexión para registrar un empleado en la base de datos
	private String registrarEmpleado(String datosEmpleado) {

		Connection conexion = Conexion.getConnection();
        CallableStatement retornoConexion = null;

        String [] arreglo = datosEmpleado.split(",");


		try {
			 // Llamar a la función utilizando un CallableStatement
			retornoConexion = conexion.prepareCall("{? = call insertar_empleado(?, ?, ?, ?, ?, ? , ?, ?, ?}");

           // Configurar los parámetros de entrada y salida de la función
			retornoConexion.registerOutParameter(1, java.sql.Types.VARCHAR);
			retornoConexion.setInt(2, Integer.parseInt(arreglo[0]));
			retornoConexion.setString(3, arreglo[1]);
			retornoConexion.setString(4, arreglo[2]);
			retornoConexion.setString(5, arreglo[3]);
			retornoConexion.setString(6, arreglo[4]);
			retornoConexion.setString(7, arreglo[5]);
			retornoConexion.setString(8, arreglo[6]);
			retornoConexion.setString(9, arreglo[7] );
			retornoConexion.setString(10,arreglo[8]);


           // Ejecutar la llamada a la función
			retornoConexion.execute();
			System.out.println("xi");
			String resultado = retornoConexion.getString(1);

			if(resultado != null){
				return resultado;
			}

			return null;

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
           // Cerrar los recursos en un bloque finally para asegurar su liberación
           try {
               if (retornoConexion != null) {
               	retornoConexion.close();
               }
               if (conexion != null) {
               	conexion.close();
               }
           } catch (SQLException e) {
               e.printStackTrace();
           }
       }
		return null;
	}



	//Verificar si el empleado enviado por parametro existe en la bd
	private String consultarEmpleados(String correo, String contrasenia) {
	    Connection conexion = Conexion.getConnection();
	    CallableStatement retornoConexion = null;

	    try {
	        // Llamar a la función utilizando un CallableStatement
	        retornoConexion = conexion.prepareCall("{? = call verificar_empleado(?, ?)}");

	        // Configurar los parámetros de entrada y salida de la función
	        retornoConexion.registerOutParameter(1, java.sql.Types.VARCHAR);
	        retornoConexion.setString(2, correo);
	        retornoConexion.setString(3, contrasenia);

	        // Ejecutar la llamada a la función
	        retornoConexion.execute();

	        // Obtener el resultado como un número
	        return retornoConexion.getString(1);

	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        // Cerrar los recursos en un bloque finally para asegurar su liberación
	        try {
	            if (retornoConexion != null) {
	                retornoConexion.close();
	            }
	            if (conexion != null) {
	                conexion.close();
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	    return null; // Manejo de errores, devolver un valor predeterminado
	}



	//obtener todos los empleados de la bd
	public String obtenerEmpleados() {
        Connection conexion = Conexion.getConnection();
        CallableStatement retornoConexion = null;

        try {
            // Llamar a la función utilizando un CallableStatement
            retornoConexion = conexion.prepareCall("{? = call obtener_todos_los_empleados}");

            // Configurar el parámetro de salida de la función
            retornoConexion.registerOutParameter(1, OracleTypes.CURSOR);

            // Ejecutar la llamada a la función
            retornoConexion.execute();

            // Obtener el resultado como un conjunto de resultados
            ResultSet resultSet = (ResultSet) retornoConexion.getObject(1);

            // Construir un StringBuilder para concatenar nombres de empleados
            StringBuilder nombresConcatenados = new StringBuilder();

            // Iterar sobre los resultados y concatenar nombres
            while (resultSet.next()) {
                String nombre = resultSet.getString("nombre");
                // Puedes obtener otros campos según sea necesario

                // Agregar el nombre al StringBuilder
                nombresConcatenados.append(nombre).append(", ");
            }

            // Eliminar la coma adicional al final y devolver el resultado
            return nombresConcatenados.length() > 0
                    ? nombresConcatenados.substring(0, nombresConcatenados.length() - 2)
                    : "";

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar los recursos en un bloque finally para asegurar su liberación
            try {
                if (retornoConexion != null) {
                    retornoConexion.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return ""; // Manejo de errores, devolver una cadena vacía o algún valor predeterminado
    }

	private void enviarMensaje(String mensaje) {
		flujoSalidaComunicacion.println(mensaje);
	}


	private void enviarMensajeResultSet(ResultSet mensaje1) {
		// TODO Auto-generated method stub

	}


}
