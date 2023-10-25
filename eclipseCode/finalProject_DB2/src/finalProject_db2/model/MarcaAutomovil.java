package finalProject_db2.model;

public class MarcaAutomovil {
    private int codigo;
    private String descripcion;

    public MarcaAutomovil() {
		super();
	}

	public MarcaAutomovil(int codigo, String descripcion) {
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
		return "MarcaAutomovil [codigo=" + codigo + ", descripcion=" + descripcion + "]";
	}
}
