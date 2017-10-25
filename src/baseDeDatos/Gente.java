package baseDeDatos;


import java.sql.Connection;
import java.sql.SQLException;

public class Gente {
    int id;
    String nombre;
    String apellido;
    String mote;

    static String delete = "Delete from gente where id = ";

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
}
