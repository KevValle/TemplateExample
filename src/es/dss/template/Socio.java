package es.dss.template;

public class Socio extends Persona {
	private int numeroSocio;
	
	protected String getId() {
		return String.valueOf(numeroSocio);
	}
	
	protected String getIdentificacion() {
		return "numero de socio";
	}
	
	public Socio(String nombre, String DNI, int numeroSocio) {
		super(nombre, DNI);
		this.numeroSocio = numeroSocio;
	}
}

