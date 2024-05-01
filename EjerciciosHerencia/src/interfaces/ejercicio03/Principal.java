package interfaces.ejercicio03;

public class Principal {

	public static void main(String[] args) {
		
		AnimalDomestico p1 = new Perro("Sabueso", "Pitbull", 15.2, "Negro");
		
		System.out.println(p1.getNombre());
		System.out.println(p1.getPeso());
		p1.setPeso(p1.getPeso()+0.5);
		System.out.println(p1.getPeso());
		
		p1.hacerRuido();
	}
}
