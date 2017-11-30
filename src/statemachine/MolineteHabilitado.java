package statemachine;

public class MolineteHabilitado implements Molinete {

    ContenedorMolinetes c;

    @Override
    public Molinete pasar() {
        System.out.println("Ficha consumida, molinete deshabilitado");
        c.incrementarContador();
        return new MolineteVacío(c);
    }

    @Override
    public Molinete meterFicha() {
        System.out.println("Ficha devuelta, ya estaba habilitado");
        return this;
    }

    public MolineteHabilitado(ContenedorMolinetes c) {
        this.c = c;
    }
}
