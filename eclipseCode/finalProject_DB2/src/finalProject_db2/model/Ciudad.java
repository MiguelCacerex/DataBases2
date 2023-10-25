package finalProject_db2.model;

public class Ciudad {

	private int codigo;
    private String nombre;
    private int codigoMunicipio;

    public Ciudad() {
		super();
	}

	public Ciudad(int codigo, String nombre, int codigoMunicipio) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.codigoMunicipio = codigoMunicipio;
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

	public int getCodigoMunicipio() {
		return codigoMunicipio;
	}

	public void setCodigoMunicipio(int codigoMunicipio) {
		this.codigoMunicipio = codigoMunicipio;
	}

	@Override
	public String toString() {
		return "Ciudad [codigo=" + codigo + ", nombre=" + nombre + ", codigoMunicipio=" + codigoMunicipio + "]";
	}
}
