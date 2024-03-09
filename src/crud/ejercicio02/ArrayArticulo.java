package crud.ejercicio02;

/**
 * Clase en la que definiremos la tabla con los articulos y las funciones para
 * gestionar
 */
public class ArrayArticulo {

	/**
	 * Tabla de tipo Articulo en el que guardamos hasta 20 articulos diferentes
	 */
	public static Articulo almacen[] = new Articulo[20];

	/**
	 * Función que muestra cada uno de los artículos existentes en la tabla almacen
	 */
	public static void muestraArticulos() {
		// Bucle for-each que recorre cada elemento de la tabla almacen
		for (Articulo articulo : almacen) {
			// Si el elemento no es null
			if (articulo != null)
				// Lo muestra
				System.out.println(articulo);
		}

	}

	/**
	 * Funcion para anniadir un nuevo articulo dentro de la tabla almacen
	 * 
	 * @param codigo         Codigo del articulo
	 * @param descripcion    Descripcion del articulo
	 * @param precioDeCompra Precio de compra del articulo
	 * @param precioDeVenta  Precio de venta del articulo
	 * @param stock          Numero de unidades de cada articulo
	 * @return True o false segun si se ha hecho la operacion o no
	 */
	public static boolean anniadirArticulo(String codigo, String descripcion, double precioDeCompra,
			double precioDeVenta, int stock) {
		
		// Boolean que indica si se hañadido un nuevo articulo, inicializado como false
		boolean anniadido = false;

		// Creamos un nuevo artículo con los datos introducidos en el parámetro
		Articulo articulo = new Articulo(codigo, descripcion, precioDeCompra, precioDeVenta, stock);

		// Contador para las posiciones de la tabla
		int i = 0;

		// Mientras el valor del contador sea menor a la longitud de la tabla almacen y
		// dicho elemento sea null
		while (i < almacen.length && almacen[i] != null)
			// Incrementamos el contador
			i++;

		// Si el valor del contador es menor a la longitud de la tabla almacén
		if (i < almacen.length) {
			// Asignamos el objeto creado a dicha posición
			almacen[i] = articulo;
			// Y asignamos nuestro boolean como true
			anniadido = true;
		}
		
		// Devolverá el valor de nuestro boolean
		return anniadido;

	}
}
