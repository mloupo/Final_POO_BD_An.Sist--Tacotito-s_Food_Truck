/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import static controlador.ControladorTipoIngrediente.mostrar;
import static controlador.ControladorTipoIngrediente.ventana;
import modelo.DB;
import modelo.productoTaco.Tipo_Ingrediente;

/**
 *
 * @author Zen
 */
public class ControladorIngrediente {
    
    public static void botonAgregar() {
        System.out.println("Se ejecuto el evento Agregar Ingrediente!");
        
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
        System.out.println("Se ejecuto el evento Eliminar Ingrediente!");
        int id = Integer.parseInt(
            ventana.getTxtId().getText());
        DB db = new DB();
        db.botonEliminar(id);
        mostrar();        
    }

    public static void botonModificar() {
        System.out.println("Se ejecuto el evento Modificar Ingrediente!");
    }
}
