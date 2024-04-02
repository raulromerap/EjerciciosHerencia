package ejercicio01;

public class Principal {

	public static void main(String[] args) {
		Hora h = new Hora(3,9);
		HoraExacta he = new HoraExacta(23, 59, 59);
		System.out.println(h);
		System.out.println(he);
		
		h.inc();
		
		he.inc();
		System.out.println("_______________");
		System.out.println(h);
		System.out.println(he);
	}
}
