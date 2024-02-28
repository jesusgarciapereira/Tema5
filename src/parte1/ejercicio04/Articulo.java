package parte1.ejercicio04;

/**
 * Clase correspondiente al Ejercicio 4: Articulo
 */
public class Articulo {

	/**
	 * Nombre del articulo
	 */
	private String nombre = "";
	/**
	 * Precio del articulo (sin IVA)
	 */
	private double precioSinIVA;
	/**
	 * Constante IVA
	 */
	public final int IVA = 21;
	/**
	 * Cantidad de articulos que quedan
	 */
	private int cuantosQuedan;

	/**
	 * Constructor con todos los atributos privados como parametro
	 * 
	 * @param nombre
	 * @param precioSinIVA
	 * @param cuantosQuedan
	 */
	public Articulo(String nombre, double precioSinIVA, int cuantosQuedan) {
		// El parámetro nombre, no admitirá null ni caracter vacío
		if (nombre != null && !nombre.equals(""))
			this.nombre = nombre;
		// Si se intenta asignar, mostrará este mensaje
		else
			System.out.println("Nombre no válido");
		// El parámetro precioSinIVA, debe ser mayor que 0
		if (precioSinIVA > 0)
			this.precioSinIVA = precioSinIVA;
		// Si se intenta asignar lo contrario, mostrará este mensaje
		else
			System.out.println("Precio no válido");
		// El parámetro cuantosQuedan, debe ser mayor o igual que 0
		if (cuantosQuedan >= 0)
			this.cuantosQuedan = cuantosQuedan;
		// Si se intenta asignar lo contrario, mostrará este mensaje
		else
			System.out.println("Cantidad de artículos no válida");
	}

	/**
	 * Funcion muestraInformacion: Muestra la informacion detallada del articulo
	 */
	public void muestraInformacion() {
		// Mensaje con el nombre del artículo
		System.out.println("Nombre del artículo: " + nombre);
		// Mensaje con el precio del artículo (sin IVA)
		System.out.println("Precio del artículo (sin IVA): " + precioSinIVA + "€");
		// Mensaje con la cantidad de artículos que quedan en el almacén
		System.out.println("Cuántos quedan en el almacén: " + cuantosQuedan);
		// Salto de línea
		System.out.println();
	}

	/**
	 * Funcion getPVP: Devuelve el precio del producto con el IVA incluido
	 * 
	 * @return Precio de venta al publico (PVP)
	 */
	public double getPVP() {
		// Precio de venta al público que devolverá la función
		double precioPVP;
		// Asignamos a la variable la siguiente fórmula
		precioPVP = precioSinIVA * (IVA + 100) / 100;
		// Devolverá dicho valor
		return precioPVP;

	}

	/**
	 * Funcion getPVPDescuento: Devuelve el PVP con el descuento del parametro
	 * 
	 * @param descuento Porcentaje de descuento que se aplicara
	 * @return Precio de venta al publico con el descuento
	 */
	public double getPVPDescuento(double descuento) {
		// Precio con descuento que devolverá la función
		double precioPVPConDescuento;
		// PVP sin el descuento
		double precioPVPSinDescuento;

		// Asignamos al precio sin descuento la siguiente fórmula
		precioPVPSinDescuento = (precioSinIVA * (IVA + 100) / 100);
		// Asignamos al precio con descuento la siguiente fórmula
		precioPVPConDescuento = precioPVPSinDescuento * (100 - descuento) / 100;

		// Devolverá el valor del precio con descuento
		return precioPVPConDescuento;

	}

	/**
	 * Funcion vender: Indica si se puede llevar a cabo la venta o no y, si
	 * es posible, resta al atributo cuantosQuedan la cantidad a vender
	 * 
	 * @param x Cantidad de articulos que se venderan
	 * @return True o false segun si es posible llevar a cabo la venta
	 */
	public boolean vender(int x) {
		
		// Variable que devolverá la función
		boolean sePuedeVender = false;

		// Si el valor del parámetro es mayor que 0 y menor o igual que la cantidad que queda
		if (x > 0 && x <= cuantosQuedan) {
			// Se asignará nuestra variable como true
			sePuedeVender = true;
			// Y se le resta a cuantos quedan la cantidad que se venderá
			cuantosQuedan -= x;
		}
		// Devuelve el valor de nuestro boolean
		return sePuedeVender;
	}
	
	/**
	 * Funcion almacenar: Actualiza el atributo cuantosQuedan incrementandole la cantidad introducida en el parametro
	 * @param x Cantidad que incrementaremos al atributo
	 */
	public void almacenar (int x) {
		cuantosQuedan += x;
		
	}
}
