package es.dss.template;

public class Cliente extends Persona {
	private int numeroCliente;
	
	protected String getId() {
		return String.valueOf(numeroCliente);
	}
	
	protected String getIdentificacion() {
		return "numero de cliente";
	}
	
	public Cliente(String nombre, String DNI, int numeroCliente) {
		super(nombre, DNI);
		this.numeroCliente = numeroCliente;
	}
}
