package ejercicio04;

public class Lavadora extends Electrodomestico{

	private double carga = 5;
	
	public Lavadora() {
		
	}
	
	public Lavadora(double precio, double peso) {
		super(precio, peso);
	}
	
	public Lavadora(double carga, double precio,String color, String consumo, double peso ) {
		super(precio, color, consumo, peso);
		if(carga > 0) {
			this.carga = carga;
		}
	}

	public double getCarga() {
		return carga;
	}
	
	@Override
	public void precioFinal() {
		super.precioFinal();
		if(this.carga >=30) {
			this.precioBase += 50;
		}
	}
	
	public String toString() {
		String res = super.toString();
		res += "\n" + this.carga;
		return res;
	}
	
}
