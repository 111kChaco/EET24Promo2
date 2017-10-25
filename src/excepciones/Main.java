package excepciones;

import sun.reflect.annotation.ExceptionProxy;

public class Main {
    public static void main(String[] args) {

        //Las runtime exception pueden aparecer en cualquier momento
        //int[] arreglo = new int[3];
        //System.out.println(arreglo[4]);

        PruebaExcepciones pruebaExcepciones = new PruebaExcepciones();
        //Manejo la excpeción del método, localmente
        try {
            pruebaExcepciones.invocarMetodoQueTiraExcepciones3(2);
        } catch (Exception e) {
            System.out.println("Hubo un error, mejor si lo manejamos");
            e.printStackTrace();
        }


    }
}