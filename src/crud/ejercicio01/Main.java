package crud.ejercicio01;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Opcion elegida por el usuario
		int opcion;

		// Nombre y nota media del alumno que le pediremos al usuario
		String nombre = "";
		double notaMedia;

		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);
		// Para permitir decimales con un punto
		sc.useLocale(Locale.US);

		do {

			// Mostramos el menú
			menu();

			// Asignamos la opción elegida por el usuario
			opcion = sc.nextInt();
			// Y limpiamos el buffer
			sc.nextLine();

			switch (opcion) {
			// Si la opcion es 1
			case 1:
				// Mostramos a todos los alumnos
				ArrayAlumno.imprimirAlumnos();
				break;

			// Si la opcion es 2
			case 2:
				// Le pedimos al usuario el nombre del alumno
				System.out.println("Introduzca el nombre del alumno");
				// Y lo asignamos
				nombre = sc.nextLine();
				// Le pedimos al usuario la nota media del alumno
				System.out.println("Introduzca la nota media del alumno");
				// Y lo asignamos
				notaMedia = sc.nextDouble();
				// Y limpiamos el buffer
				sc.nextLine();

				// Si se ha llevado a cabo el añadido del alumno
				if (ArrayAlumno.anniadirAlumno(nombre, notaMedia))
					// Se muestra este mensaje
					System.out.println("Alumno agregado correctamente");
				// En caso contrario
				else
					// Se muestra este otro mensaje
					System.out.println("Tabla llena, no se ha podido agregar al alumno");

				// Salto de línea
				System.out.println();
				break;

			// Si la opcion es 3
			case 3:
				// Le pedimos al usuario el nombre del alumno
				System.out.println("Introduzca el nombre del alumno");
				// Y lo asignamos
				nombre = sc.nextLine();
				// Le pedimos al usuario la nota media del alumno
				System.out.println("Introduzca la nueva nota del alumno");
				// Y lo asignamos
				notaMedia = sc.nextDouble();
				// Y limpiamos el buffer
				sc.nextLine();

				// Si se ha llevado a cabo la modificación del alumno
				if (ArrayAlumno.modificarAlumno(nombre, notaMedia))
					// Se muestra este mensaje
					System.out.println("Alumno modificado con éxito");
				// En caso contrario
				else
					// Se muestra este otro mensaje
					System.out.println("El alumno introducido no se encuentra en la tabla");

				// Salto de línea
				System.out.println();
				break;

			// Si la opcion es 4
			case 4:
				// Le pedimos al usuario el nombre del alumno
				System.out.println("Introduzca el nombre del alumno");
				// Y lo asignamos
				nombre = sc.nextLine();
				
				// Si se ha llevado a cabo la eliminación del alumno
				if (ArrayAlumno.borrarAlumno(nombre))
					// Se muestra este mensaje
					System.out.println("Alumno borrado con éxito");
				// En caso contrario
				else
					// Se muestra este otro mensaje
					System.out.println("El alumno introducido no se encuentra en la tabla");

				// Salto de línea
				System.out.println();
				break;

			}

			// Mientras la opción sea distinto de 5, repetimos las intrucciones del do
		} while (opcion != 5);

		// Mostramos este mensaje de finalización
		System.out.println("Saliendo del gestor de alumnos");

		// Cerramos el Scanner
		sc.close();
	}

	/**
	 * Funcion que muestra este menu
	 */
	public static void menu() {
		// Menú que se mostrará
		System.out.println("ALUMNOS/AS");
		System.out.println("==========");
		System.out.println();
		System.out.println("1. Listado.");
		System.out.println("2. Nuevo Alumno.");
		System.out.println("3. Modificar.");
		System.out.println("4. Borrar.");
		System.out.println("5. Salir.");
		System.out.println();

		// Le pedimos al usuario una opción
		System.out.println("Elija una opción para ejecutar");
		System.out.println();
	}

}
