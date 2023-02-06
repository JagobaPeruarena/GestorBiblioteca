package BiblioClases;

import java.sql.SQLException;
import java.util.Scanner;

public class GestorSocios {
	public static void run(Scanner scan) throws ClassNotFoundException, SQLException {
		int opcion=1;
		GestorBBDD gesto = new GestorBBDD();
		do {
			Menu.monstrarMenuPrincipal();
			opcion = Integer.parseInt(scan.nextLine());
			switch (opcion) {
			case Menu.INSERTAR_SOCIOS:
				System.out.println("Insertar Libro");
				gesto.Conectar();
				gesto.insertarSocio(null);
				gesto.cerrar();
				break;
			case Menu.ELIMINAR_SOCIOS:
				System.out.println("Eliminar Libro");
				gesto.Conectar();
				gesto.eliminarSocio(0);
				gesto.cerrar();
				break;
			case Menu.VER_SOCIOS:
				System.out.println("Ver Libro");
				gesto.getSocio(0);
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
