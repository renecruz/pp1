
public class Mascota {
	String nombre;
	int edad;
	float peso;
	
	void comer() {		
		System.out.println("Comiendo");
	}	
	
	void dormir() {
		System.out.println("Durmiendo");
  }
	
	public static void main(String[] args) {
		Mascota lomito = new Mascota();
		Mascota michi  = new Mascota();
		
		lomito.nombre = "Lomito";
		lomito.edad = 2;
		lomito.peso = 11.5f;
		lomito.comer();
		
		michi.nombre = "Michi";
		michi.edad = 1;
		michi.peso = 2.4f;
		michi.dormir();
	}
}