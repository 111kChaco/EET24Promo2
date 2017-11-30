package statemachine;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ContenedorMolinetes cm = ContenedorMolinetes.getContenedorBasico();
        Random r = new Random();
        int limite = r.nextInt(30);
        for (int i = 0; i < limite; i++) {
            if (r.nextInt(40) % 2 == 0) {
                cm.meterFichaEnMolineteX(r.nextInt(5));
            } else {
                cm.pasarPorMolineteX(r.nextInt(5));
            }
        }
        System.out.println(cm.getContador() + " Fichas consumidas.");
    }
}
