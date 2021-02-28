package entidad;

public class Direccion {

	private String tipoVia;
	private String nombreVia;
	private int cp;
	private int numero;
	
	public Direccion() {
		
	}

	public Direccion(String tipoVia, String nombreVia, int cp, int numero) {
		this.tipoVia = tipoVia;
		this.nombreVia = nombreVia;
		this.cp = cp;
		this.numero = numero;
	}

	public String getTipoVia() {
		return tipoVia;
	}

	public String getNombreVia() {
		return nombreVia;
	}

	public int getCp() {
		return cp;
	}

	public int getNumero() {
		return numero;
	}

	public void setTipoVia(String tipoVia) {
		this.tipoVia = tipoVia;
	}

	public void setNombreVia(String nombreVia) {
		this.nombreVia = nombreVia;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Direccion [tipoVia=" + tipoVia + ", nombreVia=" + nombreVia + ", cp=" + cp + ", numero=" + numero + "]";
	}

}
