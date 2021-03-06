package conexionbasica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectorABaseDeDatos {

    public static Connection conectorDeBD() {
        //Estos son los datos necesarios para conectarse
        //El nombre de la base de datos puede cambiar
        final String baseDeDatos = "gentesito";
        //Usuario y contraseña son configurados desde el DBMS
        final String usuario = "root";
        final String contrasena = "root";
        //La url de conexión cambia según del driver, el gestor de BBDD
        //Y luego la URL del servidor
        final String url = "jdbc:mysql://localhost:3306/";

        final String conexionString = url + baseDeDatos;


        System.out.println("Conectando a la Base de Datos.");

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("El driver no se encuentra.");
            e.printStackTrace();
            return null;
        }

        System.out.println("Driver registrado.");
        Connection connection = null;

        try {
            //Mediante este método estático obtemenos la conexión a la
            //base de datos, en base a la información que pusimos al principio
            connection = DriverManager
                    .getConnection(conexionString, usuario, contrasena);

        } catch (SQLException e) {
            System.out.println("La conexión ha fallado, revisar mensajes de consola");
            e.printStackTrace();
            return null;
        }

        if (connection != null) {
            //Si la conexión funciona la devolvemos, tal cual establece
            //la firma del método
            System.out.println("FUNCIONAAAAAA!");
            return connection;
        } else {
            //Si no funciona retornamos null
            System.out.println("Todo falló!");
            return null;
        }
    }
}