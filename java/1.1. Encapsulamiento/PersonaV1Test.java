class PersonaV1 {
	String nombre;
	int edad;
	float estatura;

	public String toString() {
    return "{" + "nombre='" + nombre + "'" 
               + ", edad='" + edad + "'" 
               + ", estatura='" + estatura + "'" 
               + "}";
  }
}

public class PersonaV1Test {
	public static void main(String[] args) {
    PersonaV1 persona = new PersonaV1();
    persona.nombre = "Fernando López";
    persona.edad = 22;
    persona.estatura = 1.70f;

    System.out.println(persona);
    // {nombre='Fernando López', edad='22', estatura='1.7'}
  }
} 