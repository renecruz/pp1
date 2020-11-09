import java.util.List;
import java.util.Scanner;

public class AlumnoController {

  private Scanner scanner = new Scanner(System.in);
  private AlumnoDAO alumnoDAO = new AlumnoDAOImpl();

  // Iniciar la captura de alumnos
  public void iniciarCaptura() {
    System.out.print("Número de alumnos a capturar: ");
    int cantidadAlumnos = scanner.nextInt();
    scanner.skip("\\R");
    for (int i = 0; i < cantidadAlumnos; i++) {
      capturarAlumno();
    }
  }

  // Capturar un alumno
  public void capturarAlumno() {
    System.out.print("Matricula: ");
    int matricula = scanner.nextInt();
    scanner.skip("\\R");
    System.out.print("Nombre: ");
    String nombre = scanner.nextLine();
    System.out.print("Email: ");
    String email = scanner.nextLine();
    alumnoDAO.agregarAlumno(new Alumno(matricula, nombre, email));
  }

  // Imprimir la lista de alumnos
  public void verLista() {
    List<Alumno> lista = alumnoDAO.recuperarAlumnos();
    System.err.println("Lista de alumnos:");
    for (Alumno alumno : lista) {
      System.out.println(alumno);
    }
  }

  // Actualizar un alumno
  public void actualizarAlumno() {
    System.out.print("Matricula a modificar: ");
    int matricula = scanner.nextInt();
    scanner.skip("\\R");
    Alumno alumno = alumnoDAO.recuperarAlumno(matricula);
    if (alumno != null) {
      System.out.println(alumno);
      System.out.print("Nuevo Nombre: ");
      String nombre = scanner.nextLine();
      System.out.print("Nuevo Email: ");
      String email = scanner.nextLine();
      alumnoDAO.actualizarAlumno(new Alumno(matricula, nombre, email));
    }
  }

  // Eliminar un alumno
  public void eliminarAlumno() {
    System.out.print("Matricula a eliminar: ");
    int matricula = scanner.nextInt();
    scanner.skip("\\R");
    Alumno alumno = alumnoDAO.recuperarAlumno(matricula);
    if (alumno != null) {
      System.out.println("Eliminando: " + alumno);
      alumnoDAO.eliminarAlumno(Integer.valueOf(matricula));
    }
  }
}