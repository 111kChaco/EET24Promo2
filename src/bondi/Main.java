package bondi;

public class Main {
    public static void main(String... args) {
        DoSomething x = () -> System.out.println("Hago algo");
        ReturnString r = () -> "Holita";
        Operacion suma = (a,b) -> a + b;
        Operacion resta = (a,b) -> a - b;
        System.out.println(suma.operar(10,20));
        System.out.println(r.gimmeString());
        x.doingSomething();
    }
}

interface Operacion {
    public int operar(int a, int b);
}

interface DoSomething {
    public void doingSomething();
}

interface ReturnString {
    public String gimmeString();
}