package ejemploDesacople;
import java.util.ArrayList;
import java.util.List;
import ejemploDesacople.Bd.dto.Alumno;

public class RepoAlumnosImplMock implements RepoAlumnos {

    ArrayList<Alumno> listaAlumnos;

    @Override
    public List<Alumno> getAll() {
        return listaAlumnos;
    }

    @Override
    public Alumno getByLegajo(String legajo) {
        return null;
    }


    public RepoAlumnosImplMock() {
        listaAlumnos = new ArrayList<>();
        Alumno a1 = new Alumno(1,"Test", "test2", 1234, 6.5d);
        Alumno a2 = new Alumno(2,"Test2", "test22", 12342, 7.5d);
        Alumno a3 = new Alumno(3,"Test3", "test23", 12343, 5.5d);
        Alumno a4 = new Alumno(4,"Test4", "test24", 12344, 3.5d);
        Alumno a5 = new Alumno(5,"Test5", "test25", 12345, 9.5d);
        Alumno a6 = new Alumno(6,"Test6", "test26", 12346, 10.5d);

        listaAlumnos.add(a1);
        listaAlumnos.add(a2);
        listaAlumnos.add(a3);
        listaAlumnos.add(a4);
        listaAlumnos.add(a5);
        listaAlumnos.add(a6);
    }
}
