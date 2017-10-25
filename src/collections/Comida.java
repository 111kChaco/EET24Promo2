package collections;

public class Comida {
    String nombre;
    String paisDeOrigen;
    double precio;

    public Comida(String nombre, String paisDeOrigen, double precio) {
        this.nombre = nombre;
        this.paisDeOrigen = paisDeOrigen;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Comida{" +
                "nombre='" + nombre + '\'' +
                ", paisDeOrigen='" + paisDeOrigen + '\'' +
                ", precio=" + precio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Comida)) return false;

        Comida comida = (Comida) o;

        if (Double.compare(comida.precio, precio) != 0) return false;
        if (!nombre.equals(comida.nombre)) return false;
        return paisDeOrigen.equals(comida.paisDeOrigen);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = nombre.hashCode();
        result = 31 * result + paisDeOrigen.hashCode();
        temp = Double.doubleToLongBits(precio);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
