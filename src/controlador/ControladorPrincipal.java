
package controlador;
import vistas.*;


public class ControladorPrincipal {
    
    public static VistaPrincipal ventana = new VistaPrincipal();
    public static void mostrar(){ventana.setVisible(true);}
    public static void ocultar(){ventana.setVisible(false);}
    
    public static void botonSalir(){
        ocultar();
        ControladorLogin.mostrar();
    }
    
    public static void botonIngrediente(){
        ocultar();
        ControladorIngrediente.mostrar();
    }
    
    public static void botonTipoIngrediente(){
        ocultar();
        ControladorTipoIngrediente.mostrar();
    }
    
}
