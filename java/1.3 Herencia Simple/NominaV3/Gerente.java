public class Gerente extends Persona{
  
  private String sucursal;

  public Gerente(String nombre, int edad, float estatura, String sucursal) {
    super(nombre, edad, estatura);
    this.sucursal = sucursal;
  }

  public String getsucursal() {
    return this.sucursal;
  }

  public void comisionPorVentas(float ventasTotales) {
    System.out.println("Ha ganado una porcentaje del: " + 
                      ( ventasTotales * 0.10) ); // 10% de la ventas totales
  }

  @Override
  public String toString() {
    return "{" +
      super.toString() +
      ", sucursal='" + sucursal + "'}";
  }     
}
