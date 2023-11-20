package finalProject_db2.model;

public class EstadoAutomovil {
    private String descripcion;
    private int codigo;

    public EstadoAutomovil() {
		super();
	}

	public EstadoAutomovil(String descripcion, int codigo) {
		super();
		this.descripcion = descripcion;
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "EstadoAutomovil [descripcion=" + descripcion + ", codigo=" + codigo + "]";
	}
}
