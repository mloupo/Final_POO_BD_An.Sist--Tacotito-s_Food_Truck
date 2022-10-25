package modelo.productoTaco;
import java.util.List;

/**
 *
 * @author Zen
 */
public class Taco {
    
    protected List<Ingrediente> listaIngredientes;
    
    public Taco(List<Ingrediente> listaIngredientes) {
        this.listaIngredientes = listaIngredientes;
    }

    public Taco() {
        throw new UnsupportedOperationException("Creaste un taco vacio"); 
// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public Double calcular_precio(){
        double precio_taco=0;
        for (int i = 0; i < 10; i++) {
           precio_taco = this.listaIngredientes.get(i).precio;
        } 
        
        return precio_taco;        
    }

    
}
