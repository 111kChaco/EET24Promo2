package ejemploDesacople;

public class Alumno {
    private String nombre;
    private String apellido;
    private int legajo;
    private double promedio;

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

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", legajo=" + legajo +
                ", promedio=" + promedio +
                '}';
    }

    public Alumno(String nombre, String apellido, int legajo, double promedio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.promedio = promedio;
    }

    public Alumno() {
    }
}
