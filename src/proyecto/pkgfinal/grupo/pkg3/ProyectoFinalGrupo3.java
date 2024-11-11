package proyecto.pkgfinal.grupo.pkg3;

import java.util.Date;

public class ProyectoFinalGrupo3 {

    public static void main(String[] args) {
        //Ejecucion de las clases 
        Biblioteca biblioteca = new Biblioteca();

        
        // ------------- Para crear libros y agregarlos 
        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", "123456789", "Literatura"); //lo crea
        biblioteca.nuevoLibro(libro1); //lo agrega
        Libro libro2 = new Libro("1984", "George Orwell", "987654321", "Ficción"); //lo crea
        biblioteca.nuevoLibro(libro2); //lo agrega

        //------------- Para crear libros y agregarlos
        Usuario usuario1 = new Usuario("juan@correo.com", "1234");//lo crea
        biblioteca.nuevoUsuario(usuario1);//lo agrega
        Usuario usuario2 = new Usuario("ana@correo.com", "abcd");//lo crea
        biblioteca.nuevoUsuario(usuario2);//lo agrega

        // Registrar un préstamo para un usuario
        Date fechaDevolucion = new Date(System.currentTimeMillis() + 7L * 24 * 60 * 60 * 1000);  // Una semana después
        biblioteca.registrarPrestamoAUsuario("juan@correo.com", "123456789", fechaDevolucion);

        // Para mostrar los préstamos de un usuario
        biblioteca.mostrarPrestamosDeUsuario("juan@correo.com");

        
        System.out.println("\n");
        // Intentar registrar un préstamo con un libro ya prestado
        biblioteca.registrarPrestamoAUsuario("ana@correo.com", "123456789", fechaDevolucion);
    }
    
}
