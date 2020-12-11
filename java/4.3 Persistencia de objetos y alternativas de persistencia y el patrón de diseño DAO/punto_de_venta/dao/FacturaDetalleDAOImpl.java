package dao;

import java.util.ArrayList;
import java.util.List;
import entity.FacturaDetalle;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class FacturaDetalleDAOImpl implements FacturaDetalleDAO {
  // Implementa las operaciones CRUD: Create, Read/Retrieve, Update, Delete
  public void agregarFacturaDetalle(FacturaDetalle facturaDetalle){
    String INSERT_SQL = "INSERT INTO facturas_detalle (num_factura, producto_id, precio, cantidad, importe) "
        + "VALUES(?,?,?,?,?)";
    try {
      PreparedStatement ps = Connector.getConnection().prepareStatement(INSERT_SQL);
      //System.out.println("insertado -> " + facturaDetalle);      
      ps.setInt(1, facturaDetalle.getNum_factura() );
      ps.setInt(2, facturaDetalle.getProducto_id());
      ps.setDouble(3, facturaDetalle.getPrecio());
      ps.setDouble(4, facturaDetalle.getCantidad());
      ps.setDouble(5, facturaDetalle.getImporte());
      ps.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public List<FacturaDetalle> recuperarFacturaDetalles(int num_factura){
    List<FacturaDetalle> facturaDetalles = new ArrayList<>();
    String SELECT_SQL = "SELECT num_factura, producto_id, precio, cantidad, importe FROM facturas_detalle WHERE num_factura = ?";
    try {
      PreparedStatement pstmt = Connector.getConnection().prepareStatement(SELECT_SQL);
      pstmt.setInt(1, num_factura);
      ResultSet rs = pstmt.executeQuery();
      while (rs.next()) {
        facturaDetalles.add(new FacturaDetalle(rs.getInt("num_factura"), 
                                              rs.getInt("producto_id"),
                                              rs.getDouble("precio"), 
                                              rs.getDouble("cantidad"), 
                                              rs.getDouble("importe")));
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }    
    return facturaDetalles;
  } 

  public FacturaDetalle recuperarFacturaDetalle(int num_factura, int producto_id){
    FacturaDetalle facturaDetalle = null;
    String SELECT_SQL = "SELECT num_factura, producto_id, precio, cantidad, importe FROM facturas_detalle WHERE num_factura = ? and producto_id = ?";
    try {
      PreparedStatement pstmt = Connector.getConnection().prepareStatement(SELECT_SQL);
      pstmt.setInt(1, num_factura);
      pstmt.setInt(1, producto_id);
      ResultSet rs = pstmt.executeQuery();
      while (rs.next()) {
        facturaDetalle = new FacturaDetalle(rs.getInt("num_factura"), 
                                          rs.getInt("producto_id"),
                                          rs.getDouble("precio"), 
                                          rs.getDouble("cantidad"), 
                                          rs.getDouble("importe"));
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }    
    return facturaDetalle;
  } 

  public void actualizarFacturaDetalle(FacturaDetalle facturaDetalle){} 

  public void eliminarFacturaDetalle(int num_factura){} 
}
