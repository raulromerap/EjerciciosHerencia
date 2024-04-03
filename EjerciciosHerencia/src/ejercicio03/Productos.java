package ejercicio03;

public class Productos {

	protected String nombre ="";
	
	protected double precio = 0.0;
	
	public Productos(String nombre, double precio) {
		if(nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
		if(precio >=0) {
			this.precio = precio;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public double calcular(int cant) {
		double precioFinal = 0.0;
		precioFinal = precio * cant;
		return precioFinal;
	}
	
	public String toString() {
		String res = "";
		res += this.nombre + " " + this.precio + "£";
		return res;
	}
}
