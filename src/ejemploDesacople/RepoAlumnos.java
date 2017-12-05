package ejemploDesacople;
import java.util.List;
import ejemploDesacople.Bd.dto.Alumno;

public interface RepoAlumnos {
    List<Alumno> getAll();
    Alumno getByLegajo(String legajo);
}
