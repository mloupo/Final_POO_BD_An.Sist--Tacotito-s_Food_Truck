package controlador;

import vistas.*;

public class ControladorLogin {

    public static VistaLogin ventana = new VistaLogin();

    public static void mostrar() {
        ventana.setVisible(true);
    }

    public static void ocultar() {
        ventana.setVisible(false);
    }

    public static void eventoBtnIngresar() {
        String usuario = ventana.getjTextField1().getText();
        String clave = ventana.getjTextField2().getText();
        //usar clases del modelo para ver si el usuario y la clave son correctos
        if (usuario.equals("admin") && clave.equals("1234")) {
            ocultar();
            ControladorPrincipal.mostrar();
        } else {
            System.out.println("Usuario o Clave Incorrecta");
        }
        ventana.getjTextField1().setText("");
        ventana.getjTextField2().setText("");
        System.out.println("Evento!!!");
    }
}
