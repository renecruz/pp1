import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Calendar;

public class Fecha {

  public static final String AUTOR = "René Cruz - 2020";

  public static String getFechaDMA() {    
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDateTime now = LocalDateTime.now();
    return dtf.format(now);
  }

  public static String getHoraHMS() {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
    LocalDateTime now = LocalDateTime.now();
    return dtf.format(now);
  }

  public static int getDiaDeLaSemana() {
    return Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
  }

  public static String getNombreDiaDeLaSemana() {
    int dia = getDiaDeLaSemana();
    switch (dia) {
      case 1:
        return "Domingo";
      case 2:
        return "Lunes";
      case 3:
        return "Martes";
      case 4:
        return "Miércoles";
      case 5:
        return "Jueves";
      case 6:
        return "Viernes";
      case 7:
        return "Sábado";
      default:
        return "";
    }
  }
}