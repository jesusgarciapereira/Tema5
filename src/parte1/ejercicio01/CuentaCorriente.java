package parte1.ejercicio01;

/**
 * Clase correspondiente al Ejercicio 1: Cuenta corriente
 */
public class CuentaCorriente {

	/**
	 * DNI del titular de la cuenta
	 */
	private String dni = "";
	/**
	 * Nombre del titular de la cuenta
	 */
	private String nombre = "";
	/**
	 * Saldo de la cuenta
	 */
	private double saldo;

	/**
	 * Constructor con el DNI del titular de la cuenta y un saldo inicial
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

//		// PUEDE SIMPLIFICARSE ASÍ
//		// Puedes llamar a un constructor dentro de otro constructor, como en este caso
//		this(dni, saldo);
//		// El parámetro nombre, no admitirá null ni caracter vacío
//		if (nombre != null && !nombre.equals(""))
//			this.nombre = nombre;
	}

	/**
	 * Getter del dni
	 * @return Valor del atributo dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * Getter del nombre
	 * @return Valor del atributo nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Setter del nombre
	 * @param nombre Atributo que cambiaremos
	 */
	public void setNombre(String nombre) {
		if (nombre != null && !nombre.equals(""))
			this.nombre = nombre;
	}

	/**
	 * Getter del saldo
	 * @return Valor del atributo saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Funcion sacarDinero: Indica si se puede llevar a cabo la operacion o no y, si
	 * es posible, resta al saldo la cantidad a sacar
	 * 
	 * @param cantASacar Cantidad que se le restara al saldo
	 * @return True o false segun si es posible llevar a cabo la operacion
	 */
	public boolean sacarDinero(double cantASacar) {

		// Variable que devolverá la función
		boolean transaccion = false;

		// Si el saldo de la cuenta corriente es mayor que 0 y es mayor o igual que el
		// valor del parámetro
		if (this.saldo > 0 && this.saldo >= cantASacar) {
			// Se asignará nuestra variable como true
			transaccion = true;
			// Y se le resta al saldo la cantidad a sacar
			this.saldo -= cantASacar;
		}
		// Devuelve el valor de nuestro boolean
		return transaccion;

	}

	/**
	 * Funcion ingresarDinero: Incrementa el saldo de la cuenta segun la cantidad
	 * introducida como parametro
	 * 
	 * @param cantAIngresar Cantidad de dinero que se ingresara en la cuenta
	 */
	public void ingresarDinero(double cantAIngresar) {
		// Al saldo le incrementamos la cantidad a ingresar del parámetro
		this.saldo += cantAIngresar;

	}

	/**
	 * Funcion muestraInformacion: Muestra la informacion detallada de la cuenta
	 * corriente
	 */
	public void muestraInformacion() {
		// Mensaje con el nombre del titular de la cuenta
		System.out.println("Titular de la cuenta: " + this.nombre);
		// Mensaje con el DNI del titular de la cuenta
		System.out.println("DNI del titular " + this.dni);
		// Mensaje con el saldo actual de la cuenta
		System.out.println("Saldo actual: " + this.saldo + "€");
		// Salto de línea
		System.out.println();
	}

}
