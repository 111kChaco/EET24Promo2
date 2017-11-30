package ejbasedatos2811;

import com.company.Persona;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Alumnos> listaAlumnos = new ArrayList<>();
    public static void main(String[] args) {
        Connection c = ConectadorABaseDeDatos.conectorDeBD();
        cargarDeBd(c);
        for(Alumnos a : listaAlumnos) {
            System.out.println(a);
        }

        Alumnos p = new Alumnos("Angelina", "Jolie", 909, 0);



    }

     public static void cargarDeBd(Connection c) {
      try {
         Statement st = c.createStatement();
         ResultSet rs = st.executeQuery("Select * from alumnos");
         while(rs.next()) {
            listaAlumnos.add(new Alumnos(rs.getString("Nombre"),
                    rs.getString("Apellido"), rs.getInt("Legajo"),
                        rs.getInt("Id")));
         }
      } catch (SQLException e) {
         e.printStackTrace();
      }

   }
}
