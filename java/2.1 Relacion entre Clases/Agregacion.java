class Gerente {
  private String nombre;
  private String telefono;

  public Gerente(String nombre, String telefono) {
    this.nombre = nombre;
    this.telefono = telefono;
  }

  @Override
  public String toString() {
    return "{" +
      "nombre='" + nombre + "'" +
      ", telefono='" + telefono + "'" +
      "}";
  }  
}

class Tienda {
  private String nombreTienda;
  private String direccion;
  private Gerente gerente; 

  public Tienda(String nombreTienda, String direccion, Gerente gerente) {
    this.nombreTienda = nombreTienda;
    this.direccion = direccion;  
    this.gerente = gerente;  
  }

  @Override
  public String toString() {
    return "{" +
      "nombreTienda='" + nombreTienda + "'" +
      ", direccion='" + direccion + "'" +
      ", gerente='" + gerente + "'" +
      "}";
  }
}

public class Agregacion {
  // La Agregación es un tipo de asociación en una vía, es decir, unidireccional
  // Se interpreta como "tiene un..."
  public static void main(String[] args) {
    Tienda tienda = new Tienda("Patio Valle de Chalco", 
                               "Blvrd Juan Pablo II 370, El Agostadero", 
                               new Gerente("José Alcántara Díaz", "7223456789"));
    System.out.println(tienda);
  }
}
