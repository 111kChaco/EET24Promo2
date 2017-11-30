package ejbasedatos2811;

public class Alumnos {
    private String nombre;
    private String apellido;
    private int legajo;
    private int id;

    @Override
    public String toString() {
        return "Alumnos{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", legajo=" + legajo +
                ", id=" + id +
                '}';
    }

    public Alumnos() {
    }

    public Alumnos(String nombre, String apellido, int legajo, int id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
