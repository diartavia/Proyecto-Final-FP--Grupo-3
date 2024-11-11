package proyecto.pkgfinal.grupo.pkg3;

import java.util.ArrayList;
import java.util.Date;

public class Biblioteca {
    //"Atributos"
    private ArrayList<Libro> Libros;
    private ArrayList<Usuario> Usuarios;
    //Constructor
    public Biblioteca() {
        this.Libros = new ArrayList<>();
        this.Usuarios = new ArrayList<>();
    }
    //--------- Metodos para libro
    //Agregar libros
    public void nuevoLibro(Libro nLibro){
        Libros.add(nLibro);
    }
    //--------- fin
    
    //--------- Metodos para Usuario
    //Agregar usuarios
    public void nuevoUsuario(Usuario nUsuario){
        Usuarios.add(nUsuario);
    }
    //registrar prestamo
    public void registrarPrestamoAUsuario(String emailUsuario, String isbn, Date fechaDevolucion) {
        Usuario usuario = null;
        Libro libro = null;

        // Busca al usuario por email
        for (Usuario u : Usuarios) {
            if (u.getEmail().equals(emailUsuario)) {
                usuario = u;
                break;
            }
        }
        if (usuario == null) {
            System.out.println("Usuario con email " + emailUsuario + " no encontrado");
            return;
        }

        // Busca el libro por ISBN
        for (Libro l : Libros) {
            if (l.getISBN().equals(isbn)) {
                libro = l;
                break;
            }
        }
        if (libro == null) {
            System.out.println("Libro con ISBN " + isbn + " desconocido");
            return; //se sale si es desconocido 
        }
        //para saber si ya esta prestado
        if (libro.isPrestado()) {
            System.out.println("El libro ya esta prestado");
            return; //se sale si ya esta prestado
        }

        // Crear y asigna el prestamo al usuario
        Prestamo nuevoPrestamo = new Prestamo(libro, new Date(), fechaDevolucion);
        usuario.agregarPrestamo(nuevoPrestamo);

        System.out.println("Prestamo registrado para el usuario: " + usuario.getEmail());
    }//llave registrarPrestamoAUsuario
    
    //mostrar prestamos
    public void mostrarPrestamosDeUsuario(String emailUsuario) {
    for (Usuario u : Usuarios) {
        if (u.getEmail().equals(emailUsuario)) {
            System.out.println("Prestamos de " + emailUsuario + ":");
            for (Prestamo p : u.getHistorialPrestamos()) {
                System.out.println(p);
            }
            return;
        }
    }
    System.out.println("Usuario con email " + emailUsuario + " no encontrado.");
    }


    //--------- fin

}
