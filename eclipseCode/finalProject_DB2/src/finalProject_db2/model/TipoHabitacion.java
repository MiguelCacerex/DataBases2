package finalProject_db2.model;

public class TipoHabitacion {
    private int codigo;
    private String nombre;
    private String descripcion;
    
    public TipoHabitacion() {
		super();
	}

	public TipoHabitacion(int codigo, String nombre, String descripcion) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public int getCodigo() {
		return codigo;
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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "TipoHabitacion [codigo=" + codigo + ", nombre=" + nombre + ", descripcion=" + descripcion + "]";
	}
    
    
}
