package ejemploDesacople;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import ejemploDesacople.Bd.dto.Alumno;

public class Main {
    static RepoAlumnos repoAlumnos;
    public static void main(String[] args) {
        //Inyección de dependencia hardcodeada o sea que no es para puristas, es un mero ejemplos
        //repoAlumnos = new RepoAlumnosImplMock();
        repoAlumnos = new RepoAlumnosDB();
        Scanner s = new Scanner(System.in);
        System.out.println("Qué desea hacer? Salir, ver 'aprobados', ver 'alumnos'");
        String opcion = s.next();
        while (!opcion.equalsIgnoreCase("Salir")) {
            if (opcion.equalsIgnoreCase("aprobados")) {
                System.out.println(getAprobados());
            } else if (opcion.equalsIgnoreCase("alumnos")) {
                System.out.println(repoAlumnos.getAll());
            } else if (opcion.equalsIgnoreCase("switchMock")) {
                repoAlumnos = new RepoAlumnosImplMock();
            } else if (opcion.equalsIgnoreCase("switchDB")) {
                repoAlumnos = new RepoAlumnosDB();
            } else {
                System.out.println("Qué hiciste cabeza lee bien, capo. Que te pensa que so hacker bo.");
            }
            opcion = s.next();
        }
    }

    public static ArrayList<Alumno> getAprobados() {
        List<Alumno> listaAlumnos = repoAlumnos.getAll();
        ArrayList<Alumno> toReturn = new ArrayList<>();
        for (Alumno a : listaAlumnos) {
            if (a.getPromedio() > 6.0) {
                toReturn.add(a);
            }
        }
        return toReturn;
    }
}
