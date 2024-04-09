package ejercicio05;

import java.util.Scanner;

public class Principal {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int opc = 0;
		double lado1 = 0;
		double lado2 = 0;
		double lado3 = 0;
		menu();
		opc = sc.nextInt();
		do {
		sc.nextLine();
		switch(opc) {
		case 1: 
			System.out.println("Introduce el valor del lado1");
			
			break;
		}
		}while(opc != 0);
	}

	public static void menu() {
		System.out.println("1. Introducir triangulo");
		System.out.println("2. Introducir rectangulo");
		System.out.println("3. Mostrar contenido");
	}
}
