package relacionesentreobjetos.utiles;

import relacionesentreobjetos.factoria.absClases.Entidad;
import relacionesentreobjetos.factoria.interfaces.Atacador;

public class Pelea {
	Atacador at1;
	Atacador at2;
	
	public void pelear() {
		while(at1.stillCanFight() && at2.stillCanFight()) {
			at1.atacar(at2);
			if (at2.stillCanFight()) {
				at2.atacar(at1);
			}
		}
		
		if(at1.stillCanFight()) {
			System.out.println("Gano! " + at1);
		} else if (at2.stillCanFight()) {
			System.out.println("Gano! " + at2);
			
		} else {
			System.out.println("Ambos han muerto, que bonito!");
		}
	}

	public Pelea(Atacador at1, Atacador at2) {
		super();
		this.at1 = at1;
		this.at2 = at2;
	}
	
	
	
}
