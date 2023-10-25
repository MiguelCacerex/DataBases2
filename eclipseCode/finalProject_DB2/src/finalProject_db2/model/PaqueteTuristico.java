package finalProject_db2.model;

public class PaqueteTuristico {

	private int codigo;
    private int codigoTipoPaquete;
    private int codigoProveedor;
    private String descripcion;
    private double precioPorPersona;
    private int codigoCiudad;
    private String urlImg;

    public PaqueteTuristico() {
		super();
	}

	public PaqueteTuristico(int codigo, int codigoTipoPaquete, int codigoProveedor, String descripcion,
			double precioPorPersona, int codigoCiudad, String urlImg) {
		super();
		this.codigo = codigo;
		this.codigoTipoPaquete = codigoTipoPaquete;
		this.codigoProveedor = codigoProveedor;
		this.descripcion = descripcion;
		this.precioPorPersona = precioPorPersona;
		this.codigoCiudad = codigoCiudad;
		this.urlImg = urlImg;
	}



	public String getUrlImg() {
		return urlImg;
	}

	public void setUrlImg(String urlImg) {
		this.urlImg = urlImg;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getCodigoTipoPaquete() {
		return codigoTipoPaquete;
	}

	public void setCodigoTipoPaquete(int codigoTipoPaquete) {
		this.codigoTipoPaquete = codigoTipoPaquete;
	}

	public int getCodigoProveedor() {
		return codigoProveedor;
	}

	public void setCodigoProveedor(int codigoProveedor) {
		this.codigoProveedor = codigoProveedor;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecioPorPersona() {
		return precioPorPersona;
	}

	public void setPrecioPorPersona(double precioPorPersona) {
		this.precioPorPersona = precioPorPersona;
	}

	public int getCodigoCiudad() {
		return codigoCiudad;
	}

	public void setCodigoCiudad(int codigoCiudad) {
		this.codigoCiudad = codigoCiudad;
	}

	@Override
	public String toString() {
		return "PaqueteTuristico [codigo=" + codigo + ", codigoTipoPaquete=" + codigoTipoPaquete + ", codigoProveedor="
				+ codigoProveedor + ", descripcion=" + descripcion + ", precioPorPersona=" + precioPorPersona
				+ ", codigoCiudad=" + codigoCiudad + "]";
	}
}
