package ejercicio02;

public class Directivo extends Empleado {

	public Directivo(String nombre) {
		super(nombre);
	}
	
	public String toString() {
		String res = super.toString();
		res += "->" + "Directivo";
		return res;
	}
}
