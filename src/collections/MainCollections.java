package collections;

import java.util.*;

public class MainCollections {
   public static void main(String[] args) {
       Menu menu1 = new Menu();
       System.out.println(menu1.listaComida);
       //menu1.listaComida = new ArrayList<>();
       menu1.listaComida = new LinkedList<>();
       //menu1.listaComida = new Stack<>();
       //menu1.listaComida = new Vector<>();

       menu1.listaComida.add(new Comida("Panchito","Once",3.5));
       menu1.listaComida.add(new Comida("Chori", "Argentina", 1.0));
       menu1.listaComida.add(new Comida("Test", "TestLand", 3.0));

       menu1.listaComida.sort(new ComparadorComida());


       System.out.println(menu1.listaComida);
   }
}
