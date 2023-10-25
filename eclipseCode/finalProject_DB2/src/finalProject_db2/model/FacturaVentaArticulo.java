package finalProject_db2.model;

import java.util.Date;

public class FacturaVentaArticulo {
    private int codigo;
    private Date fechaVenta;
    private double montoTotal;
    private int paqueteCodigo;

    public FacturaVentaArticulo() {
		super();
	}

	public FacturaVentaArticulo(int codigo, Date fechaVenta, double montoTotal, int paqueteCodigo) {
		super();
		this.codigo = codigo;
		this.fechaVenta = fechaVenta;
		this.montoTotal = montoTotal;
		this.paqueteCodigo = paqueteCodigo;
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

	public int getPaqueteCodigo() {
		return paqueteCodigo;
	}

	public void setPaqueteCodigo(int paqueteCodigo) {
		this.paqueteCodigo = paqueteCodigo;
	}

	@Override
	public String toString() {
		return "FacturaVentaArticulo [codigo=" + codigo + ", fechaVenta=" + fechaVenta + ", montoTotal=" + montoTotal
				+ ", paqueteCodigo=" + paqueteCodigo + "]";
	}
}
