package finalProject_db2.model;

public class Habitacion {
    private String codigo;
    private int codigoHotel;
    private int codigoTipoHabitacion;
    private int numCuartos;
    private int capacidad;
    private double precioNoche;
    private String urlImagen;
    private int codigoEstadoHabitacion;
    private int codigoNivelHabitacion;

    public Habitacion() {
		super();
	}

	public Habitacion(String codigo, int codigoHotel, int codigoTipoHabitacion, int numCuartos, int capacidad,
			double precioNoche, String urlImagen, int codigoEstadoHabitacion, int codigoNivelHabitacion) {
		super();
		this.codigo = codigo;
		this.codigoHotel = codigoHotel;
		this.codigoTipoHabitacion = codigoTipoHabitacion;
		this.numCuartos = numCuartos;
		this.capacidad = capacidad;
		this.precioNoche = precioNoche;
		this.urlImagen = urlImagen;
		this.codigoEstadoHabitacion = codigoEstadoHabitacion;
		this.codigoNivelHabitacion = codigoNivelHabitacion;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getCodigoHotel() {
		return codigoHotel;
	}

	public void setCodigoHotel(int codigoHotel) {
		this.codigoHotel = codigoHotel;
	}

	public int getCodigoTipoHabitacion() {
		return codigoTipoHabitacion;
	}

	public void setCodigoTipoHabitacion(int codigoTipoHabitacion) {
		this.codigoTipoHabitacion = codigoTipoHabitacion;
	}

	public int getNumCuartos() {
		return numCuartos;
	}

	public void setNumCuartos(int numCuartos) {
		this.numCuartos = numCuartos;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public double getPrecioNoche() {
		return precioNoche;
	}

	public void setPrecioNoche(double precioNoche) {
		this.precioNoche = precioNoche;
	}

	public String getUrlImagen() {
		return urlImagen;
	}

	public void setUrlImagen(String urlImagen) {
		this.urlImagen = urlImagen;
	}

	public int getCodigoEstadoHabitacion() {
		return codigoEstadoHabitacion;
	}

	public void setCodigoEstadoHabitacion(int codigoEstadoHabitacion) {
		this.codigoEstadoHabitacion = codigoEstadoHabitacion;
	}

	public int getCodigoNivelHabitacion() {
		return codigoNivelHabitacion;
	}

	public void setCodigoNivelHabitacion(int codigoNivelHabitacion) {
		this.codigoNivelHabitacion = codigoNivelHabitacion;
	}

	@Override
	public String toString() {
		return "Habitacion [codigo=" + codigo + ", codigoHotel=" + codigoHotel + ", codigoTipoHabitacion="
				+ codigoTipoHabitacion + ", numCuartos=" + numCuartos + ", capacidad=" + capacidad + ", precioNoche="
				+ precioNoche + ", urlImagen=" + urlImagen + ", codigoEstadoHabitacion=" + codigoEstadoHabitacion
				+ ", codigoNivelHabitacion=" + codigoNivelHabitacion + "]";
	}



}
