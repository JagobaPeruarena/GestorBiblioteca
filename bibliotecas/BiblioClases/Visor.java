package BiblioClases;

import java.util.ArrayList;


public class Visor {
	public static void mostrarLibros(ArrayList<Libro> libros) {
		for (Libro libro: libros) {
			libro.toString();
		}
	}
	public static void mostrarLibro(Libro libro) {
		libro.toString();
		
	}
	public static void mostrarMensaje(String mensaje) {
		System.out.println(mensaje);
	}
	

}
