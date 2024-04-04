package ejercicio04;

public class Electrodomestico {

	/**
	 * Atributo que guarda el precio base de cada electrodomestico, su valor inicial es 100€
	 */
	protected double precioBase = 100.0;
	/**
	 * Lista que guarda los colores posibles del electrodomestico
	 */
	protected enum Color {BLANCO, NEGRO, ROJO, AZUL, GRIS};
	/**
	 * Lista que guarda las letras/certificados del consumo energetico del electrodomestico
	 */
	protected enum ConsumoEn  {A, B, C, D, E, F};
	/**
	 * Atributo que guarda el peso del electrodomestico, su valor inicial es 5kg
	 */
	protected double peso = 5.0;
	
	/**
	 * Atributo que guarda el color del electrodomestico, su valor inicial es blanco
	 */
	protected Color color = Color.BLANCO;
	
	/**
	 * Atributo que guarda el consumo energetico del electrodomestico, su valor inicial es F
	 */
	protected ConsumoEn consumo  = ConsumoEn.F;
	
	/**
	 * Constructor sin parametros
	 */
	public Electrodomestico() {
		
	}
	
	public Electrodomestico(double precioBase, double peso) {
		if(precioBase >=0) {
			this.precioBase = precioBase;
		}
		if(peso >= 0) {
			this.peso = peso;
		}
	}
	
	/**
	 * Constructor que guarda en los atributos los datos del electrodomestico que ha insertado el usuario
	 * @param precioBase Precio base del electrodomestico
	 * @param color Color del electrodomestico
	 * @param consumo Consumo energetico del electrodomestico
	 * @param peso Peso del electrodomestico
	 */
	public Electrodomestico(double precioBase, String  color, String consumo, double peso) {
		if(precioBase >=0) {
			this.precioBase = precioBase;
		}
		this.color = Color.valueOf(color.toUpperCase());
		
		this.consumo = ConsumoEn.valueOf(consumo);
		
		if(peso >= 0) {
			this.peso = peso;
		}
		
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public double getPeso() {
		return peso;
	}

	public Color getColor() {
		return color;
	}

	public ConsumoEn getConsumo() {
		return consumo;
	}
	
	private void comprobarConsumoEnergetico(char letra) {
		
		String letraS = String.valueOf(letra);
		
		switch(letraS.toUpperCase()) {
		case "A":
			this.consumo = ConsumoEn.valueOf(letraS);
			break;
		case "B":
			this.consumo = ConsumoEn.valueOf(letraS);
			break;
		case "C":
			this.consumo = ConsumoEn.valueOf(letraS);
			break;
		case "D":
			this.consumo = ConsumoEn.valueOf(letraS);
			break;
		case "E":
			this.consumo = ConsumoEn.valueOf(letraS);
			break;
		case "F":
			this.consumo = ConsumoEn.valueOf(letraS);
			break;
		}
	}
	
	private void comprobarColor(String color) {
		
		switch(color.toUpperCase()) {
		case "BLANCO":
			this.color = Color.valueOf(color);
			break;
		case "NEGRO":
			this.color = Color.valueOf(color);
			break;
		case "ROJO":
			this.color = Color.valueOf(color);
			break;
		case "AZUL":
			this.color = Color.valueOf(color);
			break;
		case "GRIS":
			this.color = Color.valueOf(color);
			break;
		}
	}
	
	public void precioFinal(){
		
		switch(this.consumo) {
		case A:
			precioBase += 100;
			break;
		case B:
			precioBase += 80;
			break;
		case C:
			precioBase += 60;
			break;
		case D:
			precioBase += 50;
			break;
		case E:
			precioBase += 30;
			break;
		case F:
			precioBase += 10;
			break;
		}
		
		if(this.peso >=0 && this.peso<20) {
			precioBase += 10;
		}else if(this.peso >=20 && this.peso < 50) {
			precioBase += 50;
		}else if(this.peso >=50 && this.peso < 80) {
			precioBase += 80;
		}else if(this.peso >=80) {
			precioBase += 100;
		}
		
	}
	
	public String toString() {
		String res = "";
		res += this.precioBase + "\n" + this.peso + "\n" + this.consumo + "\n" + this.color + "\n";
		return res;
	}
}
