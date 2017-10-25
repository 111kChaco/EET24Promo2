package com.company;

import java.util.Scanner;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;

    static String[] prohibidos = {"Potamo", "Pepe", "Xeneise"};

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        for (int i = 0; i < prohibidos.length; i++) {
            if (apellido.equals(prohibidos[i])) {
                System.out.println("Nombre prohibido");
                throw new RuntimeException("Por favor usar un nombre válido");
            }
        }
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void cargarYValidarEdad(int edad, Scanner s) {
        while (edad < 0) {
            System.out.println("Por favor ingrese una edad valida, mayor a 0");
            edad = s.nextInt();
        }
        setEdad(edad);
    }

    private void setEdad(int edad) {
        if (edad < 0) {
            throw new RuntimeException("La edad no puede ser negativa");
        }
        this.edad = edad;
    }
}
