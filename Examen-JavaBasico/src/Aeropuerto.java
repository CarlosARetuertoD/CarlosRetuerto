
public class Aeropuerto {
	
	private String nombre;
	private String ubicacion;
	

	public Aeropuerto() {
		super();
		this.nombre = "No figura";
		this.ubicacion = "No figura";
	}
	public Aeropuerto(String nombre, String ubicacion) {
		super();
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getUbicacion() {
		return ubicacion;
	}


	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

}
