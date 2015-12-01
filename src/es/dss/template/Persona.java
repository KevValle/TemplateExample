package es.dss.template;

public abstract class Persona {
	private String nombre;
	private String DNI;
	
	protected String identificacion() {
		String resultado = "Me identifico con: ";
		resultado += getIdentificacion();
		resultado += ". El numero es: ";
		resultado += getId();
		
		return resultado;
	}
	
	protected abstract String getId();
	protected abstract String getIdentificacion();
	
	public Persona(String nombre, String DNI) {
		this.nombre = nombre;
		this.DNI = DNI;
	}
}
