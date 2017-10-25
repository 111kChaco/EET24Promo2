package excepciones;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOExcepciones {
    public static void main(String[] main) {
        PruebaExcepciones p = new PruebaExcepciones();
        p.salvarAlmundo();
        p.tiraUnchecked(2);
    }


    public static void m1() {
         try {
            Object o = null;
            o.toString();
            FileReader fileReader = new FileReader("c:\\Users\\BairesDev\\Documents\\Busqueda.xlsm");
            char[] arreglito = new char[10];
            System.out.println(fileReader.read(arreglito));
            for (int i = 0; i < 10; i++) {
                System.out.print(arreglito[i]);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Fue file not found");
            e.printStackTrace();
        }catch (IOException e) {
            System.out.println("Fue IO");
            e.printStackTrace();
        }

    }
}
