package crud.ejercicio01;

/**
 * Clase que representa a un Alumno
 */
public class Alumno {

	/**
	 * Nombre del alumno
	 */
	private String nombre = "";

	/**
	 * Nota media del alumno
	 */
	private double notaMedia;

	/**
	 * Constructor sin parametros
	 */
	public Alumno() {
	}

	/**
	 * Constructor con todos los atributos como parametros
	 * 
	 * @param nombre    Nombre del alumno
	 * @param notaMedia Nota media del alumno
	 */
	public Alumno(String nombre, double notaMedia) {

		// Si el parámetro nombre es distinto de null y no es una cadena vacía
		if (nombre != null && !nombre.equals(""))
			// Se asigna al atributo nombre
			this.nombre = nombre;
		// Si el parámetro notaMedia está entre 0 y 10, ambos inclusive
		if (notaMedia >= 0 && notaMedia <= 10)
			// Se asigna al atributo notaMedia
			this.notaMedia = notaMedia;
	}

	/**
	 * Devuelve el valor del atributo nombre
	 * 
	 * @return Atributo nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Modifica el valor del atributo nombre
	 * 
	 * @param Nuevo nombre que le asignamos
	 */
	public void setNombre(String nombre) {
		// Si el parámetro nombre es distinto de null y no es una cadena vacía
		if (nombre != null && !nombre.equals(""))
			// Se asigna al atributo nombre
			this.nombre = nombre;
	}

	/**
	 * Devuelve el valor del atributo de la nota media
	 * 
	 * @return Atributo de la nota media
	 */
	public double getNotaMedia() {
		return notaMedia;
	}

	/**
	 * Modifica el valor del atributo de la nota media
	 * 
	 * @param Nuevo nota media que le asignamos
	 */
	public void setNotaMedia(double notaMedia) {
		// Si el parámetro notaMedia está entre 0 y 10, ambos inclusive
		if (notaMedia >= 0 && notaMedia <= 10)
			// Se asigna al atributo notaMedia
			this.notaMedia = notaMedia;
	}
	

	@Override
	/**
	 * Metodo toString sobreescrito
	 */
	public String toString() {
		// Muestra el nombre y la nota media del objeto Alumno
		return this.nombre + ": " + this.notaMedia;
	}

}
