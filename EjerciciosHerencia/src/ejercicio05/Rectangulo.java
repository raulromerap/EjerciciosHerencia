package ejercicio05;

public class Rectangulo  extends Poligono{

	private double lado1 = 0;
	private double lado2 = 0;
	
	public Rectangulo(int numeroLados, double lado1, double lado2) {
		super(numeroLados);
		if(lado1 >0) {
			this.lado1 = lado1;
		}
		if(lado2 >0) {
			this.lado2 = lado2;
		}
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	@Override
	public double area() {
		return this.lado1 * this.lado2;
	}
	
	@Override
	public String toString() {
		String res = super.toString();
		res += "\n" + "Area: " + this.area();
		return res;
	}
}
