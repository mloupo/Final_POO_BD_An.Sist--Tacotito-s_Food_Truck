package modelo.productoTaco;
import java.util.Objects;

/**
 *
 * @author Zen
 */
public class Ingrediente extends Tipo_Ingrediente{
    protected int id_ingrediente;
    protected String nombre_ingrediente;
    protected String descripcion;
    protected int precio;
    private String nombre_tipo_ingrediente;
   

    public Ingrediente(int precio, String nombre, String tipo, int cant, String descripcion) {
        super(tipo, cant);
        this.precio = precio;
        this.nombre_tipo_ingrediente = nombre;
        this.descripcion=descripcion;
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

    public String getNombre_tipo_ingrediente() {
        return nombre_tipo_ingrediente;
    }

    public void setNombre_tipo_ingrediente(String descripcion) {
        this.descripcion = nombre_tipo_ingrediente;
    }
     
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Ingrediente{" + "precio=" + precio + ", descripcion=" + nombre_tipo_ingrediente + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.precio;
        hash = 97 * hash + Objects.hashCode(this.nombre_tipo_ingrediente);
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
        return Objects.equals(this.nombre_tipo_ingrediente, other.nombre_tipo_ingrediente);
    }


    
    
}
