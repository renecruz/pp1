public class Seleccion {
  public static void main(String[] args) {
    Deportista deportista = new Deportista("Jose Antornio Juárez", 23, 1.74f);
    System.out.println(deportista); 
    // {nombre='Jose Antornio Juárez', edad='23', estatura='1.74'} 
    deportista.entrenar(); // Entrenando duro!
    deportista.competir(); // ¡Ganemos esta competencia!
    
    Boxeador boxeador = new Boxeador("Canelo Álvarez", 30, 1.75f, "Peso Mediano");
    System.out.println(boxeador);
    // {{nombre='Canelo Álvarez', edad='30', estatura='1.75'} peso='Peso Mediano'}
    boxeador.entrenar(); // Haciendo 15 minutos de cuerda y 20 abdominales...
    boxeador.competir(); // ¡En guardia!, Jab, Gancho al higado...

    Futbolista futbolista = new Futbolista("Lionel Messi", 33, 1.7f, "Delantero");
    System.out.println(futbolista);
    // {{nombre='Lionel Messi', edad='33', estatura='1.7'} posicion='Delantero'}
    futbolista.entrenar(); // Calentando, haciendo sprints, trotanto...
    futbolista.competir(); // Cubriendo jugador, recibiendo pase, metiendo gol!
  }
}