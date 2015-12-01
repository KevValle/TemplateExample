package es.dss.template;

public class Empleado extends Persona {
	private String legajo;
	
	protected String getId() {
		return legajo;
	}
	
	protected String getIdentificacion() {
		return "legajo";
	}
	
	public Empleado(String nombre, String DNI, String legajo) {
		super(nombre, DNI);
		this.legajo = legajo;
	}
}
