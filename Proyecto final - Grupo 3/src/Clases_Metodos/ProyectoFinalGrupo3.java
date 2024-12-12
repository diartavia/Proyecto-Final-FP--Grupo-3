package Clases_Metodos;

import Frames.MainFrame;
import java.util.Date;
import java.util.Scanner;

public class ProyectoFinalGrupo3 {

    public static void main(String[] args) {
        //Ejecucion de las clases 
        
        Biblioteca biblioteca = Biblioteca.getInstance();
        
        Libro libro = new Libro();
        //menú para que el usuario decida que hacer.
        Scanner scanner = new Scanner(System.in);
        new MainFrame().setVisible(true);

    }//llave main
}//llave clase
