import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlumnoDAOImpl implements AlumnoDAO {
  // Implementa las operaciones CRUD: Create, Read/Retrieve, Update, Delete
  private Map<Integer, Alumno> alumnos = new HashMap<>();

  // Crear nuevo alumno en la lista
  public void agregarAlumno(Alumno alumno) {
    alumnos.put(alumno.getMatricula(), alumno);
  }

  // Recuperar todos los alumnos
  public List<Alumno> recuperarAlumnos() {
    return new ArrayList<Alumno>(alumnos.values());
  }

  // Recuperar un alumno
  public Alumno recuperarAlumno(int matricula) {    
    return alumnos.get(Integer.valueOf(matricula));
  }

  // Actualizar alumno existente
  public void actualizarAlumno(Alumno alumno) {
    alumnos.replace(alumno.getMatricula(), alumno);
  }

  // Eliminar alumno existente
  public void eliminarAlumno(int matricula) {
    alumnos.remove(Integer.valueOf(matricula));
  }
}