
public class Avion {

	private String numero_serie;
	private String aerolinea;
	private int capacidad;
	private int millas_recorridas;
	
	public Avion() {
		this.numero_serie = "No tiene numero de serie";
		this.aerolinea = "No Figura";
		this.capacidad = -1;
		this.millas_recorridas = 0;
	}
	public Avion(String numero_serie, String aerolinea, int capacidad) {
		this.numero_serie = numero_serie;
		this.aerolinea = aerolinea;
		this.capacidad = capacidad;
		this.millas_recorridas = 0;
	}

	public String getAerolinea() {
		return aerolinea;
	}

	public void setAerolinea(String aerolinea) {
		this.aerolinea = aerolinea;
	}

	public int getMillas_recorridas() {
		return millas_recorridas;
	}

	public void setMillas_recorridas(int millas_recorridas) {
		this.millas_recorridas = millas_recorridas;
	}

	public String getNumero_serie() {
		return numero_serie;
	}

	public int getCapacidad() {
		return capacidad;
	}
	
	public void Imprimir() {
		System.out.println("Numero de serie: " + numero_serie);
		System.out.println("Aerolinea: " + aerolinea);
		System.out.println("Capacidad: " + capacidad);
		System.out.println("Millas Recorridas: " + millas_recorridas);
	}
}
