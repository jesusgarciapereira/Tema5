package parte1.ejercicio04;

/**
 * Clase Main para probar la clase del Ejercicio04 del Tema 5 parte1
 */
public class Main {

	/**
	 * Metodo main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Precio de venta al público
		double precioPVP;
		// Descuento que aplicaremos
		int descuento = 50;
		// Precio de venta al público con descuento
		double precioPVPConDescuento;
		// Boolean que indicará si es posible vender
		boolean sePuedeVender;
		// Cantidad que almacenaremos
		int cantAlmacenar = 2;

		// Creamos un objeto con datos no válidos para comprobar que se muestren los
		// mensajes
		Articulo a0 = new Articulo(null, 0, -7);
		// Salto de línea
		System.out.println();

		// Creamos un objeto con datos válidos
		Articulo a1 = new Articulo("Pantalones vaqueros", 20, 57);

		// Mostramos la información del artículo recién creado
		a1.muestraInformacion();

		// Llamamos a la función getPVP() y asignamos el valor devuelto a la variable
		// del precio de venta al público
		precioPVP = a1.getPVP();
		// Y la mostramos
		System.out.println("Precio con IVA: " + precioPVP + "€");
		// Salto de línea
		System.out.println();

		// Llamamos a la función getPVPDescuento() con el descuento aplicado y asignamos
		// el valor devuelto a la
		// variable del precio con descuento
		precioPVPConDescuento = a1.getPVPDescuento(descuento);
		// Y la mostramos
		System.out.println("Precio con el " + descuento + "% de descuento: " + precioPVPConDescuento + "€");
		// Salto de línea
		System.out.println();

		// Llamamos a la función vender() con la cantidad a vender y le asignamos
		// el valor devuelto a nuestro boolean
		sePuedeVender = a1.vender(10);
		// Aplicamos un operador ternario para mostrar un mensaje u otro según el valor
		// de nuestro boolean
		System.out.println(sePuedeVender ? "Venta realizada con éxito" : "No es posible llevar a cabo la venta");
		// Salto de línea
		System.out.println();

		// Mostramos la información del artículo con la venta hecha
		a1.muestraInformacion();

		// Si la cantidad a almacenar es menor que 0
		if (cantAlmacenar < 0)
			// Mostraremos este mensaje
			System.out.println("No es posible almacenar esa cantidad");
		// En caso contrario
		else {
			// Mostraremos este mensaje
			System.out.println("Almacenamiento realizado");
			// Y llamamos a la función almacenar() para actualizar los datos
			a1.almacenar(cantAlmacenar);
		}
		// Salto de línea
		System.out.println();

		// Mostramos la información del artículo con el producto nuevo almacenado
		a1.muestraInformacion();
	}

}
