package proyecto.pkgfinal.grupo.pkg3;

import java.util.ArrayList;

public class Usuario {
    //Atributos
    private String Usuario;
    private String email;
    private String password;
    private int prestamos;
    private ArrayList<Prestamo> historialPrestamos;
    
    //constructor 
    public Usuario(String email, String password, String usuario) {
        this.Usuario = usuario;
        this.email = email;
        this.password = password;
        this.prestamos = 0;
        this.historialPrestamos = new ArrayList<>();
    }
    
    //Gets y sets
    //----------Usuario--------------//
    public String getUsuario() {
        return Usuario;
    }
    
    public void setUsuario(String Usuario) {    
        this.Usuario = Usuario;
    }

    //----------Email--------------//
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    //----------Password--------------//
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    //----------Prestamos--------------//
    public int getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(int prestamos) {
        this.prestamos = prestamos;
    }
    
    //to string
    @Override
    public String toString() {
        return "Usuario{" + "email=" + email + ", password=" + password + ", prestamos=" + prestamos +", Usuario=" + Usuario + '}';
    }
    
    //otros metodos
    
    //Para contar la cantidad de prestamos que tiene y agregar a su cuenta el prestamo
    public void agregarPrestamo(Prestamo prestamo) { 
        historialPrestamos.add(prestamo);
        prestamos++;
    }
    //Mostrar prestamos
        public ArrayList<Prestamo> getHistorialPrestamos() {
        return historialPrestamos;
    }
    
}//llave clase
