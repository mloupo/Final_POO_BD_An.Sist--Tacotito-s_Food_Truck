package modelo;

import java.sql.*;
import java.util.ArrayList;

public class DB {

    //Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
    Connection conexion;
    String cadenaConexion = "jdbc:mysql://localhost/pildoras?serverTimezone=UTC";
    String usuario = "root";
    String clave = "";

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
                "INSERT INTO producto (nombre, precio) values(?,?)");
            s.setString(1, prod.getNombre());
            s.setDouble(2, prod.getPrecio());

            s.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void eliminarProducto(int codigo) {

        Statement s;
        try {
            s = conexion.createStatement();
            s.executeUpdate("DELETE FROM producto WHERE CODIGO=" + codigo);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void modificarProducto(Producto prod) {
        try {
            PreparedStatement s = conexion.prepareStatement(
                "UPDATE producto SET nombre=?, precio=? WHERE codigo=?");
            s.setString(1, prod.getNombre());
            s.setDouble(2, prod.getPrecio());
            s.setInt(3, prod.getCodigo());

            s.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public ArrayList<Producto> obtenerProductos() {
        ArrayList<Producto> lista = new ArrayList<>();
        try {

            Statement s = conexion.createStatement();
            ResultSet res;
            res = s.executeQuery("select * from producto order by nombre");

            while (res.next()) {
                Producto p = new Producto(
                    res.getInt("codigo"),
                    res.getString("nombre"),
                    res.getDouble("precio")
                );

                lista.add(p);
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
        return lista;
    }

}
