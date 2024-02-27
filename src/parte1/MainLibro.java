package parte1;

import java.util.Locale;
import java.util.Scanner;

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

		// Creamos un objeto de tipo Libro
		Libro l1 = new Libro("El Señor de los Anillos", "J.R.R.Tolkien", 0, 2);

		// Llamamos a la función prestamo() y le asignamos el valor devuelto al boolean
		// sePuedePrestar
		sePuedePrestar = l1.prestamo();

		// Muestro cuantos ejemplares quedan disponibles
		System.out.println(l1.getEjemplaresDisponibles());

	}

}
