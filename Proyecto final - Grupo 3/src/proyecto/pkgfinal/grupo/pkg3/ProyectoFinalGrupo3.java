package proyecto.pkgfinal.grupo.pkg3;

import java.util.Date;
import java.util.Scanner;

public class ProyectoFinalGrupo3 {

    public static void main(String[] args) {
        //Ejecucion de las clases 
        Biblioteca biblioteca = new Biblioteca();
        Libro libro = new Libro();
        //menú para que el usuario decida que hacer.
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        System.out.println("Bienvenido al menu\nSeleccione un numero para ejecutar esa tarea");
        do { // 10 es la opción de salir
            System.out.println("\n===== MENU DE BIBLIOTECA =====");
            System.out.println("1. Agregar libro");
            System.out.println("2. Editar libro");
            System.out.println("3. Eliminar libro");
            System.out.println("4. Agregar usuario");
            System.out.println("5. Editar usuario");
            System.out.println("6. Eliminar usuario");
            System.out.println("7. Registrar prestamo");
            System.out.println("8. Buscar libro");
            System.out.println("9. Devolver un libro");
            System.out.println("10. Mostrar historial de prestamos");
            System.out.println("11. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (opcion){
                case 1:
                    // Agregar libro
                    System.out.print("Ingrese el título del libro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Ingrese el autor del libro: ");
                    String autor = scanner.nextLine();
                    System.out.print("Ingrese el ISBN del libro: ");
                    String isbn = scanner.nextLine();
                    System.out.print("Ingrese el género del libro: ");
                    String genero = scanner.nextLine();
                    Libro nuevoLibro = new Libro(titulo, autor, isbn, genero);
                    biblioteca.nuevoLibro(nuevoLibro);
                    System.out.println("Libro agregado correctamente.");
                    break;

                case 2:
                    // Editar libro
                    biblioteca.editarLibro();
                    break;

                case 3:
                    // Eliminar libro
                    System.out.print("Ingrese el ISBN del libro a eliminar: ");
                    String isbnEliminar = scanner.nextLine();
                    biblioteca.eliminarLibro(isbnEliminar);
                    break;

                case 4:
                    // Agregar usuario
                    System.out.print("Ingrese el nombre del usuario: ");
                    String usuario = scanner.nextLine();
                    System.out.print("Ingrese el email del usuario: ");
                    String emailUsuario = scanner.nextLine();
                    System.out.print("Ingrese la contraseña del usuario: ");
                    String passwordUsuario = scanner.nextLine();
                    Usuario nuevoUsuario = new Usuario(emailUsuario, passwordUsuario, usuario);
                    biblioteca.nuevoUsuario(nuevoUsuario);
                    System.out.println("Usuario agregado correctamente.");
                    break;

                case 5:
                    // Editar usuario
                    biblioteca.editarUsuario();
                    break;

                case 6:
                    // Eliminar usuario
                    System.out.print("Ingrese el usuario del usuario a eliminar: ");
                    String usu = scanner.nextLine();
                    biblioteca.eliminarUsuario(usu);
                    break;

                case 7:
                    // Registrar préstamo
                    Date fechaDevolucion = new Date(System.currentTimeMillis() + 7L * 24 * 60 * 60 * 1000);  // Una semana después
                    biblioteca.registrarPrestamoAUsuario(fechaDevolucion);
                    break;

                case 8:
                    // Buscar libro
                    System.out.println("Ingrese el codigo ISBN del libro a buscar");
                    String id = scanner.nextLine();
                    biblioteca.MostrarLibro(id);
                    break;
                    
                case 9:
                    // Devolver un prestamo
                    biblioteca.devolverlibro();
                    break;
                case 10:
                    // Mostrar prestamos
                    System.out.println("Ingrese el Usuario de la persona para mostrar el historial de prestamos");
                    String usua = scanner.nextLine();
                    biblioteca.mostrarPrestamosDeUsuario(usua);
                    break;
                case 11:
                    // Salir
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }while (opcion != 11);

        
        
    }//llave main
}//llave clase
