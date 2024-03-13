package crud.ejercicio02;

import java.util.Locale;
import java.util.Scanner;

public class Gestisimal {

	public static void main(String[] args) {

		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Para poder escribir decimales con un punto
		sc.useLocale(Locale.US);

		// Opción elegida por el usuario
		int opcion = 0;

		// Código del artículo que le pediremos al usuario
		String codigo = "";
		// Descripción del artículo que le pediremos al usuario
		String descripcion = "";
		// Precio de compra del artículo que le pediremos al usuario
		double precioDeCompra;
		// Precio de venta del artículo que le pediremos al usuario
		double precioDeVenta;
		// Stock del artículo que le pediremos al usuario
		int stock;

		do {
			// Mostramos el menú
			mostrarMenu();

			// Asignamos la opción elegida por el usuario
			opcion = sc.nextInt();
			// Y limpiamos el buffer
			sc.nextLine();

			switch (opcion) {
			case 1:
				// Mostramos todos los artículos
				ArrayArticulo.muestraArticulos();
				break;
			case 2:
				// Le pedimos al usuario el código del nuevo artículo
				System.out.println("Introduzca el código del nuevo artículo");
				// Y lo asignamos
				codigo = sc.nextLine();

				// Le pedimos al usuario la descripción del nuevo artículo
				System.out.println("Introduzca la descripción del nuevo artículo");
				// Y lo asignamos
				descripcion = sc.nextLine();

				// Le pedimos al usuario el precio de compra del nuevo artículo
				System.out.println("Introduzca el precio de compra del nuevo artículo");
				// Y lo asignamos
				precioDeCompra = sc.nextDouble();
				// Y limpiamos el buffer
				sc.nextLine();

				// Le pedimos al usuario el precio de venta del nuevo artículo
				System.out.println("Introduzca el precio de venta del nuevo artículo");
				// Y lo asignamos
				precioDeVenta = sc.nextDouble();
				// Y limpiamos el buffer
				sc.nextLine();

				// Le pedimos al usuario el stock del nuevo artículo
				System.out.println("Introduzca el stock del nuevo artículo");
				// Lo asignamos
				stock = sc.nextInt();
				// Y limpiamos el buffer
				sc.nextLine();

				// Si se ha podido añadidir el artículo
				if (ArrayArticulo.anniadirArticulo(codigo, descripcion, precioDeCompra, precioDeVenta, stock))
					// Mostramos este mensaje
					System.out.println("Artículo añadido correctamente");
				// En caso contrario
				else
					// Mostramos este otro mensaje
					System.out.println("No se ha podido añadir el artículo");

				// salto de línea
				System.out.println();
				break;
			case 3:
				// Le pedimos al usuario el código del artículo que se borrará
				System.out.println("Introduzca el código del artículo que quiera borrar");
				// Y lo asignamos
				codigo = sc.nextLine();

				// Si se ha podido borrar el artículo
				if (ArrayArticulo.borrarArticulo(codigo))
					// Mostramos este mensaje
					System.out.println("Artículo borrado correctamente");
				// En caso contrario
				else
					// Mostramos este otro mensaje
					System.out.println("No se encuentra dicho artículo en el almacén");

				break;
			case 4:

				break;
			case 5:

				break;
			case 6:

				break;
			case 7:
				break;

			}

			// Mientras la opción sea distinta de 7 repetiremos de nuevo las instrucciones
			// del do
		} while (opcion != 7);

		// Mostramos el mensaje de salida del programa
		System.out.println("Saliendo del programa");

		// Cerramos el Scanner
		sc.close();

	}

	/**
	 * Funcion que muestra el siguiente menu
	 */
	public static void mostrarMenu() {
		System.out.println("1. Listado");
		System.out.println("2. Alta");
		System.out.println("3. Baja");
		System.out.println("4. Modificación");
		System.out.println("5. Entrada de mercancía");
		System.out.println("6. Salida de mercancía");
		System.out.println("7. Salir");
		System.out.println();
		// Le pedimos al usuario una opción
		System.out.println("Seleccione una opción");

	}

}
