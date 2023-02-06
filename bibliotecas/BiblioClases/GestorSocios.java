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
				System.out.println("Insertar Socio");
				Socio nSocio = pedirDatosSocio(scan);
				gesto.Conectar();
				gesto.insertarSocio(nSocio);
				gesto.cerrar();
				break;
			case Menu.ELIMINAR_SOCIOS:
				System.out.println("Eliminar Socio");
				gesto.Conectar();
				gesto.eliminarSocio(0);
				gesto.cerrar();
				break;
			case Menu.VER_SOCIOS:
				System.out.println("Ver Socios");
				Visor.mostrarSocios(gesto.getSocios());
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
	public static Socio pedirDatosSocio(Scanner scan) {
		Socio socio = new Socio();
		System.out.println("Introduce el Nombre");
		socio.setNombre(scan.nextLine());
		System.out.println("Introduce el Apellido");
		socio.setApellido(scan.nextLine());
		System.out.println("Introduce el Direccion");
		socio.setDireccion(scan.nextLine());
		System.out.println("Introduce el Poblacion");
		socio.setPoblacion(scan.nextLine());
		System.out.println("Introduce el Provincia");
		socio.setProvincia(scan.nextLine());
		System.out.println("Introduce el DNI");
		socio.setDni(scan.nextLine());

		return socio;
	}
	
}
