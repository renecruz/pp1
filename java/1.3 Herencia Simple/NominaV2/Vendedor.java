public class Vendedor {
  private String nombre;
  private int edad;
  private float estatura;
  private String departamento;

  public Vendedor(String nombre, int edad, float estatura, String departamento) {
    this.nombre = nombre;
    this.edad = edad;
    this.estatura = estatura;
    this.departamento = departamento;
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
      " nombre='" + nombre + "'" +
      ", edad='" + edad + "'" +
      ", estatura='" + estatura + "'" +
      ", departamento='" + departamento + "'" +
      "}";
  }  
}