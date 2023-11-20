package finalProject_db2.model;

import java.util.Date;

public class InformeReservaHospedaje {
    private int codigo;
    private String descripcion;
    private Date fechaInforme;
    private int codigoEstadoServicioHospedaje;
    private int codigoDetalleReserva;

    public InformeReservaHospedaje() {
		super();
	}

	public InformeReservaHospedaje(int codigo, String descripcion, Date fechaInforme, int codigoEstadoServicioHospedaje,
			int codigoDetalleReserva) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.fechaInforme = fechaInforme;
		this.codigoEstadoServicioHospedaje = codigoEstadoServicioHospedaje;
		this.codigoDetalleReserva = codigoDetalleReserva;
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

	public int getCodigoEstadoServicioHospedaje() {
		return codigoEstadoServicioHospedaje;
	}

	public void setCodigoEstadoServicioHospedaje(int codigoEstadoServicioHospedaje) {
		this.codigoEstadoServicioHospedaje = codigoEstadoServicioHospedaje;
	}

	public int getCodigoDetalleReserva() {
		return codigoDetalleReserva;
	}

	public void setCodigoDetalleReserva(int codigoDetalleReserva) {
		this.codigoDetalleReserva = codigoDetalleReserva;
	}

	@Override
	public String toString() {
		return "InformeReservaHospedaje [codigo=" + codigo + ", descripcion=" + descripcion + ", fechaInforme="
				+ fechaInforme + ", codigoEstadoServicioHospedaje=" + codigoEstadoServicioHospedaje
				+ ", codigoDetalleReserva=" + codigoDetalleReserva + "]";
	}


}
