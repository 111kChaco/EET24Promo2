package collections;

import java.util.Comparator;

public class ComparadorComida implements Comparator<Comida> {

    @Override
    public int compare(Comida o1, Comida o2) {
        if (o1.precio > o2.precio) {
            return 1;
        } else if (o1.precio == o2.precio) {
            return 0;
        }
        return -1;
    }
}
