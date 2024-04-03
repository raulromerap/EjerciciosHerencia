package ejercicio03;

public class Principal {
	public static void main(String[] args) {
		Productos pro = new Productos("Soda", 0.95) ;
		Perecedero per1 = new Perecedero("Ice Cream", 0.75, 1);
		Perecedero per2= new Perecedero("Ice Cream", 0.75, 2);
		Perecedero per3 = new Perecedero("Ice Cream", 0.75, 3);
		Perecedero per4 = new Perecedero("Ice Cream", 0.75, 5);
		NoPerecedero nop = new NoPerecedero("Food Can", 2.45, "Beans");
		
		pro.calcular(4);
		per1.calcular(5);
		per2.calcular(5);
		per3.calcular(5);
		per4.calcular(5);
		nop.calcular(3);
		
		System.out.println(pro);
		System.out.println(per1);
		System.out.println(per2);
		System.out.println(per3);
		System.out.println(per4);
		System.out.println(nop);
	}
}
