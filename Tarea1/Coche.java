package Clase4;

public class Coche {
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso;
	private String color;
	private int pesoTotal;
	private int pesoPlataforma;
	private boolean asientoCuero, climatizador;
	
	
	
	public Coche() {
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		peso = 500;
		pesoPlataforma = 500;
	}
	
	public String DimeDatosGenerales() {
		return "La plataforma del vehicuelo tiene " + ruedas + "ruedas. Mide "+largo/1000+ " metros y de ancho " + ancho + " cm, con un peso de plataforma " + pesoPlataforma + " Kg y su precio es: $"+PrecioCoche();
	}
	
//	SETTER DE COLOR
	public void establecerColor(String colorCoche) {
		color = colorCoche;
	}
	
//	GETTER DE COLOR
	public String DimeColor() {
		return "El color del coche es: " + color;
	}
	
	
	public void ConfigurarAsiento(String asientoCuero) {
		if(asientoCuero.equalsIgnoreCase("si")) {
			this.asientoCuero = true;
		}else {
			this.asientoCuero = false;
		}
	}
	
	public String DimeAsientos() {
		if(asientoCuero) {
			return "El coche tiene asientos de cuero";
		}else {
			return "El coche tiene asientos de serie";
		}
	}
	
//	SETTER DE CLIMATIZADOR
	public void configurarClimatizador    (String climatizador) {
		if(climatizador.equalsIgnoreCase("si")) {
			this.climatizador = true;
		}else {
			this.climatizador = false;
		}
	}
	
//	GETTER
	public String DimeClimatizador() {
		if(climatizador) {
			return "El coche tiene aire climatizador";
		}else {
			return "El coche tiene aire acondicionado";
		}
	}
	
	public String DimePesoCoche() {
		int pesoCarroceria = 500;
		pesoTotal = pesoPlataforma + pesoCarroceria;
		
		if(asientoCuero) {
			pesoTotal += 50;
		}
		
		if(climatizador) {
			pesoTotal+= 20;
		}
		
		return "El peso del coche es: " + pesoTotal;
	}
	
	
	public int PrecioCoche() {
		int precioFinal = 10000;
		
		if(asientoCuero) {
			precioFinal += 2000;
		}
		
		if(climatizador){
			precioFinal+=1500;
		}
	return precioFinal;
	}
	
	
	
	
	
	
}
