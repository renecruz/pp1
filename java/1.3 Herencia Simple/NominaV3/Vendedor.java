public class Vendedor extends Persona{
  private String departamento;

  public Vendedor(String nombre, int edad, float estatura, String departamento) {
    super(nombre, edad, estatura);
    this.departamento = departamento;
  }

  public String getDepartamento() {
    return this.departamento;
  }

  public void comisionPorVenta(float montoVenta) {
    System.out.println("Ha ganado una porcentaje del: " + 
                      ( montoVenta * 0.10) ); // 10% de la venta
  }

  @Override
  public String toString() {
    return "{" + 
      super.toString() +
      ", departamento='" + departamento + "'}";
  }  
}