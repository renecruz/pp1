
import java.util.Vector;

public class Producto {
  private int id;
  private String producto;
  private String descripcion;
  private String unidad;
  private float precioUnitario;

  public Producto(int id, String producto, String descripcion, 
                  String unidad, float precioUnitario) {
    this.id = id;
    this.producto = producto;
    this.descripcion = descripcion;
    this.unidad = unidad;
    this.precioUnitario = precioUnitario;
  }

  public int getId() {
    return this.id;
  }

  public String getProducto() {
    return this.producto;
  }

  public String getDescripcion() {
    return this.descripcion;
  }

  public String getUnidad() {
    return this.unidad;
  }

  public float getPrecioUnitario() {
    return this.precioUnitario;
  }

  @Override
  public String toString() {
    return "{" +
      " id='" + id + "'" +
      ", producto='" + producto + "'" +
      ", descripcion='" + descripcion + "'" +
      ", unidad='" + unidad + "'" +
      ", precioUnitario='" + precioUnitario + "'" +
      "}";
  }
  
  public Vector toVector() {
    Vector datos = new Vector();
    datos.add(id);
    datos.add(producto);
    datos.add(descripcion);
    datos.add(unidad);
    datos.add(precioUnitario);
    return datos;
  }
}
