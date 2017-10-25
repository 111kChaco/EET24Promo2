package repasogenerics;

public class Repasillo {
    public static void main(String args[]) {
        NodoArbol<Persona> raiz = new NodoArbol<Persona>();
    }
}

class NodoArbol<T extends Comparable<T>> {
    T valor;
    NodoArbol<T> izq;
    NodoArbol<T> der;

    public void insertar(NodoArbol<T> na) {
        if (valor.compareTo(na.valor) >= 0) {
            if (this.der == null) {
                this.der = na;
            } else {
                der.insertar(na);
            }
        } else {
            if (this.izq == null) {
                this.izq = na;
            } else {
                izq.insertar(na);
            }
        }

    }


}

class NodoArbolPersona {
    Persona valor;
    NodoArbolPersona der;
    NodoArbolPersona izq;

    public void insertar(NodoArbolPersona nap) {
        if (nap.valor.edad >= this.valor.edad) {
            if (this.der == null) {
                this.der = nap;
            } else {
                der.insertar(nap);
            }
        } else {
            if (this.izq == null) {
                this.izq = nap;
            } else {
                izq.insertar(nap);
            }
        }

    }
}


class Perro {
    String raza;
    String ladrido;
}

class Persona implements Comparable<Persona> {
    String nombre;
    String apellido;
    int edad;

    @Override
    public int compareTo(Persona o) {
        if (this.edad > o.edad) {
            return 1;
        } else if (this.edad == o.edad) {
            return 0;
        }
        return -1;
    }
}
