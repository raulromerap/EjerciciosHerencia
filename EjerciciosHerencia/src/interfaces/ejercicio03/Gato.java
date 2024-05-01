package interfaces.ejercicio03;

import java.util.Random;

public class Gato extends AnimalDomestico{

	public Gato(String nombre, String raza, double peso, String color) {
		super(nombre, raza, peso, color);
	}

	@Override
	public boolean hacerCaso() {
		Random r = new Random();
		int num = r.nextInt(101);
		boolean caso = false;
		if(num >= 95)
			caso = true;
		return caso;
	}

	@Override
	public void hacerRuido() {
		System.out.println("Miau!");
	}
	
	public void toserBolaPelo() {
		
	}

}
