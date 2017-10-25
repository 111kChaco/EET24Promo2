package sorteador;

import java.util.Random;

/***
 * Clase que permite realizar un sorteo, toma un arreglo de
 * strings como parámetro, y con un generador de números
 * aleatorios, elige a una persona de ese arreglo y retorna
 * el nombre del condenado
 */
public class Sorteo {
    private String[] presentes;
    Random random = new Random();

    /***
     * En base al arreglo de strings retorna el contenido
     * de una posición aleatoria.
     * @return
     */
    public String getSorteado() {
        int condenado = random.nextInt(presentes.length);
        return presentes[condenado];
    }

    public String[] getPresentes() {
        return presentes;
    }

    public void setPresentes(String[] presentes) {
        this.presentes = presentes;
    }

    public Sorteo(String[] presentes) {
        this.presentes = presentes;
    }
}
