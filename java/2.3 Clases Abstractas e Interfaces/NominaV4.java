import java.util.ArrayList;
import java.util.List;

abstract class Vendedor {
  private String nombre;
  private float sueldoBase;

  public Vendedor(String nombre, float sueldoBase) {
    this.nombre = nombre;
    this.sueldoBase = sueldoBase;
  }

  public float getSueldoBase() {
    return this.sueldoBase;
  }

  public String getNombre() {
    return nombre;
  }

  public abstract float calculaSueldo();
}

class VendedorBase extends Vendedor {
  private String depto;

  public VendedorBase(String nombre, float sueldoBase, String depto) {
    super(nombre, sueldoBase);
    this.depto = depto;
  }

  public float calculaSueldo() {
    return super.getSueldoBase();
  }
}

class VendedorPorComision extends Vendedor {
  private int ventasRealizadas;
  private final float COMISION_POR_VENTA = 50.0f;

  public VendedorPorComision(String nombre, float sueldoBase, int ventasRealizadas) {
    super(nombre, sueldoBase);
    this.ventasRealizadas = ventasRealizadas;
  }

  public float calculaSueldo() {
    return super.getSueldoBase() + (ventasRealizadas * COMISION_POR_VENTA);
  }
}

class VendedorEventual extends Vendedor {
  private int diasTrabajados;
  private final float SUELDO_POR_DIA = 100.0f;

  public VendedorEventual(String nombre, float sueldoBase, int diasTrabajados) {
    super(nombre, sueldoBase);
    this.diasTrabajados = diasTrabajados;
  }

  public float calculaSueldo() {
    return super.getSueldoBase() + (diasTrabajados * SUELDO_POR_DIA);
  }
}

public class NominaV4 {
  public static void main(String[] args) {
    List<Vendedor> vendedores = new ArrayList<Vendedor>();
    vendedores.add(new VendedorBase("Rosa Ma. López", 3500.0f, "Electrónicos"));
    vendedores.add(new VendedorPorComision("José Rodríguez", 3250.0f, 10));
    vendedores.add(new VendedorEventual("Julia Vázquez ", 2000.0f, 4));
    float nomina = 0.0f;
    for (Vendedor vendedor : vendedores) {
      nomina = nomina + vendedor.calculaSueldo();
      System.out.println(vendedor.getNombre() + ", Sueldo: $" + vendedor.calculaSueldo());
    }
    System.out.println("Total de vendedores: " + vendedores.size() + 
                       ", Nómina a pagar: $" + nomina);
  }  
}
