package ejercicio03;

public class NoPerecedero  extends Productos{

	private String tipo="";
	
	public NoPerecedero(String nombre, double precio, String tipo) {
		super(nombre, precio);
		if(tipo != null && !tipo.equals("")) {
			this.tipo = tipo;
		}
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public double calcular(int cant) {
		return super.calcular(cant);
	}
	
	public String toString() {
		String res = super.toString();
		res += " " + this.tipo;
		return res;
	}
}
