package finalProject_db2.model;

public class EstadoDetalleVentaArticulo {
    private int codigo;
    private String descripcion;

    public EstadoDetalleVentaArticulo() {
		super();
	}

	public EstadoDetalleVentaArticulo(int codigo, String descripcion) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "EstadoDetalleVentaArticulo [codigo=" + codigo + ", descripcion=" + descripcion + "]";
	}


}

