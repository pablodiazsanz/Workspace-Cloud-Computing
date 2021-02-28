package entidad;

public class Habitacion {

	private int metrosCuadrados;
	private String tipoHabitacion;
	private int numeroHabitacion;

	public Habitacion() {

	}

	public Habitacion(int metrosCuadrados, String tipoHabitacion, int numeroHabitacion) {
		this.metrosCuadrados = metrosCuadrados;
		this.tipoHabitacion = tipoHabitacion;
		this.numeroHabitacion = numeroHabitacion;
	}

	@Override
	public String toString() {
		return "Habitacion [metrosCuadrados=" + metrosCuadrados + ", tipoHabitacion=" + tipoHabitacion
				+ ", numeroHabitacion=" + numeroHabitacion + "]";
	}

	public double getMetrosCuadrados() {
		return metrosCuadrados;
	}

	public String getTipoHabitacion() {
		return tipoHabitacion;
	}

	public int getNumeroHabitacion() {
		return numeroHabitacion;
	}

	public void setMetrosCuadrados(int metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}

	public void setTipoHabitacion(String tipoHabitacion) {
		this.tipoHabitacion = tipoHabitacion;
	}

	public void setNumeroHabitacion(int numeroHabitacion) {
		this.numeroHabitacion = numeroHabitacion;
	}

}
