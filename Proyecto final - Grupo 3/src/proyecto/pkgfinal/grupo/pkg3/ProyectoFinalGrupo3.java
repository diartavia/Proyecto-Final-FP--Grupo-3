package proyecto.pkgfinal.grupo.pkg3;

import java.util.Date;
import java.util.Scanner;

public class ProyectoFinalGrupo3 {

    public static void main(String[] args) {
        //Ejecucion de las clases 
        Biblioteca biblioteca = new Biblioteca();
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
            System.out.println("9. Mostrar historial de prestamos");
            System.out.println("10. Salir");
            System.out.print("Seleccione una opción: ");
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
                    System.out.print("Ingrese el ISBN del libro a editar: ");
                    String isbnEditar = scanner.nextLine();
                    System.out.print("Ingrese el nuevo título del libro: ");
                    String nuevoTitulo = scanner.nextLine();
                    System.out.print("Ingrese el nuevo autor del libro: ");
                    String nuevoAutor = scanner.nextLine();
                    System.out.print("Ingrese el nuevo género del libro: ");
                    String nuevoGenero = scanner.nextLine();
                    biblioteca.editarLibro(isbnEditar, nuevoTitulo, nuevoAutor, nuevoGenero);
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
                    System.out.print("Ingrese el email del usuario a editar: ");
                    String emailEditar = scanner.nextLine();
                    System.out.print("Ingrese el nuevo nombre del usuario: ");
                    String nuevoNombreUsuario = scanner.nextLine();
                    System.out.print("Ingrese el nuevo email del usuario: ");
                    String nuevoEmailUsuario = scanner.nextLine();
                    biblioteca.editarUsuario(emailEditar, nuevoNombreUsuario, nuevoEmailUsuario);
                    break;

                case 6:
                    // Eliminar usuario
                    System.out.print("Ingrese el email del usuario a eliminar: ");
                    String emailEliminar = scanner.nextLine();
                    biblioteca.eliminarUsuario(emailEliminar);
                    break;

                case 7:
                    // Registrar préstamo
                    System.out.print("Ingrese el email del usuario: ");
                    String emailUsuarioPrestamo = scanner.nextLine();
                    System.out.print("Ingrese el ISBN del libro a prestar: ");
                    String isbnPrestamo = scanner.nextLine();
                    System.out.print("Ingrese la fecha de devolución (dd/MM/yyyy): ");
                    String fechaDevolucionStr = scanner.nextLine();
                    Date fechaDevolucionInput = null;
                    try {
                        fechaDevolucionInput = new java.text.SimpleDateFormat("dd/MM/yyyy").parse(fechaDevolucionStr);
                    } catch (Exception e) {
                        System.out.println("Fecha inválida.");
                    }
                    if (fechaDevolucionInput != null) {
                        biblioteca.registrarPrestamoAUsuario(emailUsuarioPrestamo, isbnPrestamo, fechaDevolucionInput);
                    }
                    break;

                case 8:
                    // Buscar libro
                    System.out.println("Ingrese el codigo ISBN del libro a buscar");
                    String id = scanner.nextLine();
                    biblioteca.MostrarLibro(id);
                    break;
                case 9:
                    // Mostrar prestamos
                    System.out.println("Ingrese el Usuario de la persona para mostrar el historial de prestamos");
                    String usu = scanner.nextLine();
                    biblioteca.mostrarPrestamosDeUsuario(usu);
                    break;
                case 10:
                    // Salir
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }while (opcion != 10);

        
        
    }//llave main
}//llave clase
