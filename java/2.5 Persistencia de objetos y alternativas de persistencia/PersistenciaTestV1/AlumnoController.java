import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AlumnoController {
  private Map<Integer, Alumno> alumnos = new HashMap<>();
  private Scanner scanner = new Scanner(System.in);

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
    agregarAlumno(new Alumno(matricula, nombre, email));
  }

  // Imprimir la lista de alumnos
  public void verLista() {
    List<Alumno> lista = recuperarAlumnos();
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
    Alumno alumno = recuperarAlumno(matricula);
    if (alumno != null) {
      System.out.println(alumno);
      System.out.print("Nuevo Nombre: ");
      String nombre = scanner.nextLine();
      System.out.print("Nuevo Email: ");
      String email = scanner.nextLine();
      actualizarAlumno(new Alumno(matricula, nombre, email));
    }
  }

  // Eliminar un alumno
  public void eliminarAlumno() {
    System.out.print("Matricula a eliminar: ");
    int matricula = scanner.nextInt();
    scanner.skip("\\R");
    Alumno alumno = recuperarAlumno(matricula);
    if (alumno != null) {
      System.out.println("Eliminando: " + alumno);
      eliminarAlumno(Integer.valueOf(matricula));
    }
  }
}