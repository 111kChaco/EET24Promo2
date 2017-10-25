package sorteador;

import java.util.HashMap;
import java.util.Random;

public class Sorteador {
    public static void main(String[] args) {
        //String[] presentes = {"Guido", "Agustin", "Maxi", "Cristian", "Omar", "Educardo", "Nahuel"};
        //String[] presentes = {"Heads", "Tails"};
        String[] presentes = {"Fabio", "Alexis", "Silvio"};
        Sorteo sorteo = new Sorteo(presentes);
        String afortunado = "";
        do {
            afortunado = sorteo.getSorteado();
        } while (!afortunado.equals("Fabio"));
        System.out.println("El afortunado es: " + afortunado);
        /*
        HashMap<String, Integer> tabla = new HashMap<>();
        for(int i=0; i < presentes.length; i++) {
            tabla.put(presentes[i], 0);
        }
        System.out.println(tabla);
        for(int i=0; i< 12345678; i++) {
            String sorteado = sorteo.getSorteado();
            Integer cantidad = tabla.get(sorteado);
            cantidad++;
            tabla.put(sorteado, cantidad);
        }
        System.out.println(tabla);*/
    }
}
