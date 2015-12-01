package es.dss.template;

import es.dss.notemplate.Persona;

public class Main {
	public static void main(String[] args) {
		Empleado empleado = new Empleado("Becario mal pagado", "12345678A", 
				"ElQueCobraUnEuroLaHora");
		Cliente cliente = new Cliente("Cliente desafortunado", "481516B", 481516);
		Socio socio = new Socio("Socio rico", "Otro DNI", 2342);
		
		System.out.println(empleado.identificacion());
		System.out.println(cliente.identificacion());
		System.out.println(socio.identificacion());
	}
}
