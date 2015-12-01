package es.dss.notemplate;

public class Persona {
	private String nombre;
	private String DNI;
	private int numero;
	private String legajo;
	
	
	//Se llamará al método que se adapte a la persona
	public String identificacionCliente() {
		String resultado = "Me identifico con: numero de cliente. "
				+ "El numero es: " + numero;
		
		return resultado;
	}
	
	public String identificacionEmpleado() {
		String resultado = "Me identifico con: legajo. "
				+ "El numero es: " + legajo;
		
		return resultado;
	}
	
	public String identificacionSocio() {
		String resultado = "Me identifico con: numero de socio. "
				+ "El numero es: " + numero;
		
		return resultado;
	}
	
	//Constructor para personas con numero
	public Persona (String nombre, String DNI, int numero) {
		this.nombre = nombre;
		this.DNI = DNI;
		this.numero = numero;
	}
	
	//Constructor para personas con legajo
	public Persona (String nombre, String DNI, String legajo) {
		this.nombre = nombre;
		this.DNI = DNI;
		this.legajo = legajo;
	}
	
	public static void main(String[] args) {
		Persona empleado = new Persona("Becario mal pagado", "12345678A", "ElQueCobraUnEuroLaHora");
		Persona cliente = new Persona("Cliente desafortunado", "481516B", 481516);
		Persona socio = new Persona("Socio rico", "Otro DNI", 2642);
		
		System.out.println(empleado.identificacionEmpleado());
		System.out.println(cliente.identificacionCliente());
		System.out.println(socio.identificacionSocio());
	}
}
