package baseDeDatos.oop;

import baseDeDatos.oop.dto.Gente;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        Connection c = ConectadorABaseDeDatos.conectorDeBD();
        System.out.println(c);

        Gente g = Gente.getGenteFromDBById(c, 2);
        System.out.println(g.toString());

    }
}
