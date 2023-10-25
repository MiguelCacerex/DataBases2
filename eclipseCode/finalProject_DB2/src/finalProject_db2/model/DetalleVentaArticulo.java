package finalProject_db2.model;

public class DetalleVentaArticulo {
    private String codigo;
    private int codigoFvArticulo;
    private int codigoArticulo;
    private double precioUnidad;
    private int numUnidades;
    private double subtotal;
    private int codigoEstadoDetalleArticulo;

    public DetalleVentaArticulo() {
		super();
	}

	public DetalleVentaArticulo(String codigo, int codigoFvArticulo, int codigoArticulo, double precioUnidad,
			int numUnidades, double subtotal, int codigoEstadoDetalleArticulo) {
		super();
		this.codigo = codigo;
		this.codigoFvArticulo = codigoFvArticulo;
		this.codigoArticulo = codigoArticulo;
		this.precioUnidad = precioUnidad;
		this.numUnidades = numUnidades;
		this.subtotal = subtotal;
		this.codigoEstadoDetalleArticulo = codigoEstadoDetalleArticulo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getCodigoFvArticulo() {
		return codigoFvArticulo;
	}

	public void setCodigoFvArticulo(int codigoFvArticulo) {
		this.codigoFvArticulo = codigoFvArticulo;
	}

	public int getCodigoArticulo() {
		return codigoArticulo;
	}

	public void setCodigoArticulo(int codigoArticulo) {
		this.codigoArticulo = codigoArticulo;
	}

	public double getPrecioUnidad() {
		return precioUnidad;
	}

	public void setPrecioUnidad(double precioUnidad) {
		this.precioUnidad = precioUnidad;
	}

	public int getNumUnidades() {
		return numUnidades;
	}

	public void setNumUnidades(int numUnidades) {
		this.numUnidades = numUnidades;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	public int getCodigoEstadoDetalleArticulo() {
		return codigoEstadoDetalleArticulo;
	}

	public void setCodigoEstadoDetalleArticulo(int codigoEstadoDetalleArticulo) {
		this.codigoEstadoDetalleArticulo = codigoEstadoDetalleArticulo;
	}

	@Override
	public String toString() {
		return "DetalleVentaArticulo [codigo=" + codigo + ", codigoFvArticulo=" + codigoFvArticulo + ", codigoArticulo="
				+ codigoArticulo + ", precioUnidad=" + precioUnidad + ", numUnidades=" + numUnidades + ", subtotal="
				+ subtotal + ", codigoEstadoDetalleArticulo=" + codigoEstadoDetalleArticulo + "]";
	}
}
