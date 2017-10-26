package relacionesentreobjetos.factoria.impl;

public class PersonajeDebilucho extends Personaje {

	int hpBase; //esto es el 100%
	
	
	//cuando le cambia la vida, le cambia el ataque, al estar herido
	//pega cada vez menos fuerte, sin divisiones porque no quiero
	//hacer semejante refactor
	@Override
	public void setHp(int hp) {
		super.setHp(hp);
		super.setDmg(super.getDmg() - 20);
	}
	
	public PersonajeDebilucho(int hp, int dmg, String nombre) {
		super(hp, dmg, nombre);
		this.hpBase = hp;
	}

	
}
