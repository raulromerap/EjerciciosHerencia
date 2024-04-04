package ejercicio04;

public class Television extends Electrodomestico{

	private int resolucion = 20;
	
	private boolean sintonizador = false;

	public Television() {
		
	}
	
	public Television(double precioBase, double peso) {
		super(precioBase, peso);
	}
	
	public Television(int resolucion, boolean sintonizador, double precio, String color, String consumo, double peso) {
		super(precio, color, consumo, peso);
		if(resolucion >= 20) {
			this.resolucion = resolucion;
		}
			this.sintonizador = sintonizador;
	}

	public int getResolucion() {
		return resolucion;
	}

	public boolean getSintonizador() {
		return sintonizador;
	}
	
	public void precioFinal() {
		super.precioFinal();
		if(this.resolucion > 40) {
			this.precioBase += (1-0.3);
		}
		if(this.sintonizador) {
			this.precioBase += 50;
		}
	}
	
	public String toString() {
		String res = super.toString();
		res += "\n" + this.resolucion + "\n";
		if(this.sintonizador) {
			res += "Con sintonizador";
		}else {
			res += "Sin sintonizador";
		}
		return res;
	}
}
