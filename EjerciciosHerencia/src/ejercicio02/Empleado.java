package ejercicio02;

public class Empleado {

	protected String nombre = "";
	
	public Empleado(String nombre) {
		if(nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String toString() {
		String res = "";
		res += "Empleado " + this.nombre +" ";
		return res;
	}
}
