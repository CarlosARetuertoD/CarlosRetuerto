import java.util.ArrayList;
import java.util.List;

public class Vuelos {
	private String codigo_vuelo ;
	private Piloto piloto;
	private Piloto copiloto;
	private Avion  avion;
	private List<Pasajero> pasajeros;
	private Aeropuerto origen;
	private Aeropuerto destino;


	public Vuelos(String codigo_vuelo, Piloto piloto, Piloto copiloto, Avion avion,	Aeropuerto origen, Aeropuerto destino) {
		super();
		this.codigo_vuelo = codigo_vuelo;
		this.piloto = piloto;
		this.copiloto = copiloto;
		this.avion = avion;
		this.origen = origen;
		this.destino = destino;
		pasajeros = new ArrayList<Pasajero>();
	}
	public Piloto getPiloto() {
		return piloto;
	}
	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}
	public Piloto getCopiloto() {
		return copiloto;
	}
	public void setCopiloto(Piloto copiloto) {
		this.copiloto = copiloto;
	}
	public Avion getAvion() {
		return avion;
	}
	public void setAvion(Avion avion) {
		this.avion = avion;
	}
	public Aeropuerto getOrigen() {
		return origen;
	}
	public void setOrigen(Aeropuerto origen) {
		this.origen = origen;
	}
	public Aeropuerto getDestino() {
		return destino;
	}
	public void setDestino(Aeropuerto destino) {
		this.destino = destino;
	}
	public String getCodigo_vuelo() {
		return codigo_vuelo;
	}
	public void AgregarPasajero(Pasajero pasajero) {
		this.pasajeros.add(pasajero);
		pasajero.RegistrarVuelo(this);
	}
	public void EliminarPasajero(String cod_pasajero) {
		if (!pasajeros.isEmpty()){
            for (Pasajero e: pasajeros){
                if (e.getCodigo_pasajero().equals(cod_pasajero)){
                	//pasajeros.remove(e);
                    System.out.println ("Pasajero Eliminado");
                }
            }
        }else {
        	System.out.println("El vuelo no registra pasajeros");
        }
	}
	public void ImprimirPasajeros() {
		if (!pasajeros.isEmpty()){
			System.out.println("=========================PASAJEROS=========================");
            for (Pasajero e: pasajeros){
            	System.out.println("Codigo Pasajero: "+  e.getCodigo_pasajero()+" "+e.getNombres()+" "+e.getApellidos());
            }
        }else {
        	System.out.println("El vuelo no registra pasajeros");
        }
	}
	
	public void Imprimir() {
		System.out.println("Codigo Vuelo: " + codigo_vuelo);
		//System.out.println("Piloto: " + piloto.getApellidos()+ " " + piloto.getNombres());
		piloto.Imprimir();
		System.out.println("Co-Piloto: " + copiloto.getApellidos()+ " " + copiloto.getNombres());
		System.out.println("Avion : " + avion.getNumero_serie() + "Aerolinea : " + avion.getAerolinea());
		System.out.println("Origen: "+ origen.getUbicacion());
		System.out.println("Destino: " + destino.getUbicacion());
		
		ImprimirPasajeros();
	}
}
