public class Persona {
  private String nombre;
  private int edad;
  private float estatura;

  public Persona (String nombre, int edad, float estatura) {
    this.nombre = nombre;
    this.edad = edad;
    this.estatura = estatura;
  }

  public String getNombre() {
    return this.nombre;
  }

  public int getEdad() {
    return this.edad;
  }

  public float getEstatura() {
    return this.estatura;
  }

  @Override
  public String toString() {
    return "nombre='" + nombre + "'" +
          ", edad='" + edad + "'" +
          ", estatura='" + estatura + "'";
  }

}
