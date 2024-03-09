package crud.ejercicio02;

/**
 * Clase que representa a los articulos de nuestro almacen
 */
public class Articulo {
	/**
	 * Codigo del articulo
	 */
	private String codigo = "";

	/**
	 * Descripcion del articulo
	 */
	private String descripcion = "";

	/**
	 * Precio de compra del articulo
	 */
	private double precioDeCompra;

	/**
	 * Precio de venta del articulo
	 */
	private double precioDeVenta;

	/**
	 * Numero de unidades de cada articulo
	 */
	private int stock;

	/**
	 * Constructor sin parametros
	 */
	public Articulo() {

	}

	/**
	 * Constructor con todos los parametros
	 * 
	 * @param codigo         Codigo del articulo
	 * @param descripcion    Descripcion del articulo
	 * @param precioDeCompra Precio de compra del articulo
	 * @param precioDeVenta  Precio de venta del articulo
	 * @param stock          Numero de unidades de cada articulo
	 */
	public Articulo(String codigo, String descripcion, double precioDeCompra, double precioDeVenta, int stock) {
		// Si el parámetro codigo es distinto de null y no es una cadena vacía
		if (codigo != null && !codigo.equals(""))
			// Se asigna al atributo codigo
			this.codigo = codigo;
		// Si el parámetro descripcion es distinto de null y no es una cadena vacía
		if (descripcion != null && !descripcion.equals(""))
			// Se asigna al atributo descripcion
			this.descripcion = descripcion;
		// Si el parámetro precioDeCompra es mayor que 0
		if (precioDeCompra > 0)
			// Se asigna al atributo precioDeCompra
			this.precioDeCompra = precioDeCompra;
		// Si el parámetro precioDeVenta es mayor que 0
		if (precioDeVenta > 0)
			// Se asigna al atributo precioDeVenta
			this.precioDeVenta = precioDeVenta;
		// Si el parámetro stock es mayor o igual que 0
		if (stock >= 0)
			// Se asigna al atributo stock
			this.stock = stock;
	}

	/**
	 * Funcion que devuelve el valor del atributo codigo
	 * 
	 * @return Atributo codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * Funcion que modifica el valor del atributo codigo
	 * 
	 * @param codigo Nuevo codigo que le asignamos
	 */
	public void setCodigo(String codigo) {
		// Si el parámetro codigo es distinto de null y no es una cadena vacía
		if (codigo != null && !codigo.equals(""))
			// Se asigna al atributo codigo
			this.codigo = codigo;
	}

	/**
	 * Funcion que devuelve el valor del atributo descripcion
	 * 
	 * @return Atributo descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * Funcion que modifica el valor del atributo descripcion
	 * 
	 * @param codigo Nueva descripcion que le asignamos
	 */
	public void setDescripcion(String descripcion) {
		// Si el parámetro descripcion es distinto de null y no es una cadena vacía
		if (descripcion != null && !descripcion.equals(""))
			// Se asigna al atributo descripcion
			this.descripcion = descripcion;
	}

	/**
	 * Funcion que devuelve el valor del atributo precioDeCompra
	 * 
	 * @return Atributo precioDeCompra
	 */
	public double getPrecioDeCompra() {
		return precioDeCompra;
	}

	/**
	 * Funcion que modifica el valor del atributo precioDeCompra
	 * 
	 * @param codigo Nuevo precio de compra que le asignamos
	 */
	public void setPrecioDeCompra(double precioDeCompra) {
		// Si el parámetro precioDeCompra es mayor que 0
		if (precioDeCompra > 0)
			// Se asigna al atributo precioDeCompra
			this.precioDeCompra = precioDeCompra;
	}

	/**
	 * Funcion que devuelve el valor del atributo precioDeVenta
	 * 
	 * @return Atributo precioDeVenta
	 */
	public double getPrecioDeVenta() {
		return precioDeVenta;
	}

	/**
	 * Funcion que modifica el valor del atributo precioDeVenta
	 * 
	 * @param codigo Nuevo precio de venta que le asignamos
	 */
	public void setPrecioDeVenta(double precioDeVenta) {
		// Si el parámetro precioDeVenta es mayor que 0
		if (precioDeVenta > 0)
			// Se asigna al atributo precioDeVenta
			this.precioDeVenta = precioDeVenta;
	}

	/**
	 * Funcion que devuelve el valor del atributo stock
	 * 
	 * @return Atributo stock
	 */
	public int getStock() {
		return stock;
	}

	/**
	 * Funcion que modifica el valor del atributo stock
	 * 
	 * @param codigo Nuevo stock que le asignamos
	 */
	public void setStock(int stock) {
		// Si el parámetro stock es mayor o igual que 0
		if (stock >= 0)
			// Se asigna al atributo stock
			this.stock = stock;
	}
	
	@Override
	/**
	 * Metodo toString sobreescrito
	 */
	public String toString() {
		// Muestra todos los atributos del objeto de tipo Articulo
		return "Código: " + this.codigo + "\n"
				+ "Descripción: " + this.descripcion + "\n"
				+ "Precio de compra: " + this.precioDeCompra + "\n"
				+ "Precio de venta: " + this.precioDeVenta + "\n"
				+ "Stock: " + this.stock + "\n";
	}

}