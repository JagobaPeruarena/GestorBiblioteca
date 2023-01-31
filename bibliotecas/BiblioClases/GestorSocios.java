package BiblioClases;

import java.util.Scanner;

public class GestorSocios {
	public static void run(Scanner scan) {
		int opcion=1;
		do {
			Menu.monstrarMenuPrincipal();
			opcion = Integer.parseInt(scan.nextLine());
			switch (opcion) {
			case Menu.VER_SOCIOS:
				System.out.println("Ver Socios");
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
