package Pantalla_de_login;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 {
    public JPanel mainPanel;
    private JTextField usuarioTextField;
    private JPasswordField contraseniaPasswordField;
    private JButton loginButton;
    private JLabel mensajeLabel;


    // Metodo para validar el login

    private void validarLogin() {

        //Obtener los valores ingresados
        String usuario = usuarioTextField.getText();
        char[] contrasenia = contraseniaPasswordField.getPassword();
        String contraseniaTexto = new String(contrasenia);

        // Validar usuario y contraseña
        if (usuario.equals("APELLIDO") && contraseniaTexto.equals("APELLIDO123")) {
            mensajeLabel.setText("Acceso Correcto :)");

        } else {
            mensajeLabel.setText("Acceso Incorrecto :(");

        }


    }


    //Funcionalidad para el boton login

    public form1() {
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                validarLogin();

            }
        });
    }
}
