package finalProject_db2.model;

import java.time.LocalDate;
import java.util.Date;

public class EmpleadoModel {
    private int codigo;
    private String nombre;
    private String correo;
    private String password;
    private String telefono;
    private String estadoCivil;
    private String direccion;
    private LocalDate fechaNacimiento;
    private int codigoTipoEmpleado;

    public EmpleadoModel() {
		super();
	}

	public EmpleadoModel(int codigo, String nombre, String correo, String password, String telefono, String estadoCivil,
			String direccion, LocalDate fechaNacimiento, int codigoTipoEmpleado) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.correo = correo;
		this.password = password;
		this.telefono = telefono;
		this.estadoCivil = estadoCivil;
		this.direccion = direccion;
		this.fechaNacimiento = fechaNacimiento;
		this.codigoTipoEmpleado = codigoTipoEmpleado;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getCodigoTipoEmpleado() {
		return codigoTipoEmpleado;
	}

	public void setCodigoTipoEmpleado(int codigoTipoEmpleado) {
		this.codigoTipoEmpleado = codigoTipoEmpleado;
	}

	@Override
	public String toString() {
		return "Empleado [codigo=" + codigo + ", nombre=" + nombre + ", correo=" + correo + ", password=" + password
				+ ", telefono=" + telefono + ", estadoCivil=" + estadoCivil + ", direccion=" + direccion
				+ ", fechaNacimiento=" + fechaNacimiento + ", codigoTipoEmpleado=" + codigoTipoEmpleado + "]";
	}


}
