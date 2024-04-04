package ejercicio04;

public class Electrodomestico {

	/**
	 * Atributo que guarda el precio base de cada electrodomestico
	 */
	protected double precioBase = 100.0;
	/**
	 * Atributo que guarda el color del electrodomestico
	 */
	protected enum Color {BLANCO, NEGRO, ROJO, AZUL, GRIS};
	/**
	 * Lista que guarda las letras/certificados del consumo energetico del electrodomestico
	 */
	protected enum ConsumoEn  {A, B, C, D, E, F};
	/**
	 * Atributo que guarda el peso del electrodomestico
	 */
	protected double peso = 5.0;
	
	protected Color color = Color.BLANCO;
	
	protected ConsumoEn consumo  = ConsumoEn.F;
	
	public Electrodomestico() {
		
	}
	
	public Electrodomestico(double precioBase, String  color, String consumo, double peso) {
		if(precioBase >=100) {
			this.precioBase = precioBase;
		}
		this.color = Color.valueOf(color.toUpperCase());
		
		this.consumo = ConsumoEn.valueOf(consumo.toUpperCase());
		
		if(peso >= 5) {
			this.peso = peso;
		}
		
	}
	
}
