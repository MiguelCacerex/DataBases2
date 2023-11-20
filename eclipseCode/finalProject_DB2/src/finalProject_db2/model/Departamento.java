package finalProject_db2.model;

public class Departamento {

	private int codigo;
    private String nombre;
    private int codigoPais;

    public Departamento() {
		super();
	}

	public Departamento(int codigo, String nombre, int codigoPais) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.codigoPais = codigoPais;
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

	public int getCodigoPais() {
		return codigoPais;
	}

	public void setCodigoPais(int codigoPais) {
		this.codigoPais = codigoPais;
	}

	@Override
	public String toString() {
		return "Departamento [codigo=" + codigo + ", nombre=" + nombre + ", codigoPais=" + codigoPais + "]";
	}
}
