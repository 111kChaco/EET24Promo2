package ejemploDesacople;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ejemploDesacople.Bd.ConectadorABaseDeDatos;
import ejemploDesacople.Bd.dto.Alumno;

public class RepoAlumnosDB implements RepoAlumnos {

    List<Alumno> listaAlumno = new ArrayList<>();
    Connection c = ConectadorABaseDeDatos.conectorDeBD();

    @Override
    public List<Alumno> getAll() {
        cargarDeBd(c);
        return listaAlumno;
    }

    @Override
    public Alumno getByLegajo(String legajo) {
        return null;
    }

     public void cargarDeBd(Connection c) {
      try {
         ResultSet rs = ConectadorABaseDeDatos.getRs(c,"select * from alumno");
         while(rs.next()) {
            this.listaAlumno.add(new Alumno(rs.getInt("Id"), rs.getString("Nombre"),
                    rs.getString("Apellido"), rs.getInt("Legajo"), rs.getDouble("Promedio")));
         }
      } catch (SQLException e) {
         e.printStackTrace();
      }

   }
}
