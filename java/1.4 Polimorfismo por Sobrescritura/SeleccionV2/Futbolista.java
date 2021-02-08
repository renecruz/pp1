public class Futbolista extends Deportista {
  private String posicion;

  public Futbolista(String nombre, int edad, float estatura, String posicion) {
    super(nombre, edad, estatura);
    this.posicion = posicion;
  }  

  @Override
  public String toString() {
    return "{" + super.toString() +
      " posicion='" + posicion + "'" +
      "}";
  }
}
