package BiblioClases;

public class Menu {
	public static final int GESTIONAR_LIBROS=1;
	public static final int GESTIONAR_SOCIOS=2;
	public static final int GESTIONAR_PRESTAMOS=3;
	
	public static final int INSERTAR_LIBROS=1;
	public static final int ELIMINAR_LIBROS=2;
	public static final int VER_LIBROS=3;
	
	public static final int VER_SOCIOS=1;
	
	public static final int REALIZAR_PRESTAMOS=1;
	
	public static final int SALIR=0;
	
	public static void monstrarMenuPrincipal() {
		System.out.println("Menu Principal:");
		System.out.println(GESTIONAR_LIBROS+". Gestionar Libros");
		System.out.println(GESTIONAR_SOCIOS+". Gestionar Socios");
		System.out.println(GESTIONAR_PRESTAMOS+". Gestionar Prestamos");
		System.out.println(SALIR+". Salir");
	}
	public static void mostrarMenuLibros() {
		System.out.println("Menu Libros:");
		System.out.println(INSERTAR_LIBROS+". Insertar Libro");
		System.out.println(ELIMINAR_LIBROS+". Eliminar Libro");
		System.out.println(VER_LIBROS+". Ver Libros");
		System.out.println(SALIR+". Salir");
	}
	public static void mostrarMenuSocios() {
		System.out.println("Menu Socios:");
		System.out.println(VER_SOCIOS+". Ver Socios");
		System.out.println(SALIR+". Salir");
	}
	public static void mostrarMenuPrestamos() {
		System.out.println("Menu Prestamos:");
		System.out.println(REALIZAR_PRESTAMOS+". Realizar préstamo");
		System.out.println(SALIR+". Salir");
	}

}
