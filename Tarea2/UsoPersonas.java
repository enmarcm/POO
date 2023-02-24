package Clase6HerenciaYAbstraccion;

import java.util.Date;
import java.util.GregorianCalendar;

public class UsoPersonas {

	public static void main(String[] args) {
		Empleado empleado1 = new Empleado("Enmanuel", 1950.14, 2003,7,14,1);
		System.out.println(empleado1.DameNombre());
		System.out.println(empleado1.DameDescripcion());
		System.out.println(empleado1.DameSueldo());
		System.out.println(empleado1.DameFechaContrato());
		
		Empleado empleado2 = new Empleado("Miguel", 2050.68, 2011, 9, 28,2);
		System.out.println(empleado2.DameNombre());
		System.out.println(empleado2.DameDescripcion());
		System.out.println(empleado2.DameSueldo());
		System.out.println(empleado2.DameFechaContrato());
		
		Empleado empleado3 = new Empleado("Andrea", 4310.99, 1998, 2, 12,3);
		System.out.println(empleado3.DameNombre());
		System.out.println(empleado3.DameDescripcion());
		System.out.println(empleado3.DameSueldo());
		System.out.println(empleado3.DameFechaContrato());
		
		Empleado empleado4 = new Empleado("Gabriela", 3190.45, 2008, 9, 30,4);
		System.out.println(empleado4.DameNombre());
		System.out.println(empleado4.DameDescripcion());
		System.out.println(empleado4.DameSueldo());
		System.out.println(empleado4.DameFechaContrato());
		
		Empleado empleado5 = new Empleado("Esteban", 820, 2020, 1, 13,5);
		empleado5.SubeSueldo(50);
		System.out.println(empleado5.DameNombre());
		System.out.println(empleado5.DameDescripcion());
		System.out.println(empleado5.DameSueldo());
		System.out.println(empleado5.DameFechaContrato());
		
		

	}

}

abstract class Persona{
	String nombre;
	
	public Persona(String nombre) {
		this.nombre = nombre;
	}
	
	public String DameNombre() {
		return this.nombre;
	}
	
	public abstract String DameDescripcion();
}

class Empleado extends Persona{
	private double sueldo;
	private Date altaContrato;
	private int Id;
	
	public Empleado(String nombre, double sueldo, int agno, int mes, int dia, int Id) {
		super(nombre);
		this.sueldo = sueldo;
		GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
		altaContrato = calendario.getTime();
		this.Id = Id;
	}
	
	public String DameDescripcion() {
		return "Este empleado posee un Id= "+Id+" con un sueldo= "+sueldo;
	}
	
	public String DevuelveDatos() {
		return "El nombre es: "+nombre+" y su Id es: "+Id;
	}
	
	public double DameSueldo() {
		return sueldo;
	}
	
	public Date DameFechaContrato() {
		return altaContrato;
	}
	
//	SUBE EL SUELDO SEGUN EL PORCENTAJE INDICADO
	public void SubeSueldo(double porcentaje) {
		double aumento = (sueldo*porcentaje)/100;
		sueldo+=aumento;
	}
	
	
	
}

