package interfaces.ejercicio03;

abstract public class AnimalDomestico implements Animal{

	private String nombre ="";
	private String raza ="";
	private double peso;
	private String color ="";
	
	public AnimalDomestico(String nombre, String raza, double peso, String color) {
		if(nombre != null&& !nombre.equals(""))
			this.nombre = nombre;
		if(raza != null&& !raza.equals(""))
			this.raza = raza;
		if(peso>0)
			this.peso = peso;
		if(color != null&& !color.equals(""));
			this.color = color;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if(nombre != null&& !nombre.equals(""))
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		if(raza != null&& !raza.equals(""))
		this.raza = raza;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if(peso>0)	
		this.peso = peso;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		if(color != null&& !color.equals(""));
		this.color = color;
	}

	public void vacunar() {
		
	}
	
	abstract public boolean hacerCaso();
	
	@Override
	public boolean comer() {
		return true;
	}

	@Override
	public boolean dormir() {
		return true;
	}

	@Override
	abstract public void hacerRuido();

	
}
