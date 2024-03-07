package crud.ejercicio01;

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
		// Mientras el contador sea menor que la longitud de la tabla y el elemento en el que nos encontremos sea distinto de null
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
}
