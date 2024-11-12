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
    //Editar libro por busqueda de ISBN
    public void editarLibro (String isbn, String nuevoTitulo, String nuevoAutor, String nuevoGenero)
    {
        for (Libro libro : Libros)
        {
            if(libro.getISBN().equals(isbn))
            {
            //Si encontramos el libro, actualizamos sus datos con la nueva información ingresada.
            libro.setTitulo(nuevoTitulo);
            libro.setAutor(nuevoAutor);
            libro.setGenero(nuevoGenero);
            System.out.println("Libro editado: " + libro);
            return;
            }//Llave del if
        }//Llave del for
        System.out.println("No se encontró un libro el ISBN ingresado: " + isbn);
    }
    
    //Mostrar libro por busqueda de ISBN
    public void MostrarLibro (String isbn)
    {
        for (Libro libro : Libros)
        {
            if(libro.getISBN().equals(isbn))
            {
                System.out.println("Los datos del libro son" + libro.toString()); 
                return;
            } //Llave del if
        }//Llave del for
        System.out.println("No se encontro un libro el ISBN ingresado: " + isbn);
    }
    //Eliminar libro por ISBN
    public void eliminarLibro(String isbn) 
    {
        // Buscar y eliminar el libro por ISBN
        for (int i = 0; i < Libros.size(); i++) 
        {
            if (Libros.get(i).getISBN().equals(isbn)) 
            {
                Libros.remove(i);
                System.out.println("Libro con ISBN " + isbn + " eliminado.");
                return;
            }//Llave del if
        }//Llave del for
        System.out.println("No se encontró el libro con el ISBN ingresado: " + isbn);
    }
    //--------- fin
    
    //--------- Metodos para Usuario
    //Agregar usuarios
    public void nuevoUsuario(Usuario nUsuario){
        Usuarios.add(nUsuario);
    }
    //Editar los datos de un usuario con base en su email
    public void editarUsuario(String email, String nuevoUsuario, String nuevoEmail) 
    {
        for (Usuario usuario : Usuarios) {
            if (usuario.getEmail().equals(email)) {
                // Se editan los atributos del usuario
                usuario.setUsuario(nuevoUsuario);
                usuario.setEmail(nuevoEmail);
                System.out.println("Nuevos datos del usuario: " + usuario);
                return;
            }
        }
        System.out.println("No se encontró un usuario con el email: " + email);
    }
    
    //Eliminar un usuario con base en su email
    public void eliminarUsuario(String email){
        for(int i = 0; i < Usuarios.size(); i++)
        {
            if(Usuarios.get(i).getEmail().equals(email))
            {
            Usuarios.remove(i);
                System.out.println("El  usuario con el email" + email + "ha sido eliminado.");
                return;
            }//Llave del if   
        }//Llave del for
        System.out.println("No se encontró un usuario con el email: " + email);
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
        if (usuario == null) { //si el usuario no se encontro, el valor de usuario no cambio,  por ende sigue null, por eso se saldria
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
        Prestamo nuevoPrestamo = new Prestamo(libro, new Date(), fechaDevolucion); //cambiar el tipo DATE
        usuario.agregarPrestamo(nuevoPrestamo);

        System.out.println("Prestamo registrado para el usuario: " + usuario.getEmail());
    }//llave registrarPrestamoAUsuario
    
    //mostrar prestamos
    public void mostrarPrestamosDeUsuario(String usuario) {
    for (Usuario u : Usuarios) {
        if (u.getUsuario().equals(usuario)) {
            System.out.println("Prestamos de " + usuario + ":");
            for (Prestamo p : u.getHistorialPrestamos()) {
                System.out.println(p);
            }
            return;
        }
    }
    System.out.println("Usuario con email " + usuario + " no encontrado.");
    }


    //--------- fin

}
