package parte1.ejercicio02;

/**
 * Clase correspondiente al Ejercicio 2: Libro
 */
public class Libro {

	/**
	 * Titulo del libro
	 */
	private String titulo = "";
	/**
	 * Autor del libro
	 */
	private String autor = "";
	/**
	 * Numero de ejemplares disponibles de cada libro
	 */
	private int ejemplaresDisponibles;
	/**
	 * Numero de ejemplares prestados de cada libro
	 */
	private int ejemplaresPrestados;

	/**
	 * Constructor sin parametros
	 */
	public Libro() {

	}

	/**
	 * Constructor con todos los atributos como parametro
	 * 
	 * @param titulo
	 * @param autor
	 * @param ejemplaresDisponibles
	 * @param ejemplaresPrestados
	 */
	public Libro(String titulo, String autor, int ejemplaresDisponibles, int ejemplaresPrestados) {
		// El parámetro titulo, no admitirá null ni caracter vacío
		if (titulo != null && !titulo.equals(""))
			this.titulo = titulo;
		// El parámetro autor, no admitirá null ni caracter vacío
		if (autor != null && !autor.equals(""))
			this.autor = autor;
		// El parámetro ejemplares disponibles, debe ser mayor o igual que 0
		if (ejemplaresDisponibles >= 0)
			this.ejemplaresDisponibles = ejemplaresDisponibles;
		// El parámetro ejemplares prestados, debe ser mayor o igual que 0
		if (ejemplaresPrestados >= 0)
			this.ejemplaresPrestados = ejemplaresPrestados;
	}

	/**
	 * Getter de los ejemplares disponibles
	 * 
	 * @return Numero de ejemplares disponibles
	 */
	public int getEjemplaresDisponibles() {
		return ejemplaresDisponibles;
	}

	/**
	 * Getter de los ejemplares prestados
	 * 
	 * @return Numero de ejemplares prestados
	 */
	public int getEjemplaresPrestados() {
		return ejemplaresPrestados;
	}

	/**
	 * Funcion prestamo: Indica si se puede llevar a cabo el prestamo de un libro o
	 * no y, si es posible, incrementamos la cantidad de ejemplares prestados y
	 * decrementamos la cantidad de ejemplares disponibles
	 * 
	 * @return True o false segun si es posible llevar a cabo el prestamo
	 */
	public boolean prestamo() {

		// Variable que devolverá la función
		boolean sePuedePrestar = false;

		// Si el número de ejemplares disponibles es mayor que 0
		if (ejemplaresDisponibles > 0) {
			// Se asignará nuestra variable como true
			sePuedePrestar = true;
			// Incrementamos la cantidad de ejemplares prestados
			ejemplaresPrestados++;
			// Decrementamos la cantidad de ejemplares disponibles
			ejemplaresDisponibles--;

		}
		// Devuelve el valor de nuestro boolean
		return sePuedePrestar;

	}

	/**
	 * Funcion devolucion: Indica si se puede llevar a cabo la devolucion de un
	 * libro o no y, si es posible, decrementamos la cantidad de ejemplares
	 * prestados e incrementamos la cantidad de ejemplares disponibles
	 * 
	 * @return True o false segun si es posible llevar a cabo la devolucion
	 */
	public boolean devolucion() {

		// Variable que devolverá la función
		boolean sePuedeDevolver = false;

		// Si el número de ejemplares prestados es mayor que 0
		if (ejemplaresPrestados > 0) {
			// Se asignará nuestra variable como true
			sePuedeDevolver = true;
			// Decrementamos la cantidad de ejemplares prestados
			ejemplaresPrestados--;
			// Incrementamos la cantidad de ejemplares disponibles
			ejemplaresDisponibles++;

		}
		// Devuelve el valor de nuestro boolean
		return sePuedeDevolver;

	}
}
