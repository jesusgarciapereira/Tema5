package crud.ejercicio03;

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
			opcion = sc.nextInt();
			// Limpiamos el buffer
			sc.nextLine();

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
		// Menu que se mostrará
		String menu = "\n";

		// Concatenamos todos los datos
		menu += "1. Listado de pizzas\n";
		menu += "2. Nuevo pedido\n";
		menu += "3. Pizza servida\n";
		menu += "4. Salir\n\n";
		menu += "Seleccione una opción";

		// Mostramos el menu
		System.out.println(menu);

	}

}
