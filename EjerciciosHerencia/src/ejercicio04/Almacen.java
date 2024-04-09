package ejercicio04;

public class Almacen {

	public static Electrodomestico[] elect = new Electrodomestico[10];
	
	public static int posicionLibre() {
		int pos = -1;
		int i = 0;
		
		while(i < elect.length && pos == -1) {
			if(elect[i]==null) {
				pos = i;
			}
			i++;
		}
		return pos;
	}
	
	public static void listado() {
		for(Electrodomestico electro : elect) {
			if(electro != null) {
				System.out.println(electro);
			}
		}
	}
	
	public static boolean anyadirCuenta(Electrodomestico electro) {
		boolean anyadido = false;
		int posLibre = posicionLibre();
			if(posLibre != -1) {
				elect[posLibre] = electro;
				anyadido = true;
			}
		
		return anyadido;
	}
}
