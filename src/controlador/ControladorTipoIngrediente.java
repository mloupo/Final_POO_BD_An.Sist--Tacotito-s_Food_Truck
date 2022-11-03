package controlador;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.DB;
import modelo.productoTaco.Tipo_Ingrediente;
import vistas.VentanaTipoIngrediente;

/**
 *
 * @author Zen
 */
public class ControladorTipoIngrediente {
    public static VentanaTipoIngrediente ventana = new VentanaTipoIngrediente();

    public static void mostrar() {
        ventana.setVisible(true);
        DB db = new DB();
        ArrayList<Tipo_Ingrediente> lista_TipoIngredientes = db.obtenerListaTipoIngredientes();
        DefaultTableModel model = (DefaultTableModel) ventana.getGrilla().getModel();
        
        model.setNumRows(0);
        for (Tipo_Ingrediente ti : lista_TipoIngredientes) {
            Object[] fila = new Object[3];
            fila[0] = ti.getId_tipo_ingrediente();
            fila[1] = ti.getNombre();
            fila[2] = ti.getCantidadMaxima();
            model.addRow(fila);
        }
    }

    public static void ocultar() {
        ventana.setVisible(false);
    }

    public static void botonAgregar() {
        System.out.println("Se ejecuto el evento Agregar!");
        
        String nombre = ventana.getTxtNombre().getText();       
        int cantMax = Integer.parseInt(ventana.getTxtCantMax().getText());
        
        Tipo_Ingrediente ti = new Tipo_Ingrediente(nombre, cantMax);
        
        ti.setNombre(nombre);
        ti.setCantidadMaxima(cantMax);
        DB db = new DB();
        db.botonAgregar(ti);
        mostrar(); //para refrescar la ventana despues de agregar
    }

    public static void botonEliminar() {
        System.out.println("Se ejecuto el evento Eliminar!");
        int id = Integer.parseInt(
            ventana.getTxtId().getText());
        DB db = new DB();
        db.botonEliminar(id);
        mostrar();        
    }

    public static void botonModificar() {
        System.out.println("Se ejecuto el evento Modificar!");
    }

}
