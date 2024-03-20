package crud.ejercicio03;

/**
 * Clase en la que definiremos la tabla con las pizzas y las funciones para
 * gestionar la pizzeria
 */
public class ArrayPizza {

	// Tabla en la que guardaremos nuestras pizzas, hasta 50
	public static Pizza pizzas[] = new Pizza[50];

	/**
	 * Funcion que muestra todas las pizzas de la tabla
	 */
	public static void muestraPizzas() {
		// Bucle for-each que recorre todos los elementos de la tabla
		for (Pizza pizza : pizzas) {
			// Si la pizza no es null
			if (pizza != null)
				// La muestra
				System.out.println(pizza);
		}

	}

	/**
	 * Funcion que devuelve la primera posicion libre que haya en la tabla, si no
	 * hay devuelve -1
	 * 
	 * @return Posicion libre
	 */
	public static int posicionLibre() {
		// Posicion que haya libre, inicializado en -1
		int posicion = -1;
		// Contador
		int i = 0;

		// Mientras el contador sea menor que la longitud de la tabla y no se haya encontrado una posición libre
		while (i < pizzas.length && posicion == -1) {
			// Si en la posición en la que nos encontramos no hay nada
			if (pizzas[i] == null) {
				// Asigna el contador a la posición
				posicion = 1;
			}
			// Incrementamos el contador
			i++;
		}

		// Devuelve la posición en la que haya un hueco libre
		return posicion;
	}

	/**
	 * Funcion que anniade una nueva pizza a nuestra tabla de pizzas
	 * 
	 * @param codigo   Codigo unico de la pizza
	 * @param tamannio Tammanio de la pizza
	 * @param tipo     Tipo de pizza
	 * @return True o false segun si se ha podido hacer la operacion o no
	 */
	public static boolean anniadirPizza(int codigo, String tamannio, String tipo) {
		// Boolean que indica si se ha añadido la pizza
		boolean anniadida = false;
		// Contador
		int i = 0;

		// Creamos un objeto de tipo pizza con los parámetros del método
		Pizza pizza = new Pizza(codigo, tamannio, tipo);

		// Asignamos a la posición el valor devuelto por la función encontrarPizza()
		int posicion = encontrarPizza(pizza);

		// Si la posición es -1 (no encontrado)
		if (posicion == -1) {

			// Mientras el contador sea menor que la longitud de la tabla y la pizza que nos
			// encontremos sea distinto de null
			while (i < pizzas.length && pizzas[i] != null)
				// Incrementamos el contador
				i++;

			// Si el contador es menor que la longitud de la tabla
			if (i < pizzas.length) {
				// Asignamos nuestra pizza en la posición en la que nos encontremos
				pizzas[i] = pizza;
				// Y asignamos nuestro boolean como true
				anniadida = true;
			}
		}

		// Devolverá el valor de nuestro boolean
		return anniadida;
	}

	/**
	 * Funcion que devuelve la posicion en la que se encuentra la pizza del
	 * parametro
	 * 
	 * @param pizza Objeto de tipo Pizza que buscaremos
	 * @return Posicion en la que se encuentra la pizza, -1 si no la encuentra
	 */
	public static int encontrarPizza(Pizza pizza) {
		// Contador
		int i = 0;
		// Posición en la que se encuentra la pizza, -1 representa que no está
		int posicion = -1;

		// Mientras el contador sea menor que la longitud de la tabla y el objeto en que
		// nos encontremos no sea null y no se haya encontrado
		while (i < pizzas.length && pizzas[i] != null && posicion == -1) {

			// Si el contador es menor que la longitud de la tabla y el objeto en que nos
			// encontramos es igual al objeto del parámetro
			if (i < pizzas.length && pizzas[i].equals(pizza))
				// Asignamos a la posición el valor del contador
				posicion = i;

			// Incrementamos el contador
			i++;
		}

		// Devolverá la posición en la que se encuentre
		return posicion;

	}
}
