package parte1.ejercicio01;

import java.util.Locale;
import java.util.Scanner;

/**
 * Clase Main para probar la clase del Ejercicio01 del Tema 5 parte1
 */
public class Main {

	/**
	 * Metodo main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// DNI que le pediremos al usuario
		String dni = "";
		// Nombre que le pediremos al usuario
		String nombre = "";
		// Saldo que le pediremos al usuario
		double saldo = 0;
		// Cantidad que retiraremos de nuestra cuenta creada
		double cantARetirar = 0;
		// Boolean que indicará si es posible retirar dinero
		boolean sePuedeRetirar;
		// Cantidad que ingresaremos en nuestra cuenta creada
		double cantAIngresar = 0;

		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);
		// Para poner decimales con un punto
		sc.useLocale(Locale.US);

		// Mientras el dni sea nulo o caractér vacío
		while (dni == null || dni == "") {
			// Le pedimos un dni al usuario
			System.out.println("Introduzca su dni");
			// Y lo asignamos al dni
			dni = sc.nextLine();
		}

		// Mientras el nombre sea nulo o caractér vacío
		while (nombre == null || nombre == "") {
			// Le pedimos un nombre al usuario
			System.out.println("Introduzca su nombre");
			// Y lo asignamos al dni
			nombre = sc.nextLine();
		}

		// Mientras el saldo sea menor o igual que 0
		while (saldo <= 0) {
			// Le pedimos un saldo inicial al usuario
			System.out.println("Introduzca el saldo inicial");
			// Y lo asignamos al saldo
			saldo = sc.nextDouble();

		}

		// Creamos un objeto de tipo CuentaCorriente con los datos introducidos
		CuentaCorriente c1 = new CuentaCorriente(dni, nombre, saldo);

		// Mostramos la información de la cuenta recien creada
		c1.muestraInformacion();

		// Mientras la cantidad a retirar sea menor o igual que 0
		while (cantARetirar <= 0) {
			// Le pedimos al usuario la cantidad a retirar
			System.out.println("Introduzca la cantidad que desee retirar:");
			// Y la asignamos a la cantidad a retirar
			cantARetirar = sc.nextDouble();
		}

		// Llamamos a la función sacarDinero() con la cantidad a retirar y le asignamos
		// el valor devuelto a nuestro
		// boolean
		sePuedeRetirar = c1.sacarDinero(cantARetirar);
		// Aplicamos un operador ternario para mostrar un mensaje u otro según el valor
		// de nuestro boolean
		System.out
				.println(sePuedeRetirar ? "Operación realizada con éxito" : "No es posible llevar a cabo la operación");
		// Salto de línea
		System.out.println();

		// Mostramos la información de la cuenta con el dinero extraído
		c1.muestraInformacion();

		// Mientras la cantidad a ingresar sea menor o igual que 0
		while (cantAIngresar <= 0) {
			// Le pedimos al usuario la cantidad a ingresar
			System.out.println("Introduzca la cantidad que desee ingresar:");
			// Y la asignamos a la cantidad a ingresar
			cantAIngresar = sc.nextDouble();
		}
		// Llamamos a la función ingresarDinero() con la cantidad a ingresar introducida
		c1.ingresarDinero(cantAIngresar);
		// Salto de línea
		System.out.println();
		
		// Mostramos la información de la cuenta con el dinero ingresado
		c1.muestraInformacion();
		
		// Cerramos el Scanner
		sc.close();



	}

}
