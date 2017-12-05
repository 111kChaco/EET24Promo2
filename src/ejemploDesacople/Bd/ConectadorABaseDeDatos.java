package ejemploDesacople.Bd;

import jdk.nashorn.internal.runtime.regexp.joni.constants.CCSTATE;

import java.sql.*;

public class ConectadorABaseDeDatos {

    public static Connection conectorDeBD() {
        //Estos son los datos necesarios para conectarse
        //El nombre de la base de datos puede cambiar
        final String baseDeDatos = "alumnos";
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

    //Esto está hecho para ahorrarse de meter try catch cada vez que
    //queres obtener un statement a partir de la conexión
    public static Statement getStatement(Connection c) {
        try {
            return c.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static ResultSet getResultset(Connection c, String query, Statement s) {
        try {
            return c.createStatement().executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static ResultSet getRs(Connection c, String query) {
        try {
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery(query);
            return rs;
        } catch (SQLException e) {
            System.out.println("We are kill.");
            e.printStackTrace();
        }
        return null;
    }


}