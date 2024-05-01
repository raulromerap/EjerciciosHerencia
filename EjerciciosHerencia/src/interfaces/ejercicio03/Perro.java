package interfaces.ejercicio03;

import java.util.Random;

public class Perro extends AnimalDomestico{
	
	public Perro(String nombre, String raza, double peso, String color) {
		super(nombre, raza, peso, color);
	}

	@Override
	public boolean hacerCaso() {
		Random r = new Random();
		int num = r.nextInt(101);
		boolean caso = false;
		if(num < 90)
			caso = true;
		return caso;
	}

	@Override
	public void hacerRuido() {
		System.out.println("Guau!");
	}

	public void sacarPaseo() {
		
	}
	
}
