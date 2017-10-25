package arbolGenerico;

public class NodoArbolBinarioBalanceado<T extends Comparable<T>> {
    private T valor;
    private NodoArbolBinarioBalanceado<T> izq;
    private NodoArbolBinarioBalanceado<T> der;

    public NodoArbolBinarioBalanceado<T> buscar(NodoArbolBinarioBalanceado<T> param) {
        if (this.equals(param)) {
            return this;
        } else if (this.izq != null || this.der != null){
            NodoArbolBinarioBalanceado<T> buscarIzq = null;
            if (this.izq != null) {
                buscarIzq = this.izq.buscar(param);
            }
            if (buscarIzq != null) {
                return buscarIzq;
            } else {
                if (this.der != null)
                    return this.der.buscar(param);
            }
        }
        return null;
    }



    public void insertarNodo(NodoArbolBinarioBalanceado<T> nodo) {
        //Si este nodo es mas chico que el parámetro
        if (valor.compareTo(nodo.valor) <= 0) {
            //Lo mando haca la derecha de este nodo
            if (der != null) {
                der.insertarNodo(nodo);
            } else {
                this.der = nodo;
            }
        } else {
            if (izq != null) {
                izq.insertarNodo(nodo);
            } else {
                this.izq = nodo;
            }
        }
    }

    public NodoArbolBinarioBalanceado(T valor, NodoArbolBinarioBalanceado<T> izq, NodoArbolBinarioBalanceado<T> der) {
        this.valor = valor;
        this.izq = izq;
        this.der = der;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public NodoArbolBinarioBalanceado<T> getIzq() {
        return izq;
    }

    public void mostrarPreorder(NodoArbolBinarioBalanceado<T> nodo) {
        if (nodo != null) {
            System.out.println(nodo);
            mostrarPreorder(nodo.getIzq());
            mostrarPreorder(nodo.getDer());
        }
    }

     public void mostrarInorder(NodoArbolBinarioBalanceado<T> nodo) {
        if (nodo != null) {
            mostrarInorder(nodo.getIzq());
            System.out.println(nodo);
            mostrarInorder(nodo.getDer());
        }
    }

    public void mostrarPostorder(NodoArbolBinarioBalanceado<T> nodo) {
        if (nodo != null) {
            mostrarPostorder(nodo.getIzq());
            mostrarPostorder(nodo.getDer());
            System.out.println(nodo);
        }
    }

    public void setIzq(NodoArbolBinarioBalanceado<T> izq) {
        this.izq = izq;
    }

    public NodoArbolBinarioBalanceado<T> getDer() {
        return der;
    }

    public void setDer(NodoArbolBinarioBalanceado<T> der) {
        this.der = der;
    }

    @Override
    public String toString() {
        return "NodoArbolBinarioBalanceado{" +
                "valor=" + valor +
                '}';
    }
}
