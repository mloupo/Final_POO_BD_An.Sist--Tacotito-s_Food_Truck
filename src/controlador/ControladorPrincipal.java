
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
    
    public static void botonVenta(){
        ocultar();
        ControladorVenta.mostrar();
    }
    
    public static void botonProducto(){
        ocultar();
        ControladorProducto.mostrar();
    }
    
}
