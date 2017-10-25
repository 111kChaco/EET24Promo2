package collections;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    List<Comida> listaComida;
    String dia;

    public void aplicarOfertas() {
        if (dia.equals("Martes")) {
            for (Comida c : listaComida) {
                c.precio *= .85;
            }
        }
    }

}
