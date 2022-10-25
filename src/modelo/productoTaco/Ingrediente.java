package modelo.productoTaco;
import java.util.Objects;

/**
 *
 * @author Zen
 */
public class Ingrediente extends Tipo_Ingrediente{
    protected int precio;
    private String descripcion;

    public Ingrediente(int precio, String descripcion, String tipo, int cant) {
        super(tipo, cant);
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public Ingrediente(String tipo, int cant) {
        super(tipo, cant);
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Ingrediente{" + "precio=" + precio + ", descripcion=" + descripcion + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.precio;
        hash = 97 * hash + Objects.hashCode(this.descripcion);
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
        final Ingrediente other = (Ingrediente) obj;
        if (this.precio != other.precio) {
            return false;
        }
        return Objects.equals(this.descripcion, other.descripcion);
    }


    
    
}
