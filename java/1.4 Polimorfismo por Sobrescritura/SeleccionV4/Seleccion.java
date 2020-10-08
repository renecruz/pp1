public class Seleccion {
  public static void main(String[] args) {
    Deportista seleccion[] = new Deportista[3];
    seleccion[0] = new Deportista("Jose Antornio Juárez", 23, 1.74f);
    seleccion[1] = new Boxeador("Canelo Álvarez", 30, 1.75f, "Peso Mediano");
    seleccion[2] = new Futbolista("Lionel Messi", 33, 1.7f, "Delantero");
    
    for (Deportista deportista : seleccion) {
      System.out.println(deportista);
      deportista.entrenar();
      deportista.competir();
    }
  }
}