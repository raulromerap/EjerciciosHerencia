package ejercicio05;

public class Triangulo extends Poligono{

	private double lado1;
	private double lado2;
	private double lado3;
	

	public Triangulo(int numeroLados, double lado1, double lado2, double lado3) {
		super(numeroLados);
		
		if(lado1 > 0) {
			this.lado1 = lado1;
		}
		if(lado2 > 0) {
			this.lado2 = lado2;
		}
		if(lado3 > 0) {
			this.lado3 = lado3;
		}
	}
	
	@Override
	public double area() {
		double s = (lado1+lado2+lado3)/2;
		return Math.sqrt(s*((s-lado1)*(s-lado2)*(s-lado3)));
	}
	
	public String toString() {
		String res= super.toString() + "\n Triangulo";
		res += "\n Lado 1" + this.lado1;
		res += "\n Lado 2" + this.lado2;
		res += "\n Lado 3" + this.lado3;
		return res;
	}
}
