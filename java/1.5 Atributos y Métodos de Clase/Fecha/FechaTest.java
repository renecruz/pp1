public class FechaTest {
  public static void main(String[] args) {
    System.out.println("Autor: " + Fecha.AUTOR); // Autor: René Cruz - 2020
    System.out.println("Fecha: " + Fecha.getFechaDMA()); // Fecha: 10/10/2020 
    System.out.println("Hora: " + Fecha.getHoraHMS()); // Hora: 13:05:18
    System.out.println("Día: " + Fecha.getDiaDeLaSemana()); // Día: 7
    System.out.println("Día: " + Fecha.getNombreDiaDeLaSemana()); // Día: Sábado
  }
}
