package parte1;


/**
 * Clase Main para probar la clase del Ejercicio02 del Tema 5 parte1
 */
public class MainLibro {

	/**
	 * Metodo main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Boolean que indicará si es posible realizar un préstamo
		boolean sePuedePrestar;
		// Boolean que indicará si es posible devolver un libro
		boolean sePuedeDevolver;

		// Creamos un objeto de tipo Libro
		Libro l1 = new Libro("El Señor de los Anillos", "J.R.R.Tolkien", 5, 0);

		// Llamamos a la función prestamo() y le asignamos el valor devuelto al boolean
		// sePuedePrestar
		sePuedePrestar = l1.prestamo();
		// Aplicamos un operador ternario para mostrar un mensaje u otro según el valor
		// de nuestro boolean
		System.out.println(sePuedePrestar ? "Prestamo realizado" : "No es posible llevar a cabo el préstamo");

		// Muestro cuantos ejemplares quedan disponibles
		System.out.println("Ejemplares disponibles: " + l1.getEjemplaresDisponibles());
		// Muestro cuantos ejemplares hay prestados
		System.out.println("Ejemplares prestados: " + l1.getEjemplaresPrestados());

		// Llamamos a la función devolucion() y le asignamos el valor devuelto al
		// boolean
		// sePuedeDevolver
		sePuedeDevolver = l1.devolucion();
		// Aplicamos un operador ternario para mostrar un mensaje u otro según el valor
		// de nuestro boolean
		System.out.println(sePuedeDevolver ? "Devolución realizada" : "No existen libros prestados");

		// Muestro cuantos ejemplares quedan disponibles
		System.out.println("Ejemplares disponibles: " + l1.getEjemplaresDisponibles());
		// Muestro cuantos ejemplares hay prestados
		System.out.println("Ejemplares prestados: " + l1.getEjemplaresPrestados());

	}

}
