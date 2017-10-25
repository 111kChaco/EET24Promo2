package baseDeDatos;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        Connection c = ConectadorABaseDeDatos.conectorDeBD();
        System.out.println(c);
        ListaDeGente ldg = new ListaDeGente();
        ldg.cargarDeBd(c);
        for (Gente g : ldg.listaGente) {
            System.out.println(g);
        }
    }
}
