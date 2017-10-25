package arbolGenerico;

import java.util.LinkedList;
import java.util.Random;

public class MainArbolGenerico {
    public static void main(String[] args) {
        LinkedList<NodoArbolBinarioBalanceado<Integer>> lista = new LinkedList<>();
        Random r = new Random();
        for (int i = 0; i < 7; i++) {
            lista.add(new NodoArbolBinarioBalanceado<>(r.nextInt(100), null, null));
        }
        //NodoArbolBinarioBalanceado<Integer> nodoAEncontrar = lista.getLast();
        NodoArbolBinarioBalanceado<Integer> nodoAEncontrar = new NodoArbolBinarioBalanceado<>(15, null, null);
        lista.stream().
                forEach(integerNodoArbolBinarioBalanceado ->
                        System.out.println(integerNodoArbolBinarioBalanceado));
        ArbolBinarioBalanceado<Integer> arbolito = new ArbolBinarioBalanceado<>(lista.poll());
        for(NodoArbolBinarioBalanceado<Integer> nodo : lista) {
            arbolito.arbolInsertarNodo(nodo);
        }
        System.out.println("--------------------------------");
        //arbolito.mostrarArbolPreOrder();
        System.out.println("--------------------------------");
        //arbolito.mostrarPorNivel();
        System.out.println(arbolito.buscarEnArbol(nodoAEncontrar).toString());
    }

    public static void primerArbol() {
        NodoArbolBinarioBalanceado<Integer> raiz = new NodoArbolBinarioBalanceado<>(10, null, null);
        NodoArbolBinarioBalanceado<Integer> deberiaSerIzqDeRaiz = new NodoArbolBinarioBalanceado<>(9, null, null);
        NodoArbolBinarioBalanceado<Integer> deberiaSerDerDeRaiz = new NodoArbolBinarioBalanceado<>(11, null, null);
        ArbolBinarioBalanceado<Integer> arbolito = new ArbolBinarioBalanceado<>(raiz);
        arbolito.arbolInsertarNodo(deberiaSerIzqDeRaiz);
        arbolito.arbolInsertarNodo(deberiaSerDerDeRaiz);
        arbolito.mostrarArbolInorder();
    }
}
