package baseDeDatos.oop;

import baseDeDatos.oop.dto.Gente;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ListaDeGente {
   static final String select = "Select * from gente";

   List<Gente> listaGente;

   public ListaDeGente() {
      this.listaGente = new ArrayList<Gente>();
   }

   public void eliminarGente(Gente g) {
      listaGente.remove(g);
      //g.eliminarDeBaseDeDatos(c);
   }

   public void cargarDeBd(Connection c) {
      try {
         Statement st = c.createStatement();
         ResultSet rs = st.executeQuery(select);
         while(rs.next()) {
            this.listaGente.add(new Gente(rs.getInt("Id"), rs.getString("Nombre"),
                    rs.getString("Apellido"), rs.getString("Mote")));
         }
      } catch (SQLException e) {
         e.printStackTrace();
      }

   }
}
