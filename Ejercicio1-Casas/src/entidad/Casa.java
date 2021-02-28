package entidad;

import java.util.ArrayList;

public class Casa {
	private Direccion direccion;
	private ArrayList<Habitacion> habitaciones;
	private Persona propietario;
	private ArrayList<Persona> inquilino;
	private double precioAlquiler;
	
	public Casa() {
		
	}

	public Casa(Direccion direccion, ArrayList<Habitacion> habitaciones, Persona propietario,
			ArrayList<Persona> inquilino, double precioAlquiler) {
		this.direccion = direccion;
		this.habitaciones = habitaciones;
		this.propietario = propietario;
		this.inquilino = inquilino;
		this.precioAlquiler = precioAlquiler;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public void setHabitaciones(ArrayList<Habitacion> habitaciones) {
		this.habitaciones = habitaciones;
	}

	public void setPropietario(Persona propietario) {
		this.propietario = propietario;
	}

	public void setInquilino(ArrayList<Persona> inquilino) {
		this.inquilino = inquilino;
	}

	public void setPrecioAlquiler(double precioAlquiler) {
		this.precioAlquiler = precioAlquiler;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public ArrayList<Habitacion> getHabitacion() {
		return habitaciones;
	}

	public Persona getPropietario() {
		return propietario;
	}

	public ArrayList<Persona> getInquilino() {
		return inquilino;
	}

	public double getPrecioAlquiler() {
		return precioAlquiler;
	}

	public int getMetrosCuadrados(ArrayList<Habitacion> habitaciones) {
		int metrosTotales = 0;
		for (int i = 0; i < habitaciones.size(); i++) {
			metrosTotales += habitaciones.get(i).getMetrosCuadrados();
		}

		return metrosTotales;
	}

	@Override
	public String toString() {
		return "Casa [direccion=" + direccion + ", habitaciones=" + habitaciones + ", propietario=" + propietario
				+ ", inquilino=" + inquilino + ", precioAlquiler=" + precioAlquiler + "]";
	}

}
