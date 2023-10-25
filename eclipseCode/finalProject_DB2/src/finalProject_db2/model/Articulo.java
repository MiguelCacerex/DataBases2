package finalProject_db2.model;

public class Articulo {
    private int codigo;
    private int codigoTipoArticulo;
    private String nombre;
    private String descripcion;
    private double precio;
    private double unidadesStock;
    private String urlImagen;
    private int estadoArticuloCodigo;

	public Articulo() {
		super();
	}

	public Articulo(int codigo, int codigoTipoArticulo, String nombre, String descripcion, double precio,
			double unidadesStock, String urlImagen, int estadoArticuloCodigo) {
		super();
		this.codigo = codigo;
		this.codigoTipoArticulo = codigoTipoArticulo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.unidadesStock = unidadesStock;
		this.urlImagen = urlImagen;
		this.estadoArticuloCodigo = estadoArticuloCodigo;
	}

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getCodigoTipoArticulo() {
		return codigoTipoArticulo;
	}
	public void setCodigoTipoArticulo(int codigoTipoArticulo) {
		this.codigoTipoArticulo = codigoTipoArticulo;
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
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getUnidadesStock() {
		return unidadesStock;
	}
	public void setUnidadesStock(double unidadesStock) {
		this.unidadesStock = unidadesStock;
	}
	public String getUrlImagen() {
		return urlImagen;
	}
	public void setUrlImagen(String urlImagen) {
		this.urlImagen = urlImagen;
	}
	public int getEstadoArticuloCodigo() {
		return estadoArticuloCodigo;
	}
	public void setEstadoArticuloCodigo(int estadoArticuloCodigo) {
		this.estadoArticuloCodigo = estadoArticuloCodigo;
	}
	@Override
	public String toString() {
		return "Articulo [codigo=" + codigo + ", codigoTipoArticulo=" + codigoTipoArticulo + ", nombre=" + nombre
				+ ", descripcion=" + descripcion + ", precio=" + precio + ", unidadesStock=" + unidadesStock
				+ ", urlImagen=" + urlImagen + ", estadoArticuloCodigo=" + estadoArticuloCodigo + "]";
	}

}
