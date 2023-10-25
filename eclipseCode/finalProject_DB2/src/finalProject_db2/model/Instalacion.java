package finalProject_db2.model;

public class Instalacion {
    private int codigo;
    private int codigoHotel;
    private String nombre;
    private String descripcion;
    private String urlImagen;
    private int codigoTipoInstalacion;

    public Instalacion() {
		super();
	}

	public Instalacion(int codigo, int codigoHotel, String nombre, String descripcion, String urlImagen,
			int codigoTipoInstalacion) {
		super();
		this.codigo = codigo;
		this.codigoHotel = codigoHotel;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.urlImagen = urlImagen;
		this.codigoTipoInstalacion = codigoTipoInstalacion;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getCodigoHotel() {
		return codigoHotel;
	}

	public void setCodigoHotel(int codigoHotel) {
		this.codigoHotel = codigoHotel;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getUrlImagen() {
		return urlImagen;
	}

	public void setUrlImagen(String urlImagen) {
		this.urlImagen = urlImagen;
	}

	public int getCodigoTipoInstalacion() {
		return codigoTipoInstalacion;
	}

	public void setCodigoTipoInstalacion(int codigoTipoInstalacion) {
		this.codigoTipoInstalacion = codigoTipoInstalacion;
	}

	@Override
	public String toString() {
		return "Instalacion [codigo=" + codigo + ", codigoHotel=" + codigoHotel + ", nombre=" + nombre
				+ ", descripcion=" + descripcion + ", urlImagen=" + urlImagen + ", codigoTipoInstalacion="
				+ codigoTipoInstalacion + "]";
	}


}
