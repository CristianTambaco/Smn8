package PantallaUsuarioIncorrecto;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello and welcome!, mensaje en consola");
        //
        JFrame frame = new JFrame("Pantalla de usuario incorrecto");
        frame.setContentPane(new form7().mainPanel7);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //que es lo que pasa cuando cierro el formulario
        frame.setSize(800,600);                     //seteo del tamaño
        frame.setPreferredSize(new Dimension(800,600));    //seteo del tamaño preferido
        frame.pack();
        frame.setVisible(true);   //para visualizar una nueva ventana

    }

}