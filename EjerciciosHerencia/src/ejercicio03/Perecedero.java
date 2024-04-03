package ejercicio03;

public class Perecedero extends Productos {

	private int diasACaducar;
	
	public Perecedero(String nombre, double precio, int diasACaducar) {
		super(nombre, precio);
		
		if(diasACaducar >0) {
			this.diasACaducar = diasACaducar;
		}
	}

	public int getDiasACaducar() {
		return diasACaducar;
	}

	public void setDiasACaducar(int diasACaducar) {
		this.diasACaducar = diasACaducar;
	}
	
	public double calcular(int cant) {
		double precioFinal = 0.0;
		if(diasACaducar == 1) {
			precioFinal = super.calcular(cant) / 4;
		}else if (diasACaducar == 2) {
			precioFinal = super.calcular(cant) / 3;
		}else if (diasACaducar == 3) {
			precioFinal = super.calcular(cant) / 2;
		}else {
			precioFinal = super.calcular(cant);
		}
		return precioFinal;
	}
	
	public String toString() {
		String res = super.toString();
		res += " " + this.diasACaducar;
		return res;
	}
}
