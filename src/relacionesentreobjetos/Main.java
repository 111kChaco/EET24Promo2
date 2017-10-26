package relacionesentreobjetos;

import relacionesentreobjetos.factoria.impl.AtacadorFactory;
import relacionesentreobjetos.utiles.Pelea;

public class Main {

	public static void main(String[] args) {
		
		Pelea pelea = new Pelea(AtacadorFactory.getRandomAtacador(), AtacadorFactory.getRandomAtacador());
		pelea.pelear();
	}

}
