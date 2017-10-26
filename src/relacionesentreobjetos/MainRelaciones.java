package relacionesentreobjetos;

import relacionesentreobjetos.factoria.impl.AtacadorFactory;
import relacionesentreobjetos.factoria.interfaces.Atacador;
import relacionesentreobjetos.utiles.Pelea;
import relacionesentreobjetos.utiles.PeleaGrande;

import java.util.ArrayList;
import java.util.List;

public class MainRelaciones {
    public static void main(String[] args) {
        List<Atacador> listaMostros = new ArrayList<Atacador>();
        for (int i = 0; i < 4; i++) {
            listaMostros.add(AtacadorFactory.getRandomAtacadorByParameter(1));
        }
        PeleaGrande pelea = new PeleaGrande(AtacadorFactory.getRandomAtacadorByParameter(2), listaMostros);
		pelea.pelear();
    }
}
