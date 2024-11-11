package proyecto.pkgfinal.grupo.pkg3;

import java.util.Date;

public class Prestamo{
    //variables
    private Libro libroprestado;
    private Date fechaprestamo; //cambiar el tipo DATE
    private Date fechadevolucion; //cambiar el tipo DATE
    
    //constructor
    public Prestamo(Libro libroprestado, Date fechaprestamo, Date fechadevolucion) {
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
    public Date getFechaprestamo() {
        return fechaprestamo;
    }

    public void setFechaprestamo(Date fechaprestamo) {
        this.fechaprestamo = fechaprestamo;
    }
    //------------Fecha devolucion----------------//
    public Date getFechadevolucion() {
        return fechadevolucion;
    }

    public void setFechadevolucion(Date fechadevolucion) {
        this.fechadevolucion = fechadevolucion;
    }
    
    //otros metodos

    @Override
    public String toString() {
        return "Prestamo{" + "libroprestado=" + libroprestado + ", fechaprestamo=" + fechaprestamo + ", fechadevolucion=" + fechadevolucion + '}';
    }
       
    
}//llave clase
