 class PersonaV3 {
  /*                - MODIFICADORES DE ACCESO -
  +------------------------------------------------------------------+
  |   Modificador    |   Clase   | SubClase  |  Paquete  |    Todos  |
  +------------------+-----------+-----------+-----------+-----------|
  | public           |     sí    |    sí     |     sí    |    sí     |
  +------------------+-----------+-----------+-----------+-----------|
  | private          |     sí    |    no     |     no    |    no     |
  +------------------+-----------+-----------+-----------+-----------|
  | protected        |     sí    |    sí     |     sí    |    no     |
  +------------------+-----------+-----------+-----------+-----------|
  | default          |     sí    |    no     |     sí    |    no     |
  +------------------+-----------+-----------+-----------+-----------+
  */

  private String nombre;
  private int edad;
  private float estatura;

  public String getNombre() {
    return this.nombre;
  }

  public void setNombre(String nombre) {
      this.nombre = nombre;
  }

  public int getEdad() {
    return this.edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public float getEstatura() {
    return this.estatura;
  }

  public void setEstatura(float estatura) {
    this.estatura = estatura;
  }
  
  public String toString() {
    return "{" + " nombre='" + nombre + "'" 
               + ", edad='" + edad + "'" 
               + ", estatura='" + estatura + "'" 
               + "}";
  } 
}

public class PersonaV3Test {
  public static void main(String[] args) {
    PersonaV3 persona = new PersonaV3();
    persona.setNombre("");
    persona.setEdad(-4);
    persona.setEstatura(313.0f);

    System.out.println(persona);
    // {nombre='', edad='-4', estatura='313.0'}
  }
}
