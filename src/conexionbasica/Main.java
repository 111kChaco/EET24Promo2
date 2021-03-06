package conexionbasica;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        //Conectamos utilizando el método de la clase que creamos
        Connection c = ConectorABaseDeDatos.conectorDeBD();

        try {
            //Con la conexión funcionando, creamos un statement
            Statement st = c.createStatement();
            //Luego esta statement ejecuta una query, que nos retorna
            //un result set (es como una tabla) del cual extraeremos
            //información
            ResultSet rs = st.executeQuery("Select * from gente");
            //Luego de ejecutar la consulta, si obtenemos un resultado
            //el método resultset.next() retorna true, y avanza hacia
            //el primer registro del resultado
            while (rs.next()) {
                //Iterando, por cada uno de los registros del result set
                //vamos a mostrar la información que extraemos, indicando
                //el result set, un get con el tipo de dato que esperamos
                //a cada getter le pasamos el nombre de la columna de la que
                //queremos extraer datos
                System.out.println(
                        Integer.valueOf(rs.getInt("Id")) + " " +
                        rs.getString("Nombre") + " " +
                        rs.getString("Apellido") + " " +
                        rs.getString("Mote"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
