public class VendedorEventual extends Vendedor {
  private float sueldoPorDia;

  public VendedorEventual(String nombre, int edad, float estatura, 
                          String departamento, float sueldoPorDia) {
    super(nombre, edad, estatura, departamento);
    this.sueldoPorDia = sueldoPorDia;
  }

  public float getSueldoPorDia() {
    return this.sueldoPorDia;
  }

  @Override
  public String toString() {
    return "{" + super.toString() +
      ", sueldoPorDia='" + sueldoPorDia + "'" +
      "}";
  }  
}
