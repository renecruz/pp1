public class Seleccion {
  public static void main(String[] args) {
    Deportista deportista = new Deportista("Jose Antonio Juárez", 23, 1.74f);
    System.out.println(deportista); 
    // {nombre='Jose Antonio Juárez', edad='23', estatura='1.74'} 
    deportista.entrenar(); // Entrenando duro!
    deportista.competir(); // Ganemos esta competencia!
  }
}
