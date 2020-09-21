class PersonaV2 {
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

public class PersonaV2Test {
	public static void main(String[] args) {
    PersonaV2 persona = new PersonaV2();
    persona.nombre = "";
    persona.edad = -4;
    persona.estatura = 313.0f;

    System.out.println(persona);
    // {nombre='', edad='-4', estatura='313.0'}
  }
} 