package entidad;

public class Persona {

	private String nombre;
	private String dni;
	private int telefono;
	private Direccion direccion;
	
	public Persona() {
		
	}

	public Persona(String nombre, String dni, int telefono, Direccion direccion) {
		this.nombre = nombre;
		this.dni = dni;
		this.telefono = telefono;
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDni() {
		return dni;
	}

	public int getTelefono() {
		return telefono;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", dni=" + dni + ", telefono=" + telefono + ", direccion=" + direccion
				+ "]";
	}

}
