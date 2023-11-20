package finalProject_db2.model;

public class GamaAutomovil {
    private int codigo;
    private String descripcion;

    public GamaAutomovil() {
		super();
	}

	public GamaAutomovil(int codigo, String descripcion) {
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
		return "GamaAutomovil [codigo=" + codigo + ", descripcion=" + descripcion + "]";
	}


}
