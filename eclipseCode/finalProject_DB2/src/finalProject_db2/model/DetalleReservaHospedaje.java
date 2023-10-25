package finalProject_db2.model;

import java.util.Date;

public class DetalleReservaHospedaje {
    private int codigo;
    private int codigoFr;
    private int codigoRegimen;
    private Date fechaCheckIn;
    private Date fechaCheckOut;
    private double precioNoche;
    private double precioIncremento;
    private double subtotal;
    private int codigoHotel;
    private String codigoHabitacion;
    private int codigoEstadoReserva;

    public DetalleReservaHospedaje() {
		super();
	}

	public DetalleReservaHospedaje(int codigo, int codigoFr, int codigoRegimen, Date fechaCheckIn, Date fechaCheckOut,
			double precioNoche, double precioIncremento, double subtotal, int codigoHotel, String codigoHabitacion,
			int codigoEstadoReserva) {
		super();
		this.codigo = codigo;
		this.codigoFr = codigoFr;
		this.codigoRegimen = codigoRegimen;
		this.fechaCheckIn = fechaCheckIn;
		this.fechaCheckOut = fechaCheckOut;
		this.precioNoche = precioNoche;
		this.precioIncremento = precioIncremento;
		this.subtotal = subtotal;
		this.codigoHotel = codigoHotel;
		this.codigoHabitacion = codigoHabitacion;
		this.codigoEstadoReserva = codigoEstadoReserva;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getCodigoFr() {
		return codigoFr;
	}

	public void setCodigoFr(int codigoFr) {
		this.codigoFr = codigoFr;
	}

	public int getCodigoRegimen() {
		return codigoRegimen;
	}

	public void setCodigoRegimen(int codigoRegimen) {
		this.codigoRegimen = codigoRegimen;
	}

	public Date getFechaCheckIn() {
		return fechaCheckIn;
	}

	public void setFechaCheckIn(Date fechaCheckIn) {
		this.fechaCheckIn = fechaCheckIn;
	}

	public Date getFechaCheckOut() {
		return fechaCheckOut;
	}

	public void setFechaCheckOut(Date fechaCheckOut) {
		this.fechaCheckOut = fechaCheckOut;
	}

	public double getPrecioNoche() {
		return precioNoche;
	}

	public void setPrecioNoche(double precioNoche) {
		this.precioNoche = precioNoche;
	}

	public double getPrecioIncremento() {
		return precioIncremento;
	}

	public void setPrecioIncremento(double precioIncremento) {
		this.precioIncremento = precioIncremento;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	public int getCodigoHotel() {
		return codigoHotel;
	}

	public void setCodigoHotel(int codigoHotel) {
		this.codigoHotel = codigoHotel;
	}

	public String getCodigoHabitacion() {
		return codigoHabitacion;
	}

	public void setCodigoHabitacion(String codigoHabitacion) {
		this.codigoHabitacion = codigoHabitacion;
	}

	public int getCodigoEstadoReserva() {
		return codigoEstadoReserva;
	}

	public void setCodigoEstadoReserva(int codigoEstadoReserva) {
		this.codigoEstadoReserva = codigoEstadoReserva;
	}

	@Override
	public String toString() {
		return "DetalleReservaHospedaje [codigo=" + codigo + ", codigoFr=" + codigoFr + ", codigoRegimen="
				+ codigoRegimen + ", fechaCheckIn=" + fechaCheckIn + ", fechaCheckOut=" + fechaCheckOut
				+ ", precioNoche=" + precioNoche + ", precioIncremento=" + precioIncremento + ", subtotal=" + subtotal
				+ ", codigoHotel=" + codigoHotel + ", codigoHabitacion=" + codigoHabitacion + ", codigoEstadoReserva="
				+ codigoEstadoReserva + "]";
	}
}
