package finalProject_db2.model;

public class TipoPaquete {
    private int codigo;
    private String descripcion;
    private String nombre;

    public TipoPaquete() {
		super();
	}

	public TipoPaquete(int codigo, String descripcion, String nombre) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.nombre = nombre;
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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "TipoPaquete [codigo=" + codigo + ", descripcion=" + descripcion + ", nombre=" + nombre + "]";
	}


}
