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
		if (nombre != null && nombre.equals(""))
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

}
