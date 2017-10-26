package relacionesentreobjetos.factoria.impl;

import relacionesentreobjetos.factoria.absClases.Entidad;

public class Mounstro extends Entidad {

	
	private String nombre;
	private String modificador;
	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getModificador() {
		return modificador;
	}



	public void setModificador(String modificador) {
		this.modificador = modificador;
	}

	

	public Mounstro(int hp, int dmg, String nombre, String modificador) {
		super(hp, dmg);
		this.nombre = nombre;
		this.modificador = modificador;
	}



	@Override
	public String toString() {
		return "M: " + nombre + " " + modificador + "[getHp()=" + getHp() + ", getDmg()=" + getDmg() + "]";
	}

	
	
	

}
