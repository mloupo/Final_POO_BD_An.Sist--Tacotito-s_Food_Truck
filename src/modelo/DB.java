package modelo;

import java.sql.*;
import java.util.ArrayList;
import modelo.productoTaco.Tipo_Ingrediente;

public class DB {

    //Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
    Connection conexion;
    String cadenaConexion = "jdbc:mysql://localhost/tacotitosdb?serverTimezone=UTC";
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

    public void botonAgregar(Tipo_Ingrediente tipoIngred) {
        String tipo_ingrediente = tipoIngred.getNombre();
        int cantMax = tipoIngred.getCantidadMaxima();
            
        try {
            PreparedStatement s = conexion.prepareStatement(
                "INSERT INTO tipo_ingrediente (tipo_ingrediente, cantidad_maxima) values(?,?)", Statement.RETURN_GENERATED_KEYS);
            s.setString(1, tipoIngred.getNombre());
            s.setInt(2, tipoIngred.getCantidadMaxima());
           
            s.executeUpdate();  /*se usa p/ insert update o delete*/
                                /* s.executeQuery();  es para consultas y espera un resultado*/
            rs = s.getGeneratedKeys();
            System.out.println(rs);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    

    public void botonEliminar(int id) {
        Statement s;
        try {
            s = conexion.createStatement();
            s.executeUpdate("DELETE FROM tipo_ingrediente WHERE id_tipo_ingrediente=" + id);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void botonModificar(Tipo_Ingrediente tIngred) {
        try {
            PreparedStatement s = conexion.prepareStatement(
                "UPDATE tipo_ingrediente SET tipo_ingrediente=?, cantidad_maxima=? WHERE id_tipo_ingrediente=?");
           
            s.setString(1, tIngred.getNombre());
            s.setDouble(2, tIngred.getCantidadMaxima());
            s.setInt(3, tIngred.getId_tipo_ingrediente());
            s.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public ArrayList<Tipo_Ingrediente> obtenerListaTipoIngredientes() {
        ArrayList<Tipo_Ingrediente> lista_tipoIngredientes = new ArrayList <>();
        try {
            Statement s = conexion.createStatement();
            ResultSet res;
            res = s.executeQuery("select * from tipo_ingrediente order by id_tipo_ingrediente");

            while (res.next()) {
                Tipo_Ingrediente ti = new Tipo_Ingrediente(
                    res.getInt("id_tipo_ingrediente"),
                    res.getString("tipo_ingrediente"),
                    res.getInt("cantidad_maxima")
                );
                lista_tipoIngredientes.add(ti);
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
        return lista_tipoIngredientes;
    }

}
