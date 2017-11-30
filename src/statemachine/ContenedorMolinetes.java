package statemachine;

import java.util.ArrayList;

public class ContenedorMolinetes {
    ArrayList<Molinete> molinetes;

    private Integer contador;

    public static ContenedorMolinetes getContenedorBasico() {
        ContenedorMolinetes cm = new ContenedorMolinetes();
        cm.molinetes = new ArrayList<>();
        cm.contador = 0;
        for (int i = 0; i < 5; i++) {
            cm.molinetes.add(new MolineteVacío(cm));
        }
        return cm;
    }

    public synchronized void incrementarContador() {
        this.contador++;
    }

    public void pasarPorMolineteX(int i) {
        molinetes.set(i,molinetes.get(i).pasar());
    }

    public void meterFichaEnMolineteX(int i) {
        molinetes.set(i, molinetes.get(i).meterFicha());
    }

    public Integer getContador() {
        return contador;
    }
}
