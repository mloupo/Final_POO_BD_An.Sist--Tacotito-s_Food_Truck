/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Zen
 */
public class LineaVenta {

    private int cantidad;
    private Producto p;

    public LineaVenta(int cantidad, Producto p) {
        this.cantidad = cantidad;
        this.p = p;
    }

    public LineaVenta() {
    }

    @Override
    public String toString() {
        return cantidad + "\t" + p.getNombre() +  "\t" + p.getPrecio() + "\t" + calcularSubtotal();
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getP() {
        return p;
    }

    public void setP(Producto p) {
        this.p = p;
    }
    
    public double calcularSubtotal(){
        return cantidad * p.getPrecio();
    }
}
