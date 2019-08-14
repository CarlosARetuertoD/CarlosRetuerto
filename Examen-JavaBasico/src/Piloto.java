
public class Piloto extends Persona{

	private String cod_piloto = getApellidos().substring(0, 3)+ getTipo_documento() + getDocumento_identidad();
	
	public Piloto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Piloto(String nombres, String apellidos, int tipo_documento, String documento_identidad, int edad,
			int sexo) {
		super(nombres, apellidos, tipo_documento, documento_identidad, edad, sexo);
		// TODO Auto-generated constructor stub
	}
	public String getCod_piloto() {
		return cod_piloto;
	}
	public void Imprimir() {
		System.out.println("Codigo de Piloto: "+  cod_piloto);
		super.Imprimir();
	}

}
