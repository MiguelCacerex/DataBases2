package finalProject_db2.model;

public class ReservaPaqueteTuristico {
    private int codigo;
    private int codigoFacturaPaqueteTuristico;
    private int codigoPaqueteTuristico;
    private double porcentajeDescuento;
    private double subtotal;
    private int numeroPersonas;
    private double precioPorPersona;
    private int codigoHorarioPaquete;
    private int codigoEstadoReservaPaquete;

    public ReservaPaqueteTuristico() {
		super();
	}

	public ReservaPaqueteTuristico(int codigo, int codigoFacturaPaqueteTuristico, int codigoPaqueteTuristico,
			double porcentajeDescuento, double subtotal, int numeroPersonas, double precioPorPersona,
			int codigoHorarioPaquete, int codigoEstadoReservaPaquete) {
		super();
		this.codigo = codigo;
		this.codigoFacturaPaqueteTuristico = codigoFacturaPaqueteTuristico;
		this.codigoPaqueteTuristico = codigoPaqueteTuristico;
		this.porcentajeDescuento = porcentajeDescuento;
		this.subtotal = subtotal;
		this.numeroPersonas = numeroPersonas;
		this.precioPorPersona = precioPorPersona;
		this.codigoHorarioPaquete = codigoHorarioPaquete;
		this.codigoEstadoReservaPaquete = codigoEstadoReservaPaquete;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getCodigoFacturaPaqueteTuristico() {
		return codigoFacturaPaqueteTuristico;
	}

	public void setCodigoFacturaPaqueteTuristico(int codigoFacturaPaqueteTuristico) {
		this.codigoFacturaPaqueteTuristico = codigoFacturaPaqueteTuristico;
	}

	public int getCodigoPaqueteTuristico() {
		return codigoPaqueteTuristico;
	}

	public void setCodigoPaqueteTuristico(int codigoPaqueteTuristico) {
		this.codigoPaqueteTuristico = codigoPaqueteTuristico;
	}

	public double getPorcentajeDescuento() {
		return porcentajeDescuento;
	}

	public void setPorcentajeDescuento(double porcentajeDescuento) {
		this.porcentajeDescuento = porcentajeDescuento;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	public int getNumeroPersonas() {
		return numeroPersonas;
	}

	public void setNumeroPersonas(int numeroPersonas) {
		this.numeroPersonas = numeroPersonas;
	}

	public double getPrecioPorPersona() {
		return precioPorPersona;
	}

	public void setPrecioPorPersona(double precioPorPersona) {
		this.precioPorPersona = precioPorPersona;
	}

	public int getCodigoHorarioPaquete() {
		return codigoHorarioPaquete;
	}

	public void setCodigoHorarioPaquete(int codigoHorarioPaquete) {
		this.codigoHorarioPaquete = codigoHorarioPaquete;
	}

	public int getCodigoEstadoReservaPaquete() {
		return codigoEstadoReservaPaquete;
	}

	public void setCodigoEstadoReservaPaquete(int codigoEstadoReservaPaquete) {
		this.codigoEstadoReservaPaquete = codigoEstadoReservaPaquete;
	}

	@Override
	public String toString() {
		return "ReservaPaqueteTuristico [codigo=" + codigo + ", codigoFacturaPaqueteTuristico="
				+ codigoFacturaPaqueteTuristico + ", codigoPaqueteTuristico=" + codigoPaqueteTuristico
				+ ", porcentajeDescuento=" + porcentajeDescuento + ", subtotal=" + subtotal + ", numeroPersonas="
				+ numeroPersonas + ", precioPorPersona=" + precioPorPersona + ", codigoHorarioPaquete="
				+ codigoHorarioPaquete + ", codigoEstadoReservaPaquete=" + codigoEstadoReservaPaquete + "]";
	}


}
