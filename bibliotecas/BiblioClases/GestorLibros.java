package BiblioClases;

import java.sql.SQLException;
import java.util.Scanner;

public class GestorLibros {
	public static void run(Scanner scan) throws ClassNotFoundException, SQLException {
		int opcion=1;
		GestorBBDD gesto = new GestorBBDD();
		do {
			Menu.monstrarMenuPrincipal();
			opcion = Integer.parseInt(scan.nextLine());
			switch (opcion) {
			case Menu.INSERTAR_LIBROS:
				System.out.println("Insertar Libro");
				Libro nlibro=pedirDatosLibro(scan);
				gesto.Conectar();
				gesto.insertarLibro(nlibro);
				gesto.cerrar();
				break;
			case Menu.ELIMINAR_LIBROS:
				System.out.println("Eliminar Libro");
				System.out.println("Di la id del libro");
				gesto.Conectar();
				gesto.eliminarLibro(Integer.parseInt(scan.nextLine()));
				gesto.cerrar();
				break;
			case Menu.VER_LIBROS:
				System.out.println("Ver Libro");
				Visor.mostrarLibros(gesto.getLibros());
				break;
			case Menu.SALIR:
				System.out.println("Saliendo");
				break;
			

			default:
				System.out.println("Numero incorrecto, intente de nuevo");
				break;
			}
		} while (opcion!=0);
	}
	public static Libro pedirDatosLibro(Scanner scan) {
		Libro libro = new Libro();
		System.out.println("Introduce el titulo del libro");
		libro.setTitulo(scan.nextLine());
		System.out.println("Introduce el autor");
		libro.setAutor(scan.nextLine());
		
		return libro;
	}
}
