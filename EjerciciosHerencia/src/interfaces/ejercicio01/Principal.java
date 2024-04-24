package interfaces.ejercicio01;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		
		Socio s1 = new Socio(3,"Pedro", 30);
		Socio s2 = new Socio(1,"Lucas", 30);
		Socio s3 = new Socio(23,"Rocio", 30);
		Socio s4 = new Socio(12,"Fernando", 30);
		Socio s5 = new Socio(7,"Sebastian", 30);

		Socios.anyadido(s1);
		Socios.anyadido(s2);
		Socios.anyadido(s3);
		Socios.anyadido(s4);
		Socios.anyadido(s5);
		
		Socios.listado();
		Arrays.sort(Socios.s);
		System.out.println("================================");
		Socios.listado();
	}

}
