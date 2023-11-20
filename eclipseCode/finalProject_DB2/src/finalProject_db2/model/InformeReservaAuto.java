package finalProject_db2.model;

import java.util.Date;

public class InformeReservaAuto {
    private int codigo;
    private String descripcion;
    private Date fechaInforme;
    private int codigoEstadoReservaAuto;
    private int codigoReservaAuto;

    public InformeReservaAuto() {
		super();
	}

	public InformeReservaAuto(int codigo, String descripcion, Date fechaInforme, int codigoEstadoReservaAuto,
			int codigoReservaAuto) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.fechaInforme = fechaInforme;
		this.codigoEstadoReservaAuto = codigoEstadoReservaAuto;
		this.codigoReservaAuto = codigoReservaAuto;
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

	public int getCodigoEstadoReservaAuto() {
		return codigoEstadoReservaAuto;
	}

	public void setCodigoEstadoReservaAuto(int codigoEstadoReservaAuto) {
		this.codigoEstadoReservaAuto = codigoEstadoReservaAuto;
	}

	public int getCodigoReservaAuto() {
		return codigoReservaAuto;
	}

	public void setCodigoReservaAuto(int codigoReservaAuto) {
		this.codigoReservaAuto = codigoReservaAuto;
	}

	@Override
	public String toString() {
		return "InformeReservaAuto [codigo=" + codigo + ", descripcion=" + descripcion + ", fechaInforme="
				+ fechaInforme + ", codigoEstadoReservaAuto=" + codigoEstadoReservaAuto + ", codigoReservaAuto="
				+ codigoReservaAuto + "]";
	}


}
