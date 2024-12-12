package Clases_Metodos;

import java.time.LocalDate;
import java.util.Date;

public class Prestamo{
    //variables
    private Libro libroprestado;
    private LocalDate fechaprestamo; //cambiar el tipo DATE
    private LocalDate fechadevolucion; //cambiar el tipo DATE
    
    //constructor
    public Prestamo(Libro libroprestado, LocalDate fechaprestamo, LocalDate fechadevolucion) {
        this.libroprestado = libroprestado;
        this.fechaprestamo = fechaprestamo;
        this.fechadevolucion = fechadevolucion;
        
        this.libroprestado.setPrestado(true);
    }
    
    //Gets y sets

    //------------libro prestado----------------//
    public Libro getLibroprestado() {
        return libroprestado;
    }

    public void setLibroprestado(Libro libroprestado) {
        this.libroprestado = libroprestado;
    }
    //------------Fecha presamo----------------//
    public LocalDate getFechaprestamo() {
        return fechaprestamo;
    }

    public void setFechaprestamo(LocalDate fechaprestamo) {
        this.fechaprestamo = fechaprestamo;
    }
    //------------Fecha devolucion----------------//
    public LocalDate getFechadevolucion() {
        return fechadevolucion;
    }

    public void setFechadevolucion(LocalDate fechadevolucion) {
        this.fechadevolucion = fechadevolucion;
    }
    
    //otros metodos

    @Override
    public String toString() {
        return "Prestamo{" + "libroprestado=" + libroprestado + ", fechaprestamo=" + fechaprestamo + ", fechadevolucion=" + fechadevolucion + '}';
    }
       
    
}//llave clase
