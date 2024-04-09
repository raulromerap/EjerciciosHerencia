package ejercicio05;

public abstract  class Poligono {

	protected int numeroLados;
	
	public Poligono(int numeroLados) {
		if(numeroLados > 0) {
			this.numeroLados = numeroLados;
		}
	}

	public int getNumeroLados() {
		return numeroLados;
	}

	public void setNumeroLados(int numeroLados) {
		this.numeroLados = numeroLados;
	}

	public abstract double area();
	
	public String toString() {
		String res = "";
		res+= "Lados: " + this.numeroLados;
		return res;
	}
}
