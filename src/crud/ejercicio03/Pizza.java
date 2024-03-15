package crud.ejercicio03;

/**
 * Clase que representa a las pizzas de nuestra pizzeria
 */
public class Pizza {

	/**
	 * Codigo unico para cada pizza
	 */
	private int codigo;

	/**
	 * Tamannio de la pizza
	 */
	private String tamannio = "";

	/**
	 * Sabor de la pizza
	 */
	private String tipo = "";

	/**
	 * Estado de la pizza, por defecto, "pedida"
	 */
	private String estado = "pedida";

	/**
	 * Constructor sin parametros
	 */
	public Pizza() {

	}

	/**
	 * Contructor con parametro codigo
	 * 
	 * @param codigo Codigo de la pizza
	 */
	public Pizza(int codigo) {
		// El parámetro codigo sólo admitirá números positivos
		if (codigo > 0)
			this.codigo = codigo;
	}

	/**
	 * Contructor con el codigo, el tamannio y el tipo como parametros
	 * 
	 * @param codigo   Codigo de la pizza
	 * @param tamannio Tamannio de la pizza
	 * @param tipo     Tipo (sabor) de la pizza
	 */
	public Pizza(int codigo, String tamannio, String tipo) {
		// El parámetro codigo sólo admitirá números positivos
		if (codigo > 0)
			this.codigo = codigo;
		// El parámetro tamannio no permitirá ni null ni cadena vacía y sólo permitirá
		// "Mediana" o "Familiar"
		if (tamannio != null && !tamannio.equals("")
				&& (tamannio.equalsIgnoreCase("Mediana") || tamannio.equalsIgnoreCase("Familiar")))
			this.tamannio = tamannio;
		// El parámetro tipo no permitirá ni null ni cadena vacía y sólo permitirá
		// "Margarita", "CuatroQuesos" o "Funghi"
		if (tipo != null && !tipo.equals("") && (tipo.equalsIgnoreCase("Margarita")
				|| tipo.equalsIgnoreCase("CuatroQuesos") || tipo.equalsIgnoreCase("Funghi")))
			this.tipo = tipo;
	}

	/**
	 * Metodo que devuelve el valor del codigo de la pizza
	 * 
	 * @return Valor del atributo codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * Metodo que modifica el valor del codigo por el dato introducido en el
	 * parametro
	 * 
	 * @param codigo Nuevo codigo que se le asigna
	 */
	public void setCodigo(int codigo) {
		// El parámetro codigo sólo admitirá números positivos
		if (codigo > 0)
			this.codigo = codigo;
	}

	/**
	 * Metodo que devuelve el valor del tamannio de la pizza
	 * 
	 * @return Valor del atributo tammanio
	 */
	public String getTamannio() {
		return tamannio;
	}

	/**
	 * Metodo que modifica el valor del tamannio por el dato introducido en el
	 * parametro
	 * 
	 * @param codigo Nuevo tamannio que se le asigna
	 */
	public void setTamannio(String tamannio) {
		// El parámetro tamannio no permitirá ni null ni cadena vacía y sólo permitirá
		// "Mediana" o "Familiar"
		if (tamannio != null && !tamannio.equals("")
				&& (tamannio.equalsIgnoreCase("Mediana") || tamannio.equalsIgnoreCase("Familiar")))
			this.tamannio = tamannio;
	}

	/**
	 * Metodo que devuelve el valor del tipo (sabor) de la pizza
	 * 
	 * @return Valor del atributo tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * Metodo que modifica el valor del tipo por el dato introducido en el parametro
	 * 
	 * @param codigo Nuevo tipo que se le asigna
	 */
	public void setTipo(String tipo) {
		// El parámetro tipo no permitirá ni null ni cadena vacía y sólo permitirá
		// "Margarita", "CuatroQuesos" o "Funghi"
		if (tipo != null && !tipo.equals("") && (tipo.equalsIgnoreCase("Margarita")
				|| tipo.equalsIgnoreCase("CuatroQuesos") || tipo.equalsIgnoreCase("Funghi")))
			this.tipo = tipo;
	}

	/**
	 * Metodo que devuelve el valor del estado de la pizza
	 * 
	 * @return Valor del atributo estado
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * Metodo que modifica el valor del estado por el dato introducido en el
	 * parametro
	 * 
	 * @param codigo Nuevo estado que se le asigna
	 */
	public void setEstado(String estado) {
		// El parámetro estado no permitirá ni null ni cadena vacía y sólo permitirá
		// "Servida"
		if (estado != null && !estado.equals("") && estado.equalsIgnoreCase("Servida"))
			this.estado = estado;
	}

	/**
	 * Metodo toString sobreescrito
	 */
	@Override
	public String toString() {
		// Cadena que devolverá la función
		String cadena = "--------------------------\n";

		// Le concatenamos cada uno de los datos
		cadena += "Código: " + this.codigo + "\n";
		cadena += "Tamaño: " + this.tamannio + "\n";
		cadena += "Tipo: " + this.tipo + "\n";
		cadena += "Estado: " + this.estado + "\n";

		// Devolverá la cadena completa
		return cadena;
	}

	/**
	 * Metodo equals sobreescrito
	 */
	@Override
	public boolean equals(Object obj) {
		// Variable que determina si ambos objetos son iguales
		boolean iguales = false;

		// Hacemos una copia del parámetro y lo casteamos como tipo Pizza
		Pizza pizza2 = (Pizza) obj;

		// Si ambos objetos tienen el mismo código
		if (this.codigo == pizza2.codigo)
			// Asignamos iguales como true
			iguales = true;

		// Devolverá el valor de iguales
		return iguales;
	}

}
