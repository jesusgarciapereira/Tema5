package parte1.ejercicio03;

/**
 * Clase Main para probar la clase del Ejercicio03 del Tema 5 parte1
 */
public class Principal {

	/**
	 * Metodo main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Distancia entre los dos puntos
		double distancia;

		// Creo un objeto de clase Punto
		Punto p1 = new Punto(2, 3);
		// Llamo a la función imprime() para mostrarlo
		p1.imprime();

		// Llamo a la función setXY para modificar ambas coordenadas
		p1.setXY(3, 2);
		// Lo muestro modificado
		p1.imprime();

		// Llamo a la función desplaza() para mover el punto
		p1.desplaza(4, 3);
		// Lo muestro desplazado
		p1.imprime();
		
		// Creo un nuevo punto
		Punto p2 = new Punto(4, 1);
		// Llamo a la función distancia() con los dos puntos y se lo asigno a la variable distancia
		distancia= p1.distancia(p2);
		// Muestro la distancia
		System.out.println(distancia);

	}

}
