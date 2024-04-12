package interfaces.ejercicio01;

public class Socio implements Comparable<Socio> {

	/**
	 * Atributo que guarda el identificador del socio
	 */
	private int id = 1;

	/**
	 * Atributo que guarda el nombre del socio
	 */
	private String nombre = "";

	/**
	 * Atributo que guarda la edad del socio
	 */
	private int edad;

	/**
	 * Constructor con parametros que recoge los datos del socio que ha insertado el
	 * usuario
	 * 
	 * @param id El identificador del socio
	 * @param nombre El nombre del socio
	 * @param edad La edad del socio
	 */
	public Socio(int id, String nombre, int edad) {
		if (id > 0) {
			this.id = id;
		}
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
		if (edad > 0 && edad < 150) {
			this.edad = edad;
		}
	}

	public String toString() {
		String res ="";
		res += "ID: " + this.id + "\n";
		res += "Nombre: " + this.nombre + "\n";
		res += "Edad: " + this.edad + "\n";
		return res;
	}
	
	@Override
	public int compareTo(Socio o) {
		int ord = 0;
		if(this.id< o.id) {
			ord = -1;
		}
		if(this.id > o.id) {
			ord = 1;
		}
		return ord;
	}

	
}
