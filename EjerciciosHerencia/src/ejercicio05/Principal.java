package ejercicio05;

public class Principal {

	public static void main(String[] args) {
		Poligono p1 =new Rectangulo(2,154,12);
		System.out.println(p1);
		
		Poligono p2 = new Triangulo(3,23,13,24);
		System.out.println(p2);

	}
	/**
	 * Metodo para imprimir el menu
	 */
	static void menu(){
		System.out.println("Elige una de las siguientes opciones:");
		System.out.println("1. Introducir un rectangulo");
		System.out.println("2. Introducir un triangulo");
		System.out.println("3. Listar el contenido del array");
	}

}
