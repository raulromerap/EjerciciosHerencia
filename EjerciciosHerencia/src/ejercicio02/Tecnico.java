package ejercicio02;

public class Tecnico extends Operario {

	public Tecnico(String nombre) {
		super(nombre);
	}

	public String toString() {
		String res = super.toString();
		res += "->" + "Tecnico";
		return res;
	}
}
