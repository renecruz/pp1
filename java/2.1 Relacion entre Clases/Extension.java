class Vendedor {
  private String nombre;
  private int claveVendedor;
  private String departamento;

  public Vendedor(String nombre, int claveVendedor, String departamento) {
    this.nombre = nombre;
    this.claveVendedor = claveVendedor;
    this.departamento = departamento;
  }

  @Override
  public String toString() {
    return "{" +
      "nombre='" + nombre + "'" +
      ", claveVendedor='" + claveVendedor + "'" +
      ", departamento='" + departamento + "'" +
      "}";
  }
}

class VendedorEventual extends Vendedor {
  private int diasTrabajados;
  private float sueldoPorDia;

  public VendedorEventual(String nombre, int claveVendedor, String departamento, 
                          int diasTrabajados, float sueldoPorDia) {
    super(nombre, claveVendedor, departamento);
    this.diasTrabajados = diasTrabajados;
    this.sueldoPorDia = sueldoPorDia;
  }

  @Override
  public String toString() {
    return "{" + super.toString() +
      " Sueldo='$" + (diasTrabajados * sueldoPorDia) + "'}";
  }
}

public class Extension {
  // La herencia es la típica Relación de generalización/especialización entre clases.
  // Se puede interpretar como "es un..." o de forma más explicita: "es un tipo de..."
  public static void main(String[] args) {
    Vendedor vendedorE = new VendedorEventual("Graciela Beltrán", 123666, "Perfumería", 7, 300.0f);
    System.out.println(vendedorE); 
    //{{nombre='Graciela Beltrán', claveVendedor='123666', departamento='Perfumería'} Sueldo='$2100.0'}
  }
}
