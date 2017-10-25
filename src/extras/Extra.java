package extras;

import java.util.ArrayList;
import java.util.Random;

public class Extra {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        Random r = new Random();
        for (long i = 0; i < 10000000; i++) {
            lista.add(r.nextInt());
        }
        m1(lista);
        //m2(lista);
    }

    public static void m2(ArrayList<Integer> lista) {
        System.out.println("Arranca m2");
        lista.parallelStream().mapToInt(i -> i.intValue()).sum();
        System.out.println("Termina m2");
    }

    public static void m1(ArrayList<Integer> lista) {
        System.out.println("Arranca m1");
        int acum = 0;
        for (Integer i : lista) {
            acum += i;
        }
        System.out.println("Termina m1");
    }
}
