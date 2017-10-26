package relacionesentreobjetos.utiles;

import relacionesentreobjetos.factoria.interfaces.Atacador;

import java.util.List;

public class PeleaGrande {
    Atacador player;
    List<Atacador> mostros;

    public PeleaGrande(Atacador player, List<Atacador> mostros) {
        this.player = player;
        this.mostros = mostros;
    }

    public boolean listCanFight() {
    	boolean canFight = false;
		for (Atacador a: mostros) {
			canFight = canFight || a.stillCanFight();
			//return if at least one can fight
			if (canFight) return true;
		}
		return canFight;
	}

    public void pelear() {
        while(player.stillCanFight() && listCanFight()) {
        	//Revisar la lógica porque en este caso el jugador juega N turnos
			//donde N es la cantidad de enemigos
        	for (Atacador a : mostros) {
				player.atacar(a);
			}
			//Si el player mata a un enemigo, este debería desaparecer de la lista
			if (listCanFight()) {
        		//Introduciendo un hermoso bug, tarea para ustedes
				//corregimos el bug, pero tenmeos iteraciones sin sentido
				for(Atacador a : mostros) {
					if (a.stillCanFight()) {
						a.atacar(player);
					}
				}
			}
		}

		if(player.stillCanFight()) {
			System.out.println("Gano! " + player);
		} else if (listCanFight()) {
			System.out.println("Gano! La patota de mosntruos");

		} else {
			System.out.println("Todos han muerto, que bonito!");
		}
    }
}
