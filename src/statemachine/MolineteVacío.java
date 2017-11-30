package statemachine;

public class MolineteVacío implements Molinete {

    ContenedorMolinetes c;

    @Override
    public Molinete pasar() {
        System.out.println("No podes pasar, deberías poner una ficha.");
        return this;
    }

    @Override
    public Molinete meterFicha() {
        System.out.println("Molinete habilitado.");
        return new MolineteHabilitado(c);
    }

    public MolineteVacío(ContenedorMolinetes c) {
        this.c = c;
    }
}
