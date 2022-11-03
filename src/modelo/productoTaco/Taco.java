package modelo.productoTaco;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Zen
 */
public class Taco {
    private int id_taco;    
    private List<Ingrediente> listaIngredientes;
    
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

    public int getId_taco() {
        return id_taco;
    }

    public void setId_taco(int id_taco) {
        this.id_taco = id_taco;
    }

    public List<Ingrediente> getListaIngredientes() {
        return listaIngredientes;
    }

    public void setListaIngredientes(List<Ingrediente> listaIngredientes) {
        this.listaIngredientes = listaIngredientes;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.id_taco;
        hash = 67 * hash + Objects.hashCode(this.listaIngredientes);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Taco other = (Taco) obj;
        if (this.id_taco != other.id_taco) {
            return false;
        }
        return Objects.equals(this.listaIngredientes, other.listaIngredientes);
    }

    @Override
    public String toString() {
        return "Taco{" + "id_taco=" + id_taco + ", listaIngredientes=" + listaIngredientes + '}' ;
    }
    
    
}
