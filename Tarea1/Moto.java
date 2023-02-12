package Clase4;

public class Moto {
	private String modelo;
	private String color;
	private int ruedas;
	private boolean sincronico;
	private int precioBase;
	private int tanque;
	private boolean accesorios;
	private int precioFinal;
	
	public Moto() {
		modelo = "Benelli Leoncino 250";
		ruedas = 2;
		tanque = 20;
		precioBase = 1500;
	}
	
	//SETTER COLOR
	public void establecerColor(String color) {
		if(color.isEmpty()) {
			this.color = "rojo";
		}else {
			this.color = color;
		}
	}
	
	//SETTER DE TANQUE
	public void establecerTanque(int tanque) {
		if(tanque >= 8 && tanque <=40) {
			this.tanque = tanque;
		}else {
			this.tanque = 10;
		}
	}
	
	//GETTER DE TANQUE
	public String getTanque() {
		return "La capacidad de gasolina de la moto es de: "+this.tanque+" litros";
	}
	
	//SETTER ACCESORIOS
	public void establecerAccesorios(String tieneAccesorios) {
		if(tieneAccesorios.equalsIgnoreCase("si")) {
			this.accesorios = true;
		}else {
			this.accesorios = false;
		}
	}
	
	//GETTER ACCESORIOS
	public String getAccesorios() {
		if(this.accesorios) {
			return "La moto posee accesorios adicionales";
		}else {
			return "La moto no posee ningun tipo de accesorio";
		}
	}
	
	//SETTER SINCRONICA
	public void establecerSincronico(String sincronico) {
		if(sincronico.equalsIgnoreCase("si")) {
			this.sincronico = true;
		}else {
			this.sincronico = false;
		}
	}
	
	//GETTER SINCRONICA
	public String getSincronico() {
		if(this.sincronico) {
			return "La moto es sincronica";
		}else {
			return "La moto es automatica";
		}
	}
	
	//Precio Final
	public int calcularPrecioFinal() {
		precioFinal = precioBase;
		if(this.accesorios) {
			precioFinal += 590;
		}
		
		if(!this.sincronico) {
			precioFinal += 950;
		}
		
		return precioFinal;
	}
	
	public String DecirCaracteristicas() {
		return "La moto a " +this.ruedas+" ruedas, modelo "+this.modelo+" color " +this.color+ " tiene un precio final de $" +calcularPrecioFinal();
	}
	
}
