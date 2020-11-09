public class PersistenciaTest {
  public static void main(String[] args) {
    AlumnoController ac = new AlumnoController();
    ac.iniciarCaptura();
    ac.verLista();
    ac.actualizarAlumno();
    ac.verLista();
    ac.eliminarAlumno();
    ac.verLista();
  }
}