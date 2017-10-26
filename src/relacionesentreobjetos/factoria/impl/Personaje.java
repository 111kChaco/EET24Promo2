package relacionesentreobjetos.factoria.impl;

import relacionesentreobjetos.factoria.absClases.Entidad;

public class Personaje extends Entidad {

	String nombre;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Personaje(int hp, int dmg, String nombre) {
		super(hp, dmg);
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Pj: " + nombre + "[getHp()=" + getHp() + ", getDmg()=" + getDmg() + "]";
	}

}
