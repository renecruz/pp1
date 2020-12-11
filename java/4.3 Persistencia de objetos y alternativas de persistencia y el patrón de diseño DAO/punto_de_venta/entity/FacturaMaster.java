package entity;

import java.sql.Date;

public class FacturaMaster {
  private int num_factura;
  private Date fecha;
  private int clave_cliente;
  private double subtotal;
  private double iva;
  private double total;

  public FacturaMaster(int num_factura, Date fecha, int clave_cliente, double subtotal, double iva, double total) {
    this.num_factura = num_factura;
    this.fecha = fecha;
    this.clave_cliente = clave_cliente;
    this.subtotal = subtotal;
    this.iva = iva;
    this.total = total;
  }

  public int getNum_factura() {
    return this.num_factura;
  }

  public Date getFecha() {
    return this.fecha;
  }

  public int getClave_cliente() {
    return this.clave_cliente;
  }

  public double getSubtotal() {
    return this.subtotal;
  }

  public double getIVA() {
    return iva;
  }
  public double getTotal() {
    return this.total;
  }

  @Override
  public String toString() {
    return "{" +
      " num_factura='" + num_factura + "'" +
      ", fecha='" + fecha + "'" +
      ", clave_cliente='" + clave_cliente + "'" +
      ", subtotal='" + subtotal + "'" +
      ", iva='" + iva + "'" +
      ", total='" + total + "'" +
      "}";
  }
}
