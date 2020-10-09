public class Deportista {
  private String nombre;
  private int edad;
  private float estatura;

  public Deportista(String nombre, int edad, float estatura) {
    this.nombre = nombre;
    this.edad = edad;
    this.estatura = estatura;
  }

  public void entrenar() {
    System.out.println("Entrenando duro!");
  }

  public void competir() {
    System.out.println("¡Ganemos esta competencia!");
  }

  @Override
  public String toString() {
    return "{" +
      " nombre='" + nombre + "'" +
      ", edad='" + edad + "'" +
      ", estatura='" + estatura + "'" +
      "}";
  }
}