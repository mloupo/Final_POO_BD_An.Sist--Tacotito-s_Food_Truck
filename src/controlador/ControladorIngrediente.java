/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import static controlador.ControladorIngrediente.mostrar;
import static controlador.ControladorTipoIngrediente.ventana;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.DB;
import modelo.productoTaco.Ingrediente;
import vistas.VentanaIngrediente;


/**
 *
 * @author Zen
 */
public class ControladorIngrediente {
    public static VentanaIngrediente ventana = new VentanaIngrediente();
       
    public static void mostrar() {
        ventana.setVisible(true);
        DB db = new DB();
        ArrayList<Ingrediente> lista_Ingredientes = db.obtenerListaIngredientes();
      /*  DefaultTableModel model = (DefaultTableModel) ventana.getGrilla().getModel();
        
        model.setNumRows(0);
        for (Ingrediente i : lista_Ingredientes) {
            Object[] fila = new Object[3];
            fila[0] = i.getId_tipo_ingrediente();
            fila[1] = i.getNombre();
            fila[2] = i.getCantidadMaxima();
            model.addRow(fila);
        } */
    }
    
    public static void botonAgregar() {
        System.out.println("Se ejecuto el evento Agregar Ingrediente!");
        
        /* String nombre = ventana.getTxtNombre().getText();       
        int cantMax = Integer.parseInt(ventana.getTxtCantMax().getText());
        
        Ingrediente i = new Ingrediente(nombre, cantMax);
        
        i.setNombre(nombre);
        i.setCantidadMaxima(cantMax);
        DB db = new DB();
        db.botonAgregar(i);
        mostrar(); //para refrescar la ventana despues de agregar */
    }

    public static void botonEliminar() {
        System.out.println("Se ejecuto el evento Eliminar Ingrediente!");
      /*  int id = Integer.parseInt(
            ventana.getTxtId().getText());
        DB db = new DB();
        db.botonEliminar(id);
        mostrar();  */      
    }

    public static void botonModificar() {
        System.out.println("Se ejecuto el evento Modificar Ingrediente!");
    }
}
