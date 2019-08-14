import java.util.ArrayList;
import java.util.List;

public class Pasajero extends Persona{
	private String codigo_pasajero = getApellidos().substring(0, 3)+ getTipo_documento() + getDocumento_identidad();
	List<Vuelos> registro_vuelos;
	List<Vuelos> reservas; 
	
	public String getCodigo_pasajero() {
		return codigo_pasajero;
	}

	public Pasajero() {
		super();
		registro_vuelos = new ArrayList<Vuelos>();
		reservas = new ArrayList<Vuelos>();
		// TODO Auto-generated constructor stub
	}

	public Pasajero(String nombres, String apellidos, int tipo_documento, String documento_identidad, int edad,
			int sexo) {
		super(nombres, apellidos, tipo_documento, documento_identidad, edad, sexo);
		this.registro_vuelos = new ArrayList<Vuelos>();
		this.reservas = new ArrayList<Vuelos>();
		// TODO Auto-generated constructor stub
	}
	public void RegistrarVuelo(Vuelos vuelo) {
		this.registro_vuelos.add(vuelo);
	}
	public void EliminarVuelo(String cod_vuelo) {
		if (!registro_vuelos.isEmpty()){
            for (Vuelos e: registro_vuelos){
                if (e.getCodigo_vuelo().equals(cod_vuelo)){
                    registro_vuelos.remove(e);
                    System.out.println ("Vuelo Eliminado");
                }
            }
        }
	}
	public void RealizarReserva(Vuelos vuelo) {
		this.reservas.add(vuelo);
		vuelo.AgregarPasajero(this);
		System.out.println ("Reserva Realizada");
	}
	public void CancelarReserva(String cod_vuelo) {
		if (!reservas.isEmpty()){
            for (Vuelos e: reservas){
                if (e.getCodigo_vuelo().equals(cod_vuelo)){
                	reservas.remove(e);
                    System.out.println ("Reserva Cancelada");
                }
            }
        }
	}
	public void ImprimirReservas() {
		if (!reservas.isEmpty()){
			System.out.println("RESERVAS =========================");
            for (Vuelos e: reservas){
                e.Imprimir();
            }
        }else {
        	System.out.println("El pasajero no registra reservas");
        }
	}
	public void ImprimirVuelos() {
		if (!registro_vuelos.isEmpty()){
			System.out.println("HISTORIAL DE VUELOS =========================");
            for (Vuelos e: registro_vuelos){
                e.Imprimir();
            }
        }else {
        	System.out.println("El pasajero aun no ha realizado vuelos");
        }
	}
	public void ImprimirPasajero() {
		System.out.println("Codigo de Pasajero: "+ codigo_pasajero);
		super.Imprimir();
		ImprimirVuelos();
		ImprimirReservas();
	}
}
