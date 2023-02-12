package Clase4;

public class Main {

	public static void main(String[] args) {
		//INSTANCIAMOS UNA CAMIONETA
		Camioneta camioneta1 = new Camioneta();
		
		camioneta1.establecerMotor(2000);
		System.out.println(camioneta1.getMotor());
		
		camioneta1.establecerGas("si");
		System.out.println(camioneta1.getGas());
	
		camioneta1.establecerTraccion("no");
		System.out.println(camioneta1.getTraccion());
		
		System.out.println(camioneta1.calcularKm());
		
		System.out.println(camioneta1.DecirCaracteristicas());
	
		
		System.out.println("--------------------------------------");
		
		//INSTANCIAMOS UNA SEGUNDA CAMIONETA
		Camioneta camioneta2 = new Camioneta();
		
		camioneta2.establecerMotor(1400);
		System.out.println(camioneta2.getMotor());
		
		camioneta2.establecerGas("si");
		System.out.println(camioneta2.getGas());
	
		camioneta2.establecerTraccion("si");
		System.out.println(camioneta2.getTraccion());
		
		System.out.println(camioneta2.calcularKm());
		
		System.out.println(camioneta2.DecirCaracteristicas());
	
		System.out.println("--------------------------------------");
		
		//AHORA INSTANCIAMOS UNA MOTO
	
		Moto moto1 = new Moto();
		moto1.establecerColor("Magenta");
		
		moto1.establecerTanque(20);
		System.out.println(moto1.getTanque());
		
		moto1.establecerAccesorios("si");
		System.out.println(moto1.getAccesorios());
		
		moto1.establecerSincronico("si");
		System.out.println(moto1.getSincronico());
		
		System.out.println(moto1.DecirCaracteristicas());
		
		System.out.println("--------------------------------------");
		//INSTANCIAMOS UNA SEGUNDA MOTO
		Moto moto2 = new Moto();
		
		moto2.establecerTanque(31);
		System.out.println(moto2.getTanque());
		
		moto2.establecerAccesorios("no");
		System.out.println(moto2.getAccesorios());
		
		moto2.establecerSincronico("no");
		System.out.println(moto2.getSincronico());
		
		System.out.println(moto2.DecirCaracteristicas());
	}

}
