package crud.ejercicio03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Pizzeria {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Opción elegida por el usuario
		int opcion = 0;

		// Declaramos un objeto de tipo pizza
		Pizza pizza;
		// Posición en la que se encuentra la pizza en nuestra tabla
		int posicion;
		// Boolean que indica si una pizza ha sido servida
		boolean servida;

		// Atributos de la pizza que le pediremos al usuario
		int codigo;
		String tamannio = "";
		String tipo = "";

		do {
			// Muestra el menu
			muestraMenu();

			// Asignamos la opción elegida por el usuario
			opcion = pideOpcion();

			// Swich para cada caso de la opción
			switch (opcion) {
			case 1:
				// Mostramos todas las pizzas
				ArrayPizza.muestraPizzas();
				break;
			case 2:
				// Asignamos el tamaño y el tipo como cadena vacía
				tamannio = "";
				tipo = "";

				// Le pedimos al usuario el código de la nueva pizza
				System.out.println("Introduzca el código de la nueva pizza");
				// Lo asignamos al código
				codigo = sc.nextInt();
				// Y limpiamos el buffer
				sc.nextLine();

				// Mientras el tamaño no sea mediana o familiar
				while (!(tamannio.equalsIgnoreCase("Mediana") || tamannio.equalsIgnoreCase("Familiar"))) {
					// Le pedimos al usuario el código de la nueva pizza
					System.out.println("Introduzca el tamaño de la nueva pizza");
					// Lo asignamos al tamaño
					tamannio = sc.nextLine();
				}

				// Mientras el tipo no sea margarita, CuatroQuesos o funghi
				while (!(tipo.equalsIgnoreCase("Margarita") || tipo.equalsIgnoreCase("CuatroQuesos")
						|| tipo.equalsIgnoreCase("Funghi"))) {
					// Le pedimos al usuario el código de la nueva pizza
					System.out.println("Introduzca el tipo de la nueva pizza");
					// Lo asignamos al tipo
					tipo = sc.nextLine();
				}
				// Si se ha podido añadir la pizza
				if (ArrayPizza.anniadirPizza(codigo, tamannio, tipo))
					// Mostrará este mensaje
					System.out.println("Pizza añadida correctamente");
				// En caso contrario
				else
					// Mostrará este otro mensaje
					System.out.println("No se ha podido añadir la pizza");

				break;
			case 3:
				// Asignamos servida como false
				servida = false;

				// Le pedimos al usuario el código de la pizza que asignará como servida
				System.out.println("Introduzca el código de la pizza que será servida");
				// Lo asignamos al código
				codigo = sc.nextInt();
				// Y limpiamos el buffer
				sc.nextLine();

				// Asignamos a nuestro objeto una nueva pizza con el código introducido por el
				// usuario
				pizza = new Pizza(codigo);
				// Asignamos la posición en la que se encuentra la pizza
				posicion = ArrayPizza.encontrarPizza(pizza);
				// Asignamos nuestra pizza a la posición en la que se encuentra
				pizza = ArrayPizza.pizzas[posicion];

				// Si la pizza ha sido encontrada y su estado es "Pedida"
				if (posicion >= 0 && pizza.getEstado().equalsIgnoreCase("Pedida")) {
					// Asignamos el tipo de dicha pizza como "Servida"
					pizza.setEstado("Servida");
					// Y el boolean servida como true
					servida = true;
				}

				// Si la pizza está asignada como servida
				if (servida)
					// Mostrará este mensaje
					System.out.println("Pizza asignada como servida");
				// En caso contrario
				else
					// Mostrará este otro mensaje
					System.out.println("No se ha podido realizar la operación");
				break;
			case 4:
				break;
			default:
				break;
			}

			// Mientras la opción sea diferente de 4 repetiremos las instrucciones del do
		} while (opcion != 4);

		// Mensaje de salida del programa
		System.out.println("Saliendo del programa");

		// Cerramos el Scanner
		sc.close();
	}

	/**
	 * Funcion que muestra el menu
	 */
	public static void muestraMenu() {

		System.out.println("1. Listado de pizzas");
		System.out.println("2. Nuevo pedido");
		System.out.println("3. Pizza servida");
		System.out.println("4. Salir");

	}

	/**
	 * Funcion para pedir una opcion al usuario
	 * 
	 * @return Opcion elegida por el usuario
	 */
	private static int pideOpcion() {
		// Opcion elegida
		int opcion = 0;
		do {
			try {
				// Le pedimos al usuario una opción
				System.out.println("Introduce una opción");
				// Y la asignamos
				opcion = sc.nextInt();
				// Si no es escribe un número entero
			} catch (InputMismatchException e) {
				// Se mostrará este mensaje
				System.out.println("Tipo de dato erróneo");
			} finally {
				// Siempre limpiaremos el buffer
				sc.nextLine();
			}
			// Si la opción no está entre 1 y 4 se repetirán las instrucciones del do
		} while (opcion < 1 || opcion > 4);

		// Devolverá la opción elegida
		return opcion;
	}

}
