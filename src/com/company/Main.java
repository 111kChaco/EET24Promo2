package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Node primero = new Node();
        primero.value = 10;
        Scanner s = new Scanner(System.in);
        Persona p = new Persona();
        p.setApellido("Remington");
        p.setNombre("Pepe");
        //p.setEdad(s.nextInt());
    }

    public Persona crearPersona(Scanner s) {
        Persona p = new Persona();
        p.setApellido("Remington");
        p.setNombre("Pepe");
        //p.setEdad(s.nextInt());
        return p;
    }

    public Persona cambiarEdad(Scanner s) {
        Persona p = new Persona();
        p.setApellido("Remington");
        p.setNombre("Pepe");
        //p.setEdad(s.nextInt());
        return p;
    }

    public Persona registrarExtranjero(Scanner s) {
        Persona p = new Persona();
        p.setApellido("Remington");
        p.setNombre("Pepe");
        //p.setEdad(s.nextInt());
        return p;
    }
}
