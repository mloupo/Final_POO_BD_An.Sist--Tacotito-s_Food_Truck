package modelo.productoTaco;
import java.util.Objects;


/**
 *
 * @author Zen
 */
public class Tipo_Ingrediente {
    private int id_tipo_ingrediente;
    private String tipo; //tipo: tortilla-salsa-relleno
    private int cant_max;
    
    public Tipo_Ingrediente(int id, String tipo, int cant){
        this.id_tipo_ingrediente=id;
        this.tipo= tipo;
        this.cant_max= cant;
    }
     
    public Tipo_Ingrediente(String tipo, int cant){
        this.tipo= tipo;
        this.cant_max= cant;
    }
    
    public String toString() {
        return "Tipo Ingrediente{tipo=" + tipo + ", cantidad Maxima=" + cant_max + '}';
    }

    public String getNombre() {
        return tipo;
    }

    public void setNombre(String nombre) {
        this.tipo = nombre;
    }

    public int getCantidadMaxima() {
        return cant_max;
    }

    public void setCantidadMaxima(int cantidadMaxima) {
        this.cant_max = cantidadMaxima;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    public int getId_tipo_ingrediente() {
        return id_tipo_ingrediente;
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
        final Tipo_Ingrediente other = (Tipo_Ingrediente) obj;
        if (this.cant_max != other.cant_max) {
            return false;
        }
        return Objects.equals(this.tipo, other.tipo);
    }
    
    
    
}
