package baseDeDatos.oop.dto;

import baseDeDatos.oop.ConectadorABaseDeDatos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Gente {
    static String delete = "Delete from gente where id = ";
    static String select = "Select * from gente where id =";

    int id;
    String nombre;
    String apellido;
    String mote;

    @Override
    public String toString() {
        return "Gente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", mote='" + mote + '\'' +
                '}';
    }

    public void eliminarDeBaseDeDatos(Connection c) {
        try {
            c.createStatement().execute(delete + this.id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Gente(int id, String nombre, String apellido, String mote) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.mote = mote;
    }

    public static Gente getGenteFromRS(ResultSet rs) {
        try {
            if (rs.next()) {
                try {
                    return new Gente(rs.getInt("Id"), rs.getString("Nombre"),
                            rs.getString("Apellido"), rs.getString("Mote"));
                } catch (SQLException e) {
                    e.printStackTrace();
                    return null;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("El gentesito no se pudo crear.");
        return null;
    }

    public static Gente getGenteFromDBById(Connection c, int id) {
       Statement st = ConectadorABaseDeDatos.getStatement(c);
       ResultSet rs = ConectadorABaseDeDatos.getResultset(c, select + id, st);
       return getGenteFromRS(rs);
    }
}
