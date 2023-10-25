package finalProject_db2.model;

public class Automovil {
    private int codigo;
    private String placa;
    private int numPuestos;
    private double precioRentaDia;
    private String color;
    private String urlImagen;
    private double capacidadCarga;
    private String tipoCombustible;
    private int codigoTipoAuto;
    private int codigoGamaAuto;
    private int codigoMarcaAuto;
    private int codigoEstadoAuto;

	public Automovil() {
		super();
	}

	public Automovil(int codigo, String placa, int numPuestos, double precioRentaDia, String color, String urlImagen,
			double capacidadCarga, String tipoCombustible, int codigoTipoAuto, int codigoGamaAuto, int codigoMarcaAuto,
			int codigoEstadoAuto) {
		super();
		this.codigo = codigo;
		this.placa = placa;
		this.numPuestos = numPuestos;
		this.precioRentaDia = precioRentaDia;
		this.color = color;
		this.urlImagen = urlImagen;
		this.capacidadCarga = capacidadCarga;
		this.tipoCombustible = tipoCombustible;
		this.codigoTipoAuto = codigoTipoAuto;
		this.codigoGamaAuto = codigoGamaAuto;
		this.codigoMarcaAuto = codigoMarcaAuto;
		this.codigoEstadoAuto = codigoEstadoAuto;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getNumPuestos() {
		return numPuestos;
	}

	public void setNumPuestos(int numPuestos) {
		this.numPuestos = numPuestos;
	}

	public double getPrecioRentaDia() {
		return precioRentaDia;
	}

	public void setPrecioRentaDia(double precioRentaDia) {
		this.precioRentaDia = precioRentaDia;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getUrlImagen() {
		return urlImagen;
	}

	public void setUrlImagen(String urlImagen) {
		this.urlImagen = urlImagen;
	}

	public double getCapacidadCarga() {
		return capacidadCarga;
	}

	public void setCapacidadCarga(double capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}

	public String getTipoCombustible() {
		return tipoCombustible;
	}

	public void setTipoCombustible(String tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}

	public int getCodigoTipoAuto() {
		return codigoTipoAuto;
	}

	public void setCodigoTipoAuto(int codigoTipoAuto) {
		this.codigoTipoAuto = codigoTipoAuto;
	}

	public int getCodigoGamaAuto() {
		return codigoGamaAuto;
	}

	public void setCodigoGamaAuto(int codigoGamaAuto) {
		this.codigoGamaAuto = codigoGamaAuto;
	}

	public int getCodigoMarcaAuto() {
		return codigoMarcaAuto;
	}

	public void setCodigoMarcaAuto(int codigoMarcaAuto) {
		this.codigoMarcaAuto = codigoMarcaAuto;
	}

	public int getCodigoEstadoAuto() {
		return codigoEstadoAuto;
	}

	public void setCodigoEstadoAuto(int codigoEstadoAuto) {
		this.codigoEstadoAuto = codigoEstadoAuto;
	}

	@Override
	public String toString() {
		return "Automovil [codigo=" + codigo + ", placa=" + placa + ", numPuestos=" + numPuestos + ", precioRentaDia="
				+ precioRentaDia + ", color=" + color + ", urlImagen=" + urlImagen + ", capacidadCarga="
				+ capacidadCarga + ", tipoCombustible=" + tipoCombustible + ", codigoTipoAuto=" + codigoTipoAuto
				+ ", codigoGamaAuto=" + codigoGamaAuto + ", codigoMarcaAuto=" + codigoMarcaAuto + ", codigoEstadoAuto="
				+ codigoEstadoAuto + "]";
	}
}
