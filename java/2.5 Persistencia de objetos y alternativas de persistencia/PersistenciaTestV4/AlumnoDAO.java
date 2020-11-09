import java.util.List;

public interface AlumnoDAO {
  // Define las operaciones CRUD: Create, Read/Retrieve, Update, Delete
  public void agregarAlumno(Alumno alumno); //Create
  public List<Alumno> recuperarAlumnos(); //Read/Retrieve
  public Alumno recuperarAlumno(int matricula); //Read/Retrieve
  public void actualizarAlumno(Alumno alumno); //Update
  public void eliminarAlumno(int matricula); //Delete
}