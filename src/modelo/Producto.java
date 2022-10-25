
package modelo;

import java.util.Objects;

public class Producto {
    private int id_producto;
    private String nombre_producto;
    private double precio_costo;
    private double precio_venta;
    private String descripcion_producto;
    private String img_producto;

    public Producto() {
    }

    public Producto(int id_producto, String nombre_producto, double precio_costo, double precio_venta, String descripcion_producto, String img_producto) {
        this.id_producto = id_producto;
        this.nombre_producto = nombre_producto;
        this.precio_costo = precio_costo;
        this.precio_venta = precio_venta;
        this.descripcion_producto = descripcion_producto;
        this.img_producto = img_producto;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public double getPrecio_costo() {
        return precio_costo;
    }

    public void setPrecio_costo(double precio_costo) {
        this.precio_costo = precio_costo;
    }

    public double getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(double precio_venta) {
        this.precio_venta = precio_venta;
    }

    public String getDescripcion_producto() {
        return descripcion_producto;
    }

    public void setDescripcion_producto(String descripcion_producto) {
        this.descripcion_producto = descripcion_producto;
    }

    public String getImg_producto() {
        return img_producto;
    }

    public void setImg_producto(String img_producto) {
        this.img_producto = img_producto;
    }

    @Override
    public String toString() {
        return "Producto{" + "id_producto=" + id_producto + ", nombre_producto=" + nombre_producto + ", precio_costo=" + precio_costo + ", precio_venta=" + precio_venta + ", descripcion_producto=" + descripcion_producto + ", img_producto=" + img_producto + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.id_producto;
        hash = 29 * hash + Objects.hashCode(this.nombre_producto);
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.precio_costo) ^ (Double.doubleToLongBits(this.precio_costo) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.precio_venta) ^ (Double.doubleToLongBits(this.precio_venta) >>> 32));
        hash = 29 * hash + Objects.hashCode(this.descripcion_producto);
        hash = 29 * hash + Objects.hashCode(this.img_producto);
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
        final Producto other = (Producto) obj;
        if (this.id_producto != other.id_producto) {
            return false;
        }
        if (Double.doubleToLongBits(this.precio_costo) != Double.doubleToLongBits(other.precio_costo)) {
            return false;
        }
        if (Double.doubleToLongBits(this.precio_venta) != Double.doubleToLongBits(other.precio_venta)) {
            return false;
        }
        if (!Objects.equals(this.nombre_producto, other.nombre_producto)) {
            return false;
        }
        if (!Objects.equals(this.descripcion_producto, other.descripcion_producto)) {
            return false;
        }
        return Objects.equals(this.img_producto, other.img_producto);
    }
    

}