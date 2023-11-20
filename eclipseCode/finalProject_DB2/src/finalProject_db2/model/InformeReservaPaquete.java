package finalProject_db2.model;

import java.util.Date;

public class InformeReservaPaquete {
    private int codigo;
    private String descripcion;
    private Date fechaInforme;
    private int codigoEstadoReservaPaquete;
    private int codigoReservaPaquete;

    public InformeReservaPaquete() {
		super();
	}

	public InformeReservaPaquete(int codigo, String descripcion, Date fechaInforme, int codigoEstadoReservaPaquete,
			int codigoReservaPaquete) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.fechaInforme = fechaInforme;
		this.codigoEstadoReservaPaquete = codigoEstadoReservaPaquete;
		this.codigoReservaPaquete = codigoReservaPaquete;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFechaInforme() {
		return fechaInforme;
	}

	public void setFechaInforme(Date fechaInforme) {
		this.fechaInforme = fechaInforme;
	}

	public int getCodigoEstadoReservaPaquete() {
		return codigoEstadoReservaPaquete;
	}

	public void setCodigoEstadoReservaPaquete(int codigoEstadoReservaPaquete) {
		this.codigoEstadoReservaPaquete = codigoEstadoReservaPaquete;
	}

	public int getCodigoReservaPaquete() {
		return codigoReservaPaquete;
	}

	public void setCodigoReservaPaquete(int codigoReservaPaquete) {
		this.codigoReservaPaquete = codigoReservaPaquete;
	}

	@Override
	public String toString() {
		return "InformeReservaPaquete [codigo=" + codigo + ", descripcion=" + descripcion + ", fechaInforme="
				+ fechaInforme + ", codigoEstadoReservaPaquete=" + codigoEstadoReservaPaquete
				+ ", codigoReservaPaquete=" + codigoReservaPaquete + "]";
	}



}
