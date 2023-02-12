package Clase4;

public class Camioneta {
	private int motor;
	private int ruedas;
	private int tanque;
	private int volumen;
	private int puertas;
	private boolean traccion4x4;
	private boolean gas;
	private String marca;
	private int precioBase;
	private int precioFinal;
	
	public Camioneta() {
		ruedas = 4;
		puertas = 4;
		marca = "Chevrolet";
		volumen = 200;
		precioBase = 24000;
	}
	
	
	//SETTER DE MOTOR
	public void establecerMotor(int motor) {
		if(motor >= 1400 && motor <= 2500) {
			this.motor = motor;
		}else {
			//SI NO SE RECIBE UN VALOR ACEPTADO, MOTOR POR DEFECTO VALE 1600
			this.motor = 1600;
		}
	}
	
	//GETTER DE MOTOR
	public String getMotor() {
		return "El motor de la camioneta es de " + this.motor;
	}
	
	//SETTER TANQUE
	public void establecerTanque(int tanque) {
		if(tanque >= 30 && tanque <=120) {
			this.tanque = tanque;
		}else {
			//POR DEFECTO TANQUE VALE 60
			this.tanque = 60;
		}
	}
	
	//GETTER TANQUE 
	public String getTanque() {
		return "El tanque de la camioneta es de "+this.tanque +" litros";
	}
	
	//SETTER GAS
	public void establecerGas(String gas) {
		if(gas.equalsIgnoreCase("si")) {
			this.gas = true;
		}else {
			this.gas = false;
		}
	}
	
	//GETTER GAS
	public String getGas() {
		if(gas) {
			return"La camioneta funciona a GAS";
		}else{
			return "La camioneta solo funciona con gasolina";
		}
	}
	
	//SETTER TRACCION
	public void establecerTraccion(String tiene4x4) {
		if(tiene4x4.equalsIgnoreCase("si")) {
			this.traccion4x4 = true;
		}else {
			this.traccion4x4 = false;
		}
	}
	
	//GETTER TRACCION
	public String getTraccion() {
		if(traccion4x4) {
			return "Tiene traccion 4x4";			
		}else {
			return "Tiene traccion regular";
		}
	}
	
	
	//METODO CALCULAR RENDIMIENTO KILOMETRAJES
	public String calcularKm() {
		if(motor >= 2000 && !gas) {
			return "La camioneta rendira 9Km por cada litro de gasolina";
		}else if(motor < 2000 && !gas) {
			return "La camioneta renndira 10.5Km por cada litro de gasolina";
		}else if(motor >= 2000 && gas) {
			return "La camioneta rendira 9Km por litro de gasolina y 300Km adicionales con el gas";
		}else if(motor < 2000 && gas) {
			return "La camioneta rendira 10.5Km por cada litro de gasolina y 370Km adicionales con el gas";
		}else {
			return "Por defecto rinde 11Km por cada litro de gasolina";
		}
		
	}
	
	//Precio Final
	public int precioFinal() {
		precioFinal = precioBase;
		if(traccion4x4) {
			precioFinal += 4500;
		}
		
		if(gas) {
			precioFinal += 2000;
		}
		
		return precioFinal;
	}
	
	
	public String DecirCaracteristicas() {
		return "La camioneta de la marca " + marca +", posee un volumen de "+volumen+" litros, tiene "+ruedas+" ruedas y "+ puertas +" puertas, su precio es de $"+precioFinal();
	}
	
	
	
}
