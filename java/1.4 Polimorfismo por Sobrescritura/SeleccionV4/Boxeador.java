public class Boxeador extends Deportista{
  private String peso;

  public Boxeador(String nombre, int edad, float estatura, String peso) {
    super(nombre, edad, estatura);
    this.peso = peso;
  }  

  @Override
  public void entrenar() {
    System.out.println("Haciendo 15 minutos de cuerda y 20 abdominales...");
  }

  @Override
  public void competir() {
    System.out.println("¡En guardia!, Jab, Gancho al higado...");
  }

  @Override
  public String toString() {
    return "{" + super.toString() +
      " peso='" + peso + "'" +
      "}";
  }
}