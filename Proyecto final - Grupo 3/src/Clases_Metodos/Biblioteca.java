package Clases_Metodos;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Biblioteca {
    private static Biblioteca instance;
    
    Scanner sc = new Scanner(System.in);
    //"Atributos"
    private ArrayList<Libro> Libros; 
    private ArrayList<Usuario> Usuarios;
    
    //Constructor
    private Biblioteca() {
        this.Libros = new ArrayList<>();
        this.Usuarios = new ArrayList<>();
    }
    //Metodo para trabajar con una sola biblioteca
    public static Biblioteca getInstance(){
        if (instance == null) {
            Biblioteca.instance = new Biblioteca();
        }
        return instance;
    }
    //--------- Metodos para libro
    //Agregar libros
    public void nuevoLibro(Libro nLibro){
        Libros.add(nLibro);
    }
    //Editar libro por busqueda de ISBN
    public void editarLibro ()
    {
        System.out.print("Ingrese el ISBN del libro a editar: ");
        String isbnEditar = sc.nextLine();
        for (Libro libro : Libros)
        {
            if(libro.getISBN().equals(isbnEditar))
            {
            //Si encontramos el libro, actualizamos sus datos con la nueva información ingresada.
            System.out.print("Ingrese el nuevo título del libro: ");
            String nuevoTitulo = sc.nextLine();
            System.out.print("Ingrese el nuevo autor del libro: ");
            String nuevoAutor = sc.nextLine();
            System.out.print("Ingrese el nuevo género del libro: ");
            String nuevoGenero = sc.nextLine();
            libro.setTitulo(nuevoTitulo);
            libro.setAutor(nuevoAutor);
            libro.setGenero(nuevoGenero);
            System.out.println("Libro editado: " + libro);
            return;
            }//Llave del if
        }//Llave del for
        System.out.println("No se encontro un libro el ISBN ingresado: " + isbnEditar);
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
        System.out.println("No se encontro el libro con el ISBN ingresado: " + isbn);
    }
    public void devolverlibro(){
        Usuario usuario = null;
        Prestamo prestamoEncontrado = null;
        
        System.out.println("Ingrese el Usuario de la persona");
        String usuar = sc.nextLine();
        // Buscar al usuario por su nombre de usuario
        for (Usuario u : Usuarios) {
            if (u.getUsuario().equals(usuar)) {
                usuario = u;
                break;
            }
        }

        if (usuario == null) {
            System.out.println("Usuario con nombre " + usuar + " no encontrado.");
            return;
        }

        
        System.out.println("Y el ISBN para hacer la devolucion");
        String Isbn = sc.nextLine();
        // Buscar el préstamo específico del libro dentro del historial del usuario
        for (Prestamo prestamo : usuario.getHistorialPrestamos()) {
            if (prestamo.getLibroprestado().getISBN().equals(Isbn)) {
                prestamoEncontrado = prestamo;
                break;
            }
        }

        if (prestamoEncontrado == null) {
            System.out.println("El usuario no tiene registrado un prestamo del libro con ISBN " + Isbn);
            return;
        }

        // Actualizar el estado del libro a no prestado
        prestamoEncontrado.getLibroprestado().setPrestado(false);

        // Remover el préstamo del historial del usuario
        usuario.getHistorialPrestamos().remove(prestamoEncontrado);

        System.out.println("El libro con ISBN " + Isbn + " ha sido devuelto por el usuario " + usuar);

    }
    //--------- fin
    
    //--------- Metodos para Usuario
    //Agregar usuarios
    public void nuevoUsuario(Usuario nUsuario){
        Usuarios.add(nUsuario);
    }
    
    //Eliminar un usuario con base en su usuario
    public void eliminarUsuario(String usu){
        for(int i = 0; i < Usuarios.size(); i++)
        {
            if(Usuarios.get(i).getEmail().equals(usu))
            {
                if (JOptionPane.showConfirmDialog(null, "Desea eliminar el objeto")==0) {
                    Usuarios.remove(i);
                    JOptionPane.showMessageDialog(null, "El  usuario con el nombre de usuario - " + usu + " - ha sido eliminado.");
                    return;
                }
            }//Llave del if   
        }//Llave del for
        JOptionPane.showMessageDialog(null, "No se encontro un usuario con el nombre de usuario: " + usu);
    }
    //registrar prestamo
    public void registrarPrestamoAUsuario(Date fechaDevolucionInput) {
        Usuario usuario = null;
        Libro libro = null;
        System.out.print("Ingrese el nombre de usuario: ");
        String nameUsuarioPrestamo = sc.nextLine();
        // Busca al usuario por email
        for (Usuario u : Usuarios) {
            if (u.getEmail().equals(nameUsuarioPrestamo)) {
                usuario = u;
                break;
            }
        }
        if (usuario == null) { //si el usuario no se encontro, el valor de usuario no cambio,  por ende sigue null, por eso se saldria
            System.out.println("Usuario con nombre de usuario: " + nameUsuarioPrestamo + " no encontrado");
            return;
        }
        System.out.print("Ingrese el ISBN del libro a prestar: ");
        String isbnPrestamo = sc.nextLine();
        // Busca el libro por ISBN
        for (Libro l : Libros) {
            if (l.getISBN().equals(isbnPrestamo)) {
                libro = l;
                break;
            }
        }
        if (libro == null) {
            System.out.println("Libro con ISBN " + isbnPrestamo + " desconocido");
            return; //se sale si es desconocido 
        }
        //para saber si ya esta prestado
        if (libro.isPrestado()) {
            System.out.println("El libro ya esta prestado");
            return; //se sale si ya esta prestado
        }
        

            Prestamo nuevoPrestamo = new Prestamo(libro, new Date(), fechaDevolucionInput); //cambiar el tipo DATE
            usuario.agregarPrestamo(nuevoPrestamo);
            System.out.println("Prestamo registrado para el usuario: " + usuario.getUsuario());
        
        // Crear y asigna el prestamo al usuario


        
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

    public ArrayList<Libro> getLibros() {
        return Libros;
    }

    public ArrayList<Usuario> getUsuarios() {
        return Usuarios;
    }

    
}
