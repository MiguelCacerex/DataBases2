package finalProject_db2.model;

import java.util.Date;

public class FacturaReservaHospedaje {
    private int codigo;
    private Date fechaVenta;
    private double montoTotal;
    private int codigoPaquete;

    public FacturaReservaHospedaje() {
		super();
	}

	public FacturaReservaHospedaje(int codigo, Date fechaVenta, double montoTotal, int codigoPaquete) {
		super();
		this.codigo = codigo;
		this.fechaVenta = fechaVenta;
		this.montoTotal = montoTotal;
		this.codigoPaquete = codigoPaquete;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Date getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(Date fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	public double getMontoTotal() {
		return montoTotal;
	}

	public void setMontoTotal(double montoTotal) {
		this.montoTotal = montoTotal;
	}

	public int getCodigoPaquete() {
		return codigoPaquete;
	}

	public void setCodigoPaquete(int codigoPaquete) {
		this.codigoPaquete = codigoPaquete;
	}

	@Override
	public String toString() {
		return "FacturaReservaHospedaje [codigo=" + codigo + ", fechaVenta=" + fechaVenta + ", montoTotal=" + montoTotal
				+ ", codigoPaquete=" + codigoPaquete + "]";
	}
}
