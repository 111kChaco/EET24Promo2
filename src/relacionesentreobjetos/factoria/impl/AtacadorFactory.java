package relacionesentreobjetos.factoria.impl;

import java.util.Random;

import relacionesentreobjetos.factoria.interfaces.Atacador;

public class AtacadorFactory {
    public static Atacador getRandomAtacador() {
        Random rng = new Random();
        int tipo = rng.nextInt(3);
        int dmg = rng.nextInt(300);
        int hp = rng.nextInt(300);
        String nombre = "RandomAtacador" + rng.nextInt(65345);
        String modificador = "RandomMod" + rng.nextInt(234234);

        switch (tipo) {
            case 1:
                return new Mounstro(hp, dmg, nombre, modificador);
            case 2:
                return new Personaje(hp, dmg, nombre);
            case 3:
                return new PersonajeDebilucho(hp, dmg, nombre);
            default:
                return new PersonajeDebilucho(hp, dmg, nombre);
        }
    }

    //Tarea para el hogar, eliminar codigo duplicado :D
    public static Atacador getRandomAtacadorByParameter(int tipo) {
        Random rng = new Random();
        int dmg = rng.nextInt(300);
        int hp = rng.nextInt(300);
        String nombre = "Rng" + rng.nextInt(65345);
        String modificador = "RngMod" + rng.nextInt(234234);

        switch (tipo) {
            case 1:
                return new Mounstro(hp, dmg, nombre + "Mostro", modificador);
            case 2:
                return new Personaje(hp, dmg, nombre + "Pejonaje");
            case 3:
                return new PersonajeDebilucho(hp, dmg, nombre);
            default:
                return new PersonajeDebilucho(hp, dmg, nombre);
        }
    }
}
