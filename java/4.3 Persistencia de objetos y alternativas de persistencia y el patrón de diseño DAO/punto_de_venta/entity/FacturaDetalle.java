package entity;

public class FacturaDetalle {
  private int num_factura;
  private int producto_id;
  private double precio;
  private double cantidad;
  private double importe;

  public FacturaDetalle(int num_factura, int producto_id, double precio, double cantidad, double importe) {
    this.num_factura = num_factura;
    this.producto_id = producto_id;
    this.precio = precio;
    this.cantidad = cantidad;
    this.importe = importe;
  }

  public int getNum_factura() {
    return this.num_factura;
  }

  public int getProducto_id() {
    return this.producto_id;
  }

  public double getPrecio() {
    return this.precio;
  }

  public double getCantidad() {
    return this.cantidad;
  }

  public double getImporte() {
    return this.importe;
  }

  @Override
  public String toString() {
    return "{" +
      " num_factura='" + num_factura + "'" +
      ", producto_id='" + producto_id + "'" +
      ", precio='" + precio + "'" +
      ", cantidad='" + cantidad + "'" +
      ", importe='" + importe + "'" +
      "}";
  }
}
