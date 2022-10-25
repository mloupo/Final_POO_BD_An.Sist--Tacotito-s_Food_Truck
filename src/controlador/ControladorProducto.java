/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.DB;
import vistas.*;
import modelo.productoTaco.Taco;

/**
 *
 * @author Zen
 */
public class ControladorProducto {

    public static VistaProducto ventana = new VistaProducto();

    public static void mostrar() {
        ventana.setVisible(true);
        DB db = new DB();
        ArrayList<Taco> lista_tacos = db.obtenerProductos();
        DefaultTableModel model = (DefaultTableModel) ventana.getGrilla().getModel();
        
        model.setNumRows(0);
        for (Taco tacos : lista_tacos) {
            Object[] fila = new Object[3];
            fila[0] = producto.getCodigo();
            fila[1] = producto.getNombre();
            fila[2] = producto.getPrecio();
            model.addRow(fila);
        }
    }

    public static void ocultar() {
        ventana.setVisible(false);
    }

    public static void botonAgregar() {
        System.out.println("Se ejecuto el evento Agregar!");
        String nombre = ventana.getTxtnombre().getText();
        double precio = Double.parseDouble(ventana.getTxtprecio().getText());
        
        
        Producto p = new Producto();
        p.setNombre(nombre);
        p.setPrecio(precio);
        DB db = new DB();
        db.agregarProducto(p);
        mostrar(); //para refrescar la ventana despues de agregar
    }

    public static void botonEliminar() {
        System.out.println("Se ejecuto el evento Eliminar!");
        int codigo = Integer.parseInt(
            ventana.getTxtcodigo().getText());
        DB db = new DB();
        db.eliminarProducto(codigo);
        mostrar();
        
    }

    public static void botonModificar() {
        System.out.println("Se ejecuto el evento Modificar!");
    }

}
