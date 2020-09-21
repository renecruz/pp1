class PersonaV4 {
  private String nombre;
  private int edad;
  private float estatura;

  public String getNombre() {
    return this.nombre;
  }

  public void setNombre(String nombre) {
    if (nombre.isEmpty()) {
      this.nombre = "Indefinido";
      System.out.println("Nombre vacio, verifique");
    } else {
      this.nombre = nombre;
    }
  }

  public int getEdad() {
    return this.edad;
  }

  public void setEdad(int edad) {
    if (edad < 0 || edad > 100) {
      this.edad = 0;
      System.out.println("No se admiten edades negativas o mayores a 100 años");
    } else {
      this.edad = edad;
    }
  }

  public float getEstatura() {
    return this.estatura;
  }

  public void setEstatura(float estatura) {
    if (estatura < 0.5f || estatura > 3.0f) {
      this.estatura = 0.5f;
      System.out.println("No se admiten estaturas menores a 0.5m o mayores a 3.0m");
    } else {
      this.estatura = estatura;
    }
  }
  
  public String toString() {
    return "{" + " nombre='" + nombre + "'" 
               + ", edad='" + edad + "'" 
               + ", estatura='" + estatura + "'" 
               + "}";
  } 
}

public class PersonaV4Test {
  public static void main(String[] args) {
    PersonaV4 persona = new PersonaV4();
    persona.setNombre("");
    persona.setEdad(-4);
    persona.setEstatura(313.0f);

    System.out.println(persona);
    /* 
      Nombre vacio, verifique
      No se admiten edades negativas o mayores a 100 años
      No se admiten estaturas menores a 0.5m o mayores a 3.0m
      { nombre='Indefinido', edad='0', estatura='0.5'}
    */
  }
}