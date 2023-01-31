package BiblioClases;

import java.util.Scanner;

public class GestorLibros {
	public static void run(Scanner scan) {
		int opcion=1;
		do {
			Menu.monstrarMenuPrincipal();
			opcion = Integer.parseInt(scan.nextLine());
			switch (opcion) {
			case Menu.INSERTAR_LIBROS:
				System.out.println("Insertar Libro");
				break;
			case Menu.ELIMINAR_LIBROS:
				System.out.println("Eliminar Libro");
				break;
			case Menu.VER_LIBROS:
				System.out.println("Ver Libro");
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
}
