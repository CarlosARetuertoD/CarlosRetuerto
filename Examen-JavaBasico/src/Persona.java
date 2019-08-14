
public class Persona {
	
	private String nombres;
	private String apellidos;
	private int tipo_documento; // 0-DNI 1-PASAPORTE 2-Cedula de Extranjeria
	private String documento_identidad;
	private int edad;
	private int sexo; //0-Femenino 1-Masculino
	
	public Persona() {
		this.nombres = "No Figura";
		this.apellidos = "No Figura";
		this.tipo_documento = -1;
		this.documento_identidad = "No Figura";
		this.edad = -1;
		this.sexo = -1;
	}
	public Persona(String nombres, String apellidos, int tipo_documento, String documento_identidad, int edad,
			int sexo) {
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.tipo_documento = tipo_documento;
		this.documento_identidad = documento_identidad;
		this.edad = edad;
		this.sexo = sexo;
	}
	
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getTipo_documento() {
		return tipo_documento;
	}
	public void setTipo_documento(int tipo_documento) {
		if(tipo_documento == 0 || tipo_documento == 1 || tipo_documento == 2)
			this.tipo_documento = tipo_documento;
		else
			System.out.println("Tipo de Documento invalido");
	}
	public String getDocumento_identidad_det() {
		switch (tipo_documento){
			case 0:
				return "DNI: " + documento_identidad;
			case 1:
				return "Pasaporte: " + documento_identidad;
		case 2:
				return "Cedula de Extranjeria: " + documento_identidad;
		default:
				return "Documento de Identidad no Definido";
		}
		
	}
	public void setDocumento_identidad(String documento_identidad) {
		this.documento_identidad = documento_identidad;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		if(edad < 0 || edad > 99) 
			System.out.println("Edad Incorrecta");
		else
			this.edad = edad;
	}
	public String getSexo() {
		if(sexo == 0)
			return "Femenino";
		else
			return "Masculino";
	}
	public void setSexo(int sexo) {
		if(sexo == 1 || sexo == 0)
			this.sexo = sexo;
		else 
			System.out.println("Sexo Incorrecto");
	}
	public String getDocumento_identidad() {
		return documento_identidad;
	}
	

	public void Imprimir() {
		System.out.println("Apellidos y Nombres: " + apellidos + " " + nombres);
		System.out.println(getDocumento_identidad_det());
		System.out.println("Edad: " + edad);
		System.out.println("Sexo: " + getSexo());
	}
	
}
