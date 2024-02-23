package parte1;

/**
 * Clase correspondiente al Ejercicio 1: Cuenta corriente
 */
public class CuentaCorriente {

	/**
	 * DNI del titular de la cuenta
	 */
	private String dni;
	/**
	 * Nombre del titular de la cuenta
	 */
	private String nombre;
	/**
	 * Saldo inicial
	 */
	private double saldo;

	/**
	 * Constructor con Con el DNI del titular de la cuenta y un saldo inicial
	 * 
	 * @param dni
	 * @param saldo
	 */
	public CuentaCorriente(String dni, double saldo) {
		// El parámetro dni, no admitirá null ni caracter vacío
		if (dni != null && !dni.equals(""))
			this.dni = dni;
		// El parámetro saldo, debe ser mayor que 0
		if (saldo > 0)
			this.saldo = saldo;
	}

	/**
	 * Constructor con todos los atributos como parametro
	 * 
	 * @param dni
	 * @param nombre
	 * @param saldo
	 */
	public CuentaCorriente(String dni, String nombre, double saldo) {
		// El parámetro dni, no admitirá null ni caracter vacío
		if (dni != null && !dni.equals(""))
			this.dni = dni;
		// El parámetro nombre, no admitirá null ni caracter vacío
		if (nombre != null && !nombre.equals(""))
			this.nombre = nombre;
		// El parámetro saldo, debe ser mayor que 0
		if (saldo > 0)
			this.saldo = saldo;
	}

	/**
	 * Funcion sacarDinero: Indica si se puede llevar a cabo la operacion o no y, si es
	 * posible, resta al saldo la cantidad a sacar
	 * 
	 * @param cantASacar Cantidad que se le restara al saldo
	 * @return True o false segun si es posible llevar a cabo la operacion
	 */
	public boolean sacarDinero(int cantASacar) {
		
		// Variable que devolverá la función
		boolean sacarDinero;
		
		// Si el saldo de la cuenta corriente es menor o igual que 0
		if (saldo <= 0)
			// Se asignará nuestra variable como false
			sacarDinero = false;
		// En caso contrario
		else {
			// Se asignará nuestra variable como true
			sacarDinero = true;
			// Y se le resta al saldo la cantidad a sacar
			saldo -= cantASacar;
		}
		
		// Devuelve el valor de nuestro boolean
		return sacarDinero;

	}

	/**
	 * Funcion ingresarDinero: Incrementa el saldo de la cuenta segun la cantidad
	 * del parametro
	 * 
	 * @param cantAIngresar Cantidad de dinero que se ingresara en la cuenta
	 */
	public void ingresarDinero(int cantAIngresar) {
		// Al saldo le incrementamos la cantidad a ingresar del parámetro
		saldo += cantAIngresar;
	
	}
	
	/**
	 * Funcion muestraInformacion: Muestra la informacion detallada de la cuenta corriente 
	 */
	public void muestraInformacion() {
		// Mensaje con el nombre del titular de la cuenta
		System.out.println("Titular de la cuenta: " + nombre);
		// Mensaje con el DNI del titular de la cuenta
		System.out.println("DNI del titular " + dni);
		// Mensaje con el saldo actual de la cuenta
		System.out.println("Saldo actual: " + saldo + "€");
	}

}
