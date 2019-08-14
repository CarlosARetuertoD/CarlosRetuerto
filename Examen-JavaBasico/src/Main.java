
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aeropuerto a1 = new Aeropuerto("Aeropuerto Internacional Rodríguez Ballón", "Arequipa");
		Aeropuerto a2 = new Aeropuerto("Aeropuerto Internacional Jorge Chávez", "Lima");
		
		Avion av1 = new Avion("877920601110001", "LATAM", 10);
		
		Pasajero p1 = new Pasajero("Carlos Alberto","Retuerto Delgado",0,"72535892",22,1);
		Pasajero p2 = new Pasajero("Jacinta","Paisana",0,"74589632",18,0);
		Pasajero p3 = new Pasajero("Karol Fernanda","Chavez Diaz",0,"71254785",21,0);
		Pasajero p4 = new Pasajero("Miguel Jesus","Ramos Diaz",1,"1245785321",22,1);
		//p1.ImprimirPasajero();
		
		Piloto pi1 = new Piloto("Ramiro Alberto","Bellido Revilla",0,"72535892",22,1);
		Piloto pi2 = new Piloto("Ana Lucia","Cordova",0,"74589632",18,0);
		

		Vuelos v1 = new Vuelos("0001",pi1,pi2,av1,a1,a2);
		
		
		v1.AgregarPasajero(p1);
		v1.AgregarPasajero(p3);
		v1.AgregarPasajero(p4);

		v1.Imprimir();

	}

}
