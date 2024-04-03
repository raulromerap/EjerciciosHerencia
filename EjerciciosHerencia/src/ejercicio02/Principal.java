package ejercicio02;

public class Principal {

	public static void main(String[] args) {
		Empleado emp = new Empleado("Rafa");
		Directivo dir = new Directivo("Mario");
		Operario op= new Operario("Alfonso");
		Oficial of = new Oficial("Luis");
		Tecnico tec= new Tecnico("Pablo");
		
		System.out.println(emp);
		System.out.println(dir);
		System.out.println(op);
		System.out.println(of);
		System.out.println(tec);
	}

}
