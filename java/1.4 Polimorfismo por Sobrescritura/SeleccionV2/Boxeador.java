public class Boxeador extends Deportista{
  private String peso;

  public Boxeador(String nombre, int edad, float estatura, String peso) {
    super(nombre, edad, estatura);
    this.peso = peso;
  }  

  @Override
  public String toString() {
    return "{" + super.toString() +
      " peso='" + peso + "'" +
      "}";
  }
}
