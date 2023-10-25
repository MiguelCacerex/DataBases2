package finalProject_db2.model;


public class HorarioPaquete {
    private int codigo;
    private String dia;
    private String horaInicio;
    private String horaFin;
    private int codigoPaqueteTuristico;

    public HorarioPaquete() {
		super();
	}

	public HorarioPaquete(int codigo, String dia, String horaInicio, String horaFin, int codigoPaqueteTuristico) {
		super();
		this.codigo = codigo;
		this.dia = dia;
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
		this.codigoPaqueteTuristico = codigoPaqueteTuristico;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}

	public String getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(String horaFin) {
		this.horaFin = horaFin;
	}

	public int getCodigoPaqueteTuristico() {
		return codigoPaqueteTuristico;
	}

	public void setCodigoPaqueteTuristico(int codigoPaqueteTuristico) {
		this.codigoPaqueteTuristico = codigoPaqueteTuristico;
	}

	@Override
	public String toString() {
		return "HorarioPaquete [codigo=" + codigo + ", dia=" + dia + ", horaInicio=" + horaInicio + ", horaFin="
				+ horaFin + ", codigoPaqueteTuristico=" + codigoPaqueteTuristico + "]";
	}



}
