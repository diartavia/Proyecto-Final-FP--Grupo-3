package proyecto.pkgfinal.grupo.pkg3;

public class Libro {
   //En esta clase se va a pedir los datos para el libro
    private String titulo;
    private String Autor;
    private String ISBN;
    private String genero;
    private boolean prestado;
    
    //Constructor
    public Libro(String titulo, String Autor, String ISBN, String genero) {
        this.titulo = titulo;
        this.Autor = Autor;
        this.ISBN = ISBN;
        this.genero = genero;
        this.prestado = false;
    }
    
    //get y sets

    //----------Titulo--------------//
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    //----------Autor--------------//
    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }
    //----------ISBN--------------//
    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    //----------Genero--------------//
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    //----------Prestado--------------//
    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }
    
    //to string

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", Autor=" + Autor + ", ISBN=" + ISBN + ", genero=" + genero + ", prestado=" + prestado + '}';
    }
    
    //otros metodos
    
}//LLave clase
