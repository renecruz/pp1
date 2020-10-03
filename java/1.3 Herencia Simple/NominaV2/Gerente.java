public class Gerente {
  private String nombre;
  private int edad;
  private float estatura;
  private String sucursal;

  public Gerente(String nombre, int edad, float estatura, String sucursal) {
    this.nombre = nombre;
    this.edad = edad;
    this.estatura = estatura;
    this.sucursal = sucursal;
  }

  public String getNombre() {
    return this.nombre;
  }

  public int getEdad() {
    return this.edad;
  }

  public float getEstatura() {
    return this.estatura;
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
      " nombre='" + nombre + "'" +
      ", edad='" + edad + "'" +
      ", estatura='" + estatura + "'" +
      ", sucursal='" + sucursal + "'" +
      "}";
  }     
}
