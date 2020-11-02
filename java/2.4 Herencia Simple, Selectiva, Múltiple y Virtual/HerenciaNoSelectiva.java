class Persona {
  private String nombre;
  private float estatura;

  public String getNombre() {
    return this.nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public float getEstatura() {
    return this.estatura;
  }

  public void setEstatura(float estatura) {
    this.estatura = estatura;
  }

  public boolean esAlto() {
    if (estatura >= 1.80f) {
      return true;
    } else {
      return false;
    }
  }
}

class Alumno extends Persona {
  private String matricula;

  public String getMatricula() {
    return this.matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }
}

public class HerenciaNoSelectiva {
  public static void main(String[] args) {
    Alumno alumno = new Alumno();
    alumno.setNombre("Jose Luis Reyes");
    alumno.setEstatura(1.82f);
    alumno.setMatricula("ICO321654");
    System.out.println("El alumno: " + alumno.getNombre() + 
                      ", con matrícula: " + alumno.getMatricula() + 
                      " tiene estatura: " + (alumno.esAlto() ? "Alta": "Regular"));
  }  
}