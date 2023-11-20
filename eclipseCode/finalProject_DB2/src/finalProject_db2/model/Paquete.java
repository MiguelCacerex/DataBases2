package finalProject_db2.model;

import java.util.Date;

public class Paquete {

    private int codigo;
    private Date fecha;
    private double valorTotal;
    private int codigoTipoPaquete;
    private int cedulaCliente;

    public Paquete() {
		super();
	}

	public Paquete(int codigo, Date fecha, double valorTotal, int codigoTipoPaquete, int cedulaCliente) {
		super();
		this.codigo = codigo;
		this.fecha = fecha;
		this.valorTotal = valorTotal;
		this.codigoTipoPaquete = codigoTipoPaquete;
		this.cedulaCliente = cedulaCliente;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public int getCodigoTipoPaquete() {
		return codigoTipoPaquete;
	}

	public void setCodigoTipoPaquete(int codigoTipoPaquete) {
		this.codigoTipoPaquete = codigoTipoPaquete;
	}

	public int getCedulaCliente() {
		return cedulaCliente;
	}

	public void setCedulaCliente(int cedulaCliente) {
		this.cedulaCliente = cedulaCliente;
	}

	@Override
	public String toString() {
		return "Paquete [codigo=" + codigo + ", fecha=" + fecha + ", valorTotal=" + valorTotal + ", codigoTipoPaquete="
				+ codigoTipoPaquete + ", cedulaCliente=" + cedulaCliente + "]";
	}


}
