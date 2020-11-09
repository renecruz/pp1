public class Alumno {
  private int matricula;
  private String nombre;
  private String email;

  public Alumno(int matricula, String nombre, String email) {
    this.matricula = matricula;
    this.nombre = nombre;
    this.email = email;
  }

  public int getMatricula() {
    return this.matricula;
  }

  public String getNombre() {
    return this.nombre;
  }

  public String getEmail() {
    return this.email;
  }

  @Override
  public String toString() {
    return "{" +
        "matricula='" + matricula + "'" +
      ", nombre='" + nombre + "'" +
      ", email='" + email + "'" +
      "}";
  }
}