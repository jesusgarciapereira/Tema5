package crud.ejercicio01;

/**
 * Clase en la que definiremos la tabla con los alumnos y las funciones para
 * gestionar
 */
public class ArrayAlumno {

	/**
	 * Tabla de tipo Alumno en el que guardamos hasta 30 alumnos
	 */
	public static Alumno[] alumnos = new Alumno[30];

	/**
	 * Funcion que imprime a todos los alumnos que existan en nuestra tabla
	 */
	public static void imprimirAlumnos() {

		// For each para recorrer cada objeto de la tabla
		for (Alumno alumno : alumnos) {
			// Si el alumno no es null
			if (alumno != null)
				// Lo muestra
				System.out.println(alumno);
		}

		// Salto de línea
		System.out.println();

	}

	/**
	 * Funcion que indica si se ha anniadido un nuevo alumno y, si es posible,
	 * agrega un nuevo alumno a la tabla
	 * 
	 * @param nombre    Nombre del alumno
	 * @param notaMedia Nota media del alumno
	 * @return True o false segun si se ha hecho esta operacion o no
	 */
	public static boolean anniadirAlumno(String nombre, double notaMedia) {

		// Boolean que indica si se ha añadido a un nuevo alumno
		boolean anniadidoHecho = false;

		// Creamos un objeto de tipo Alumno con los datos del parámetro
		Alumno alum = new Alumno(nombre, notaMedia);

		// Contador
		int i = 0;
		// Mientras el contador sea menor que la longitud de la tabla y el elemento en
		// el que nos encontremos sea distinto de null
		while (i < alumnos.length && alumnos[i] != null) {
			// Incrementamos el contador
			i++;
		}

		// Si el contador es menor que la longitud de la tabla
		if (i < alumnos.length) {
			// Asignamos nuestro objeto a dicha posición
			alumnos[i] = alum;
			// Y asignamos el boolean como true
			anniadidoHecho = true;
		}

		// Devolverá el valor de nuestro boolean
		return anniadidoHecho;
	}

	/**
	 * Funcion que indica si se ha modificado un alumno y, si es posible, le cambia
	 * la nota
	 * 
	 * @param nombre    Nombre del alumno a buscar
	 * @param notaMedia Nota media del alumno que modificaremos
	 * @return True o false segun si se ha hecho esta operacion o no
	 */
	public static boolean modificarAlumno(String nombre, double notaMedia) {
		// Boolean que indica si se ha modificado al alumno
		boolean modificadoHecho = false;
		// Asignamos al contador el valor devuelto por la función buscarAlumno()
		int i = buscarAlumno(nombre);

		// Si el contador es menor a la longitud de la tabla
		if (i < alumnos.length) {
			// Modifica la nota del alumno con la nota del parámetro
			alumnos[i].setNotaMedia(notaMedia);
			// Y asignamos el boolean como true
			modificadoHecho = true;
		}
		// Devolverá el valor de nuestro boolean
		return modificadoHecho;
	}

	/**
	 * Funcion que indica si se ha borrado un alumno y, si es posible, lo borra
	 * 
	 * @param nombre Nombre del alumno a buscar
	 * @return True o false segun si se ha hecho esta operacion o no
	 */
	public static boolean borrarAlumno(String nombre) {
		// Boolean que indica si se ha borrado al alumno
		boolean borradoHecho = false;
		// Asignamos al contador el valor devuelto por la función buscarAlumno()
		int i = buscarAlumno(nombre);

		// Si el contador es menor a la longitud de la tabla
		if (i < alumnos.length) {
			// "Borrará" al alumno situado en esa posición asignándolo como null
			alumnos[i] = null;
			// Y asignamos el boolean como true
			borradoHecho = true;
		}
		// Devolverá el valor de nuestro boolean
		return borradoHecho;
	}

	/**
	 * Funcion que indica la posicion de la tabla alumnos en la que se encuentra el
	 * alumno que tenga como nombre el introducido en el parametro
	 * 
	 * @param nombre Nombre a buscar en la tabla alumnos
	 * @return Posicion en la que encuentra
	 */
	public static int buscarAlumno(String nombre) {
		// Contador
		int i = 0;

		// Mientras el contador sea menor que la longitud de la tabla alumnos y el
		// elemento en el que nos encontremos sea null o no coincida con el nombre
		// introducido en el parámetro
		while (i < alumnos.length && (alumnos[i] == null || !alumnos[i].getNombre().equals(nombre)))
			// Incrementamos el contador
			i++;

		// Devolverá el valor del contador
		return i;
	}
}
