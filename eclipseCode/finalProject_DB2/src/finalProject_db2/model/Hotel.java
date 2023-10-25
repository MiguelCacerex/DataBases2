package finalProject_db2.model;

public class Hotel {
    private int codigo;
    private String nombre;
    private String correo;
    private String telefono;
    private String direccion;
    private String urlImagen;
    private int codigoCiudad;
    private int codigoTipoHotel;

    public int getCodigo() {
		return codigo;
	}

	public Hotel(int codigo, String nombre, String correo, String telefono, String direccion, String urlImagen,
			int codigoCiudad, int codigoTipoHotel) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.correo = correo;
		this.telefono = telefono;
		this.direccion = direccion;
		this.urlImagen = urlImagen;
		this.codigoCiudad = codigoCiudad;
		this.codigoTipoHotel = codigoTipoHotel;
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
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getUrlImagen() {
		return urlImagen;
	}
	public void setUrlImagen(String urlImagen) {
		this.urlImagen = urlImagen;
	}
	public int getCodigoCiudad() {
		return codigoCiudad;
	}
	public void setCodigoCiudad(int codigoCiudad) {
		this.codigoCiudad = codigoCiudad;
	}
	public int getCodigoTipoHotel() {
		return codigoTipoHotel;
	}
	public void setCodigoTipoHotel(int codigoTipoHotel) {
		this.codigoTipoHotel = codigoTipoHotel;
	}
	@Override
	public String toString() {
		return "Hotel [codigo=" + codigo + ", nombre=" + nombre + ", correo=" + correo + ", telefono=" + telefono
				+ ", direccion=" + direccion + ", urlImagen=" + urlImagen + ", codigoCiudad=" + codigoCiudad
				+ ", codigoTipoHotel=" + codigoTipoHotel + "]";
	}


}
