public class Futbolista extends Deportista {
  private String posicion;

  public Futbolista(String nombre, int edad, float estatura, String posicion) {
    super(nombre, edad, estatura);
    this.posicion = posicion;
  }

  @Override
  public void entrenar() {
    System.out.println("Calentando, haciendo sprints, trotanto...");
  }

  @Override
  public void competir() {
    System.out.println("Cubriendo jugador, recibiendo pase, metiendo gol!");
  }

  @Override
  public String toString() {
    return "{" + super.toString() +
      " posicion='" + posicion + "'" +
      "}";
  }
}
