package entity;

import java.util.Vector;

public class ProductoEnVenta extends Producto{
  private double cantidad;
  private double importe;
  public ProductoEnVenta(Integer id, String nombre, String descripcion, String unidad_medida, double precio, double cantidad, double importe) {
    super(id, nombre,  descripcion,  unidad_medida,  precio);
    this.cantidad = cantidad;
    this.importe = importe;
  }


  @Override
  public String toString() {
    return "{" + super.toString() +
      " cantidad='" + cantidad + "'" +
      ", importe='" + importe + "'" +
      "}";
  }
  
  public Vector<Object> toVector() {
    Vector<Object> columnas = new Vector<>();
    columnas.add(super.getId());
    columnas.add(super.getNombre());
    columnas.add(super.getDescripcion());
    columnas.add(super.getUnidad_medida());
    columnas.add(super.getPrecio());
    columnas.add(cantidad);
    columnas.add(importe);
    return columnas;
  }
}
