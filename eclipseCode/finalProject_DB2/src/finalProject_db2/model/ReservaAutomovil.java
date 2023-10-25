package finalProject_db2.model;

import java.util.Date;

public class ReservaAutomovil {
    private int codigo;
    private int codigoFacturaReservaAuto;
    private int codigoAuto;
    private double subtotal;
    private Date fechaRecogida;
    private Date fechaEntrega;
    private double precioPorDia;
    private int codigoCiudadRecogida;
    private int codigoCiudadEntrega;
    private int codigoEstadoReservaAuto;

    public ReservaAutomovil() {
		super();
	}

	public ReservaAutomovil(int codigo, int codigoFacturaReservaAuto, int codigoAuto, double subtotal,
			Date fechaRecogida, Date fechaEntrega, double precioPorDia, int codigoCiudadRecogida,
			int codigoCiudadEntrega, int codigoEstadoReservaAuto) {
		super();
		this.codigo = codigo;
		this.codigoFacturaReservaAuto = codigoFacturaReservaAuto;
		this.codigoAuto = codigoAuto;
		this.subtotal = subtotal;
		this.fechaRecogida = fechaRecogida;
		this.fechaEntrega = fechaEntrega;
		this.precioPorDia = precioPorDia;
		this.codigoCiudadRecogida = codigoCiudadRecogida;
		this.codigoCiudadEntrega = codigoCiudadEntrega;
		this.codigoEstadoReservaAuto = codigoEstadoReservaAuto;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getCodigoFacturaReservaAuto() {
		return codigoFacturaReservaAuto;
	}

	public void setCodigoFacturaReservaAuto(int codigoFacturaReservaAuto) {
		this.codigoFacturaReservaAuto = codigoFacturaReservaAuto;
	}

	public int getCodigoAuto() {
		return codigoAuto;
	}

	public void setCodigoAuto(int codigoAuto) {
		this.codigoAuto = codigoAuto;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	public Date getFechaRecogida() {
		return fechaRecogida;
	}

	public void setFechaRecogida(Date fechaRecogida) {
		this.fechaRecogida = fechaRecogida;
	}

	public Date getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public double getPrecioPorDia() {
		return precioPorDia;
	}

	public void setPrecioPorDia(double precioPorDia) {
		this.precioPorDia = precioPorDia;
	}

	public int getCodigoCiudadRecogida() {
		return codigoCiudadRecogida;
	}

	public void setCodigoCiudadRecogida(int codigoCiudadRecogida) {
		this.codigoCiudadRecogida = codigoCiudadRecogida;
	}

	public int getCodigoCiudadEntrega() {
		return codigoCiudadEntrega;
	}

	public void setCodigoCiudadEntrega(int codigoCiudadEntrega) {
		this.codigoCiudadEntrega = codigoCiudadEntrega;
	}

	public int getCodigoEstadoReservaAuto() {
		return codigoEstadoReservaAuto;
	}

	public void setCodigoEstadoReservaAuto(int codigoEstadoReservaAuto) {
		this.codigoEstadoReservaAuto = codigoEstadoReservaAuto;
	}

	@Override
	public String toString() {
		return "ReservaAutomovil [codigo=" + codigo + ", codigoFacturaReservaAuto=" + codigoFacturaReservaAuto
				+ ", codigoAuto=" + codigoAuto + ", subtotal=" + subtotal + ", fechaRecogida=" + fechaRecogida
				+ ", fechaEntrega=" + fechaEntrega + ", precioPorDia=" + precioPorDia + ", codigoCiudadRecogida="
				+ codigoCiudadRecogida + ", codigoCiudadEntrega=" + codigoCiudadEntrega + ", codigoEstadoReservaAuto="
				+ codigoEstadoReservaAuto + "]";
	}



}
