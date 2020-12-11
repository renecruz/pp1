package entity;

public class Producto {
  private Integer id;
  private String nombre;
  private String descripcion;
  private String unidad_medida;
  private double precio;

  public Producto(Integer id, String nombre, String descripcion, String unidad_medida, double precio) {
    this.id = id;
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.unidad_medida = unidad_medida;
    this.precio = precio;
  }

  public Integer getId() {
    return this.id;
  }

  public String getNombre() {
    return this.nombre;
  }

  public String getDescripcion() {
    return this.descripcion;
  }

  public String getUnidad_medida() {
    return this.unidad_medida;
  }

  public double getPrecio() {
    return this.precio;
  }

  @Override
  public String toString() {
    return "{" +
      " id='" + id + "'" +
      ", nombre='" + nombre + "'" +
      ", descripcion='" + descripcion + "'" +
      ", unidad_medida='" + unidad_medida + "'" +
      ", precio='" + precio + "'" +
      "}";
  }
}
