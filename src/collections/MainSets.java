package collections;

import java.util.HashSet;
import java.util.Set;

public class MainSets {
    public static void main(String[] args) {
        Set<Comida> setComida = new HashSet<>();
        Comida papitas = new Comida("Papitas","China",1.5);
        int x = 10;
        int y = 10;
        System.out.println(x == y);
        Numerito n = new Numerito();
        n.numero = 10;
        Numerito n2 = new Numerito();
        n2.numero = 10;
        System.out.println(n == n2);
        System.out.println(n.numero == n2.numero);
        System.out.println(n == n);
        Numerito n3 = n;
        System.out.println(n == n3);

        setComida.add(papitas);
        setComida.add(papitas);
        setComida.add(papitas);
        setComida.add(papitas);
        setComida.add(new Comida("Papitas", "China", 1.5));
        System.out.println(setComida);

        Set<String> setString = new HashSet<String>();
        setString.add("Hola");
        setString.add(new String("Testtesttest"));
        setString.add("Hola");
        setString.add(new String("Testtesttest"));
        setString.add("Hola");
        System.out.println(setString);
    }
}

class Numerito {
    int numero;
}
