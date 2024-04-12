package interfaces.ejercicio02;

import java.util.Arrays;

public class Principal {

	public static Futbolista[] fut = new Futbolista[5];
	
	public static void main(String[] args) {
		
		Futbolista f1 = new Futbolista(12, "Casanova", 22, 0);
		Futbolista f2 = new Futbolista(1, "Villa", 19, 20);
		Futbolista f3 = new Futbolista(99, "Lopez", 30, 14);
		Futbolista f4 = new Futbolista(12, "David Ponce", 16, 5);
		Futbolista f5 = new Futbolista(1, "Secun", 40, 2);

		fut[0] = f1;
		fut[1] = f2;
		fut[2] = f3;
		fut[3] = f4;
		fut[4] = f5;
		
		for(Futbolista valor : fut) {
			System.out.println(valor);
		}
		
		Arrays.sort(fut);
		System.out.println("===============================");
		for(Futbolista valor : fut) {
			System.out.println(valor);
		}
		
	}

}
