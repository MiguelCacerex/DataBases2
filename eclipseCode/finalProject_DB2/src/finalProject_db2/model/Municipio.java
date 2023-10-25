package finalProject_db2.model;

public class Municipio {
    private int codigo;
    private String nombre;
    private int codigoDepartamento;
	
    public Municipio() {
		super();
	}

	public Municipio(int codigo, String nombre, int codigoDepartamento) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.codigoDepartamento = codigoDepartamento;
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

	public int getCodigoDepartamento() {
		return codigoDepartamento;
	}

	public void setCodigoDepartamento(int codigoDepartamento) {
		this.codigoDepartamento = codigoDepartamento;
	}

	@Override
	public String toString() {
		return "Municipio [codigo=" + codigo + ", nombre=" + nombre + ", codigoDepartamento=" + codigoDepartamento
				+ "]";
	}
    
    
}
