package finalProject_db2.model;

public class Huesped {
    private String correo;
    private String nombre;
    private String apellido;
    private String telefono;
    private int codigoDetalleReservaHospedaje;

    public Huesped() {
		super();
	}

	public Huesped(String correo, String nombre, String apellido, String telefono, int codigoDetalleReservaHospedaje) {
		super();
		this.correo = correo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.codigoDetalleReservaHospedaje = codigoDetalleReservaHospedaje;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public int getCodigoDetalleReservaHospedaje() {
		return codigoDetalleReservaHospedaje;
	}

	public void setCodigoDetalleReservaHospedaje(int codigoDetalleReservaHospedaje) {
		this.codigoDetalleReservaHospedaje = codigoDetalleReservaHospedaje;
	}

	@Override
	public String toString() {
		return "Huesped [correo=" + correo + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono
				+ ", codigoDetalleReservaHospedaje=" + codigoDetalleReservaHospedaje + "]";
	}


}
