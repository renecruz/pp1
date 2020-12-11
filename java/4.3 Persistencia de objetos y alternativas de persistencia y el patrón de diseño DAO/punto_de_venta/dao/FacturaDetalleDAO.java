package dao;

import java.util.List;
import entity.FacturaDetalle;

public interface FacturaDetalleDAO {
  // Define las operaciones CRUD: Create, Read/Retrieve, Update, Delete
  public void agregarFacturaDetalle(FacturaDetalle facturaDetalle); //Create
  public List<FacturaDetalle> recuperarFacturaDetalles(int num_factura); //Read/Retrieve
  public FacturaDetalle recuperarFacturaDetalle(int num_factura, int producto_id); //Read/Retrieve
  public void actualizarFacturaDetalle(FacturaDetalle facturaDetalle); //Update
  public void eliminarFacturaDetalle(int num_factura); //Delete
}
