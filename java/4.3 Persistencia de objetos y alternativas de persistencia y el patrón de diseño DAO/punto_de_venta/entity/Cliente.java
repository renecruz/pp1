package entity;

public class Cliente {
  private int clave;
  private String nombre;
  private String direccion;
  private String rfc;

  public Cliente(int clave, String nombre, String direccion, String rfc) {
    this.clave = clave;
    this.nombre = nombre;
    this.direccion = direccion;
    this.rfc = rfc;
  }

  public int getClave() {
    return this.clave;
  }

  public String getNombre() {
    return this.nombre;
  }

  public String getDireccion() {
    return this.direccion;
  }

  public String getRfc() {
    return this.rfc;
  }

  @Override
  public String toString() {
    return "{" +
      " clave='" + clave + "'" +
      ", nombre='" + nombre + "'" +
      ", direccion='" + direccion + "'" +
      ", rfc='" + rfc + "'" +
      "}";
  }
}
