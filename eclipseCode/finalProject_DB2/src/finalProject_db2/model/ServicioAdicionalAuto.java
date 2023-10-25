package finalProject_db2.model;

public class ServicioAdicionalAuto {
    private int codigoServicioAuto;
    private int codigoAuto;
    private int codigoServicio;
	
    public ServicioAdicionalAuto() {
		super();
	}

	public ServicioAdicionalAuto(int codigoServicioAuto, int codigoAuto, int codigoServicio) {
		super();
		this.codigoServicioAuto = codigoServicioAuto;
		this.codigoAuto = codigoAuto;
		this.codigoServicio = codigoServicio;
	}

	public int getCodigoServicioAuto() {
		return codigoServicioAuto;
	}

	public void setCodigoServicioAuto(int codigoServicioAuto) {
		this.codigoServicioAuto = codigoServicioAuto;
	}

	public int getCodigoAuto() {
		return codigoAuto;
	}

	public void setCodigoAuto(int codigoAuto) {
		this.codigoAuto = codigoAuto;
	}

	public int getCodigoServicio() {
		return codigoServicio;
	}

	public void setCodigoServicio(int codigoServicio) {
		this.codigoServicio = codigoServicio;
	}

	@Override
	public String toString() {
		return "ServicioAdicionalAuto [codigoServicioAuto=" + codigoServicioAuto + ", codigoAuto=" + codigoAuto
				+ ", codigoServicio=" + codigoServicio + "]";
	}
    
    
}

