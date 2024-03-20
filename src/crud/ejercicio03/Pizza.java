package crud.ejercicio03;

/**
 * Clase que representa a las pizzas de nuestra pizzeria
 */
public class Pizza {

	enum Tamannio {
		MEDIANA, FAMILIAR
	};

	enum Tipo {
		MARGARITA, CUATRO_QUESOS, FUNGHI
	};

	enum Estado {
		PEDIDA, SERVIDA
	}

	/**
	 * Codigo unico para cada pizza
	 */
	private int codigo;

	/**
	 * Tamannio de la pizza
	 */
	private Tamannio tamannio;

	/**
	 * Sabor de la pizza
	 */
	private Tipo tipo;

	/**
	 * Estado de la pizza, por defecto, "pedida"
	 */
	private Estado estado = Estado.PEDIDA;

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
		// El parámetro tamannio no permitirá ni null ni cadena vacía
		if (tamannio != null && !tamannio.equals(""))
			this.tamannio = Tamannio.valueOf(tamannio);
		// El parámetro tipo no permitirá ni null ni cadena vacía
		if (tipo != null && !tipo.equals(""))
			this.tipo = Tipo.valueOf(tipo);
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
	 * Metodo que devuelve un String con el valor del tamannio de la pizza
	 * 
	 * @return Valor del atributo tammanio
	 */
	public String getTamannio() {
		return String.valueOf(tamannio);
	}

	/**
	 * Metodo que devuelve un String con el valor del tipo (sabor) de la pizza
	 * 
	 * @return Valor del atributo tipo
	 */
	public String getTipo() {
		return String.valueOf(tipo);
	}

	/**
	 * Metodo que devuelve un String con el valor del estado de la pizza
	 * 
	 * @return Valor del atributo estado
	 */
	public String getEstado() {
		return String.valueOf(estado);
	}

	/**
	 * Metodo para cambiar el estado a SERVIDA
	 */
	public void cambiaEstado() {
		this.estado = Estado.SERVIDA;
	}

	// Estos tres por ahora no
	public void setTamannio(Tamannio tamannio) {
		this.tamannio = tamannio;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	/**
	 * Metodo que modifica el valor del estado por el dato introducido en el
	 * parametro
	 * 
	 * @param estado Nuevo estado que se le asigna
	 */
	public void setEstado(String estado) {
		// El parámetro estado no permitirá ni null ni cadena vacía
		if (estado != null && !estado.equals(""))
			this.estado = Estado.valueOf(estado);
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
