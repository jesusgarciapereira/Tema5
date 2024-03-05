package parte1.ejercicio03;

/**
 * Clase correspondiente al Ejercicio 3: Punto
 */
public class Punto {

	/**
	 * Coordenada X
	 */
	private int cordX;

	/**
	 * Coordenada Y
	 */
	private int cordY;

	/**
	 * Constructor con todos los atributos como parametro
	 * 
	 * @param cordX
	 * @param cordY
	 */
	public Punto(int cordX, int cordY) {
		this.cordX = cordX;
		this.cordY = cordY;
	}

	/**
	 * Funcion imprime: Imprime por pantalla las coordenadas
	 */
	public void imprime() {
		// Muestra las coordenadas tal que así
		System.out.println("(" + this.cordX + ", " + this.cordY + ")");

	}

	/**
	 * Funcinon setXY: Literalmente, un setter de ambos atributos
	 * 
	 * @param x Nuevo valor de la coordenada X
	 * @param y Nuevo valor de la coordenada Y
	 */
	public void setXY(int x, int y) {
		this.cordX = x;
		this.cordY = y;

	}

	/**
	 * Funcinon desplaza: Desplaza la coordenada la cantidad indicada en el
	 * parametro
	 * 
	 * @param dx Cuanto se incrementa la coordenada X
	 * @param dy Cuanto se incrementa la coordenada Y
	 */
	public void desplaza(int dx, int dy) {
		this.cordX += dx;
		this.cordY += dy;

	}

	/**
	 * Funcion distancia: Calcula y devuelve la distancia entre el propio objeto y
	 * otro objeto indicado en el parametro
	 * 
	 * @param p Objeto de clase Punto
	 * @return La distancia entre el objeto al que se aplica la funcion y el objeto del parametro
	 */
	public double distancia(Punto p) {
		// Numero que indica la distancia entre los dos puntos
		double distancia;

		// Asignamos a la variable la siguiente fórmula
		distancia = Math.sqrt(Math.pow(p.cordX - this.cordX, 2) + Math.pow(p.cordY - this.cordY, 2));

		// Devolverá la distancia entre los dos puntos
		return distancia;
	}
}
