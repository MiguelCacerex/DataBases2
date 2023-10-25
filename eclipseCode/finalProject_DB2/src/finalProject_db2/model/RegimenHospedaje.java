package finalProject_db2.model;

public class RegimenHospedaje {
    private int codigo;
    private String nombre;
    private String descripcion;
    private double precioIncremento;

    public RegimenHospedaje() {
		super();
	}

	public RegimenHospedaje(int codigo, String nombre, String descripcion, double precioIncremento) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precioIncremento = precioIncremento;
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

	public double getPrecioIncremento() {
		return precioIncremento;
	}

	public void setPrecioIncremento(double precioIncremento) {
		this.precioIncremento = precioIncremento;
	}

	@Override
	public String toString() {
		return "RegimenHospedaje [codigo=" + codigo + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ ", precioIncremento=" + precioIncremento + "]";
	}



}
