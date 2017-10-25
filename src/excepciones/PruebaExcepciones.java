package excepciones;

public class PruebaExcepciones {
    public void tiraExcepciones(int i) throws Exception {
        //Si es par, tiro una excepción
        if (i % 2 == 0) {
            throw new Exception("Excepcion por ser par");
        }
        System.out.println("Me pasaron un número impar");
    }

    //En vez de utilizar un try catch, paso al siguiente, la excepción que puede ocurrir
    public void invocarMetodoQueTiraExcepciones(int i) throws Exception {
        tiraExcepciones(i);
    }
     //En vez de utilizar un try catch, paso al siguiente, la excepción que puede ocurrir
    public void invocarMetodoQueTiraExcepciones2(int i) throws Exception {
        invocarMetodoQueTiraExcepciones(i);
    }
     //En vez de utilizar un try catch, paso al siguiente, la excepción que puede ocurrir
    public void invocarMetodoQueTiraExcepciones3(int i) throws Exception {
        invocarMetodoQueTiraExcepciones2(i);
    }

    public void tiraUnchecked(int i) {
        if (i % 3 == 0) {
            System.out.println("Es impar? :thinking:");
        } else {
            Object o = null;
            o.toString();
        }
    }
        public void salvarAlmundo() {
            throw new RuntimeException("Todavía no se puede");
        }
    }


