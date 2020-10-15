import java.util.ArrayList;
import java.util.List;

class Tarjeta {
  private String numTarjeta;
  private String vigencia;
  private int CVV;

  public Tarjeta(String numTarjeta, String vigencia, int CVV) {
    this.numTarjeta = numTarjeta;
    this.vigencia = vigencia;
    this.CVV = CVV;
  }

  @Override
  public String toString() {
    return "{" +
      "numTarjeta='" + numTarjeta + "'" +
      ", vigencia='" + vigencia + "'" +
      ", CVV='" + CVV + "'" +
      "}";
  }
}

class Tarjetahabiente {
  private String nombre;
  private String direccion;
  private String telefono;
  private List<Tarjeta> tarjetas;

  public Tarjetahabiente(String nombre, String direccion, String telefono, Tarjeta tarjeta) {
    this.nombre = nombre;
    this.direccion = direccion;
    this.telefono = telefono;
    this.tarjetas = new ArrayList<>();
    this.tarjetas.add(tarjeta);
  }

  public void addTarjeta(Tarjeta tarjeta) {
    tarjetas.add(tarjeta);
  }

  @Override
  public String toString() {
    return "{" +
      "nombre='" + nombre + "'" +
      ", direccion='" + direccion + "'" +
      ", telefono='" + telefono + "'" +
      ", tarjetas='" + tarjetas + "'" +
      "}";
  }
}

public class Composicion {
  // La Composición es un tipo de Asociación más estricta.
  // Ambas clases que estén asociadas, dependen una de otra.
  // Se puede interpretar como "debe tener un..."
  public static void main(String[] args) {
    Tarjetahabiente cliente = new Tarjetahabiente("Claudia Fernández", 
                                                  "Calle Anastacia #2", 
                                                  "2459873451", // Primer tarjeta
                                                  new Tarjeta("1234-5678-9182-73644", "09/22", 666));  
                                                  
    cliente.addTarjeta(new Tarjeta("9900-8877-6655-4433", "11/21", 112)); // Segunda tarjeta                                             
    System.out.println(cliente);
  }
}
