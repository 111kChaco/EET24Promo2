package ivocarlos;

public class Main {
    public static void main(String[] args) {
        Operacion suma = (a, b) -> a + b;
        Operacion resta = (a, b) -> a - b;
        Operacion multi = (a, b) -> a * b;

        System.out.println(multi.operar(2,3));
        Calculadora c = new Calculadora();
        c.o = suma;

    }
}

class Calculadora {
    Operacion o;
    int a;
    int b;
    int resultado;
}

interface Operacion {
    public int operar(int a, int b);
}
