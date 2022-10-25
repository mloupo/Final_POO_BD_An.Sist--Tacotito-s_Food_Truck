package modelo;

import java.sql.*;
import java.util.ArrayList;
import modelo.productoTaco.Taco;

public class DB {

    //Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
    Connection conexion;
    String cadenaConexion = "jdbc:mysql://localhost/pasteleriabd?serverTimezone=UTC";
    String usuario = "root";
    String clave = "";
    ResultSet rs;
    public DB() {
        try {
            conexion = DriverManager.getConnection(cadenaConexion, usuario, clave);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public void agregarProducto(Producto prod) {
        
        try {
            PreparedStatement s = conexion.prepareStatement(
                "INSERT INTO producto (id_producto, nombre_producto, precio_costo, precio_venta, descripcion_producto, img_producto) values(?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            
            s.setString(1, prod.getNombre());
            s.setDouble(2, prod.getPrecio());

            s.executeUpdate();  /*se usa p/ insert update o delete*/
                                /* s.executeQuery();  es para consultas y espera un resultado*/
            rs = s.getGeneratedKeys();
            System.out.println(rs);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    

    public void eliminarProducto(int codigo) {

        Statement s;
        try {
            s = conexion.createStatement();
            s.executeUpdate("DELETE FROM producto WHERE id_producto=" + codigo);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void modificarProducto(Producto prod) {
        try {
            PreparedStatement s = conexion.prepareStatement(
                "UPDATE producto SET nombre_producto=?, precio_costo=? WHERE id_producto=?");
            
            
            //s.setString(1, prod.getNombre());
            //s.setDouble(2, prod.getPrecio());
            //s.setInt(3, prod.getCodigo());

            //s.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public ArrayList<Taco> obtenerProductos() {
        ArrayList<Taco> lista_tacos = new ArrayList <>();
        try {

            Statement s = conexion.createStatement();
            ResultSet res;
            res = s.executeQuery("select * from producto order by nombre_producto");

            while (res.next()) {
                Taco t = new Taco(
                    //res.getInt("id_producto"),
                    //res.getString("nombre_producto"),
                    //res.getDouble("precio_costo")
                );

                lista_tacos.add(t);
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
        return lista_tacos;
    }

}
