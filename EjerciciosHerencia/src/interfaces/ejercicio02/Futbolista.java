package interfaces.ejercicio02;

public class Futbolista implements Comparable<Futbolista>{

	private int numCam;
	
	private String nombre ="";
	
	private int edad;
	
	private int numGol;
	
	public Futbolista(int numCam, String nombre, int edad, int numGol) {
		if(numCam > 0) {
			this.numCam = numCam;
		}
		if(nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
		if(edad > 15 && edad < 45) {
			this.edad = edad;
		}
		if(numGol>=0) {
			this.numGol = numGol;
		}
	}
	
	public String toString() {
		String res = "";
		res += "Numero: " + this.numCam + "\n";
		res += "Nombre: " + this.nombre + "\n";
		res += "Edad: " + this.edad + "\n";
		res += "Goles: " + this.numGol + "\n";
		return res;
	}
	
	public boolean equals(Futbolista o) {
		boolean equal = false;
		
		if(this.numCam == o.numCam) {
			equal = true;
		}
		return equal;
	}

	@Override
	public int compareTo(Futbolista o) {
		int ord = 0;
		
		if(this.numCam < o.numCam) {
			ord = -1;
		}else if(this.numCam > o.numCam) {
			ord = 1;
		}
		
		if(this.numCam == o.numCam) {
			this.nombre.compareTo(o.nombre);
		}
		
		return ord;
	}
}
