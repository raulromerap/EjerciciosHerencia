package interfaces.ejercicio01;

public class Socios {

	/**
	 * Atributo formato tabla/array que guarda a 5 socios
	 */
	static public Socio[] s = new Socio[5];
	
	/**
	 * Metodo que imprime la lista de socios
	 */
	public static void listado() {
		for(Socio valor : s) {
			System.out.println("----------------\n");
			System.out.println(valor);
			System.out.println("----------------\n");
		}
		
	}
	
	/**
	 * Metodo que busca una posicion libre en la tabla
	 * @return	Devuelve el indice del espacio sin  socio
	 */
	public static int posLibre() {
		int pos = -1;
		int i = 0;
		
		while(i<s.length && pos==-1) {
			if(s[i] == null) {
				pos = i;
			}
			i++;
		}
		return pos;
	}
	
	/**
	 * Metodo que añade a la tabla el socio con sus datos
	 * @param p El socio que ha insertado el usuario
	 */
	public static void anyadido(Socio p) {
		int pos = posLibre();
		
		if(pos!=-1) {
			s[pos] = p;
		}
	}
	
}
