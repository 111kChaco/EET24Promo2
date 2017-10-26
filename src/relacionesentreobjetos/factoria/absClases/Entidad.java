package relacionesentreobjetos.factoria.absClases;

import relacionesentreobjetos.factoria.interfaces.Atacador;

public abstract class Entidad implements Atacador{
	private int hp;
	private int dmg;
	
	
	
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getDmg() {
		return dmg;
	}
	public void setDmg(int dmg) {
		this.dmg = dmg;
	}
	
	
	
	@Override
	public boolean stillCanFight() {
		return this.hp > 0;
	}
	@Override
	public void takeDamage(int dmg) {
		this.setHp(this.getHp() - dmg);		
	}
	public Entidad(int hp, int dmg) {
		super();
		this.hp = hp;
		this.dmg = dmg;
	}
	public void atacar(Atacador atacante) {
		System.out.println(this + " ataca a " + atacante);
		atacante.takeDamage(this.getDmg());	
	}
}
