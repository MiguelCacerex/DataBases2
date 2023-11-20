package finalProject_db2.model;

public class ServicioAutoReservado {

	private int codigo;
    private int codigoServicioReservado;
    private int codigoReservaAuto;

    public ServicioAutoReservado() {
		super();
	}

	public ServicioAutoReservado(int codigo, int codigoServicioReservado, int codigoReservaAuto) {
		super();
		this.codigo = codigo;
		this.codigoServicioReservado = codigoServicioReservado;
		this.codigoReservaAuto = codigoReservaAuto;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getCodigoServicioReservado() {
		return codigoServicioReservado;
	}

	public void setCodigoServicioReservado(int codigoServicioReservado) {
		this.codigoServicioReservado = codigoServicioReservado;
	}

	public int getCodigoReservaAuto() {
		return codigoReservaAuto;
	}

	public void setCodigoReservaAuto(int codigoReservaAuto) {
		this.codigoReservaAuto = codigoReservaAuto;
	}

	@Override
	public String toString() {
		return "ServicioAutoReservado [codigo=" + codigo + ", codigoServicioReservado=" + codigoServicioReservado
				+ ", codigoReservaAuto=" + codigoReservaAuto + "]";
	}
}
