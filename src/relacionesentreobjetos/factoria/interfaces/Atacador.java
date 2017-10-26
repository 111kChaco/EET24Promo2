package relacionesentreobjetos.factoria.interfaces;

public interface Atacador {
	void atacar(Atacador atacante);
	boolean stillCanFight();
	void takeDamage(int dmg);
}
