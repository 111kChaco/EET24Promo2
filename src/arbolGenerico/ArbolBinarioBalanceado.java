package arbolGenerico;

import java.util.LinkedList;

public class ArbolBinarioBalanceado<T extends  Comparable<T>> {
    NodoArbolBinarioBalanceado<T> raiz;

    public ArbolBinarioBalanceado(NodoArbolBinarioBalanceado<T> raiz) {
        this.raiz = raiz;
    }

    public void mostrarPorNivel() {
        LinkedList<NodoArbolBinarioBalanceado<T>> cola = new LinkedList<>();
        cola.add(raiz);
        while(!cola.isEmpty()) {
            NodoArbolBinarioBalanceado<T> actual = cola.pollFirst();
            if (actual.getIzq() != null) {
                cola.add(actual.getIzq());
            }
            if (actual.getDer() != null) {
                cola.add(actual.getDer());
            }
            System.out.println(actual);
        }
    }
    public NodoArbolBinarioBalanceado<T> buscarEnArbol(NodoArbolBinarioBalanceado<T> param) {
        return raiz.buscar(param);
    }

    public void mostrarArbolInorder() {
        raiz.mostrarInorder(raiz);
    }

    public void mostrarArbolPreOrder() {
        raiz.mostrarPreorder(raiz);
    }

    public void mostrarArbolPostorder() {
        raiz.mostrarPostorder(raiz);
    }

    public void arbolInsertarNodo(NodoArbolBinarioBalanceado<T> nodo) {
        raiz.insertarNodo(nodo);
    }
}
