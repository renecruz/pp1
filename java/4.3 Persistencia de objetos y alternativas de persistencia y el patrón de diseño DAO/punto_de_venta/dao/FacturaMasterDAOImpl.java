package dao;

import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import entity.FacturaMaster;


public class FacturaMasterDAOImpl implements FacturaMasterDAO {
  // Implementa las operaciones CRUD: Create, Read/Retrieve, Update, Delete
  public int agregarFacturaMaster(FacturaMaster facturaMaster) {
    int last_num_factura = 0;
    String INSERT_SQL = "INSERT INTO facturas_master (fecha, cliente_clave, subtotal, iva, total) "
        + "VALUES(?,?,?,?,?)";
    try {
      PreparedStatement ps = Connector.getConnection().prepareStatement(INSERT_SQL);
      ps.setDate(1, facturaMaster.getFecha());
      ps.setInt(2, facturaMaster.getClave_cliente());
      ps.setDouble(3, facturaMaster.getSubtotal());
      ps.setDouble(4, facturaMaster.getIVA());
      ps.setDouble(5, facturaMaster.getTotal());
      ps.executeUpdate();

      String SELECT_SQL = "SELECT num_factura FROM facturas_master ORDER BY num_factura DESC LIMIT 1;";
      Statement stmt = Connector.getConnection().createStatement();
      ResultSet rs = stmt.executeQuery(SELECT_SQL);
      while (rs.next()) {         
        last_num_factura = rs.getInt("num_factura");  
        System.out.println(last_num_factura);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return last_num_factura;
  }

  public List<FacturaMaster> recuperarFacturaMasters() {
    List<FacturaMaster> lista = null;

    return lista;
  }

  public FacturaMaster recuperarFacturaMaster(int num_factura) {
    FacturaMaster facturaMaster = null;
    String SELECT_SQL = "SELECT num_factura, fecha, cliente_clave, subtotal, iva, total FROM facturas_master WHERE num_factura = ?";
    try {
      PreparedStatement pstmt = Connector.getConnection().prepareStatement(SELECT_SQL);
      pstmt.setInt(1, num_factura);
      ResultSet rs = pstmt.executeQuery();
      while (rs.next()) {
        facturaMaster = new FacturaMaster(rs.getInt("num_factura"), 
                                          rs.getDate("fecha"), 
                                          rs.getInt("cliente_clave"),
                                          rs.getDouble("subtotal"), 
                                          rs.getDouble("iva"), 
                                          rs.getDouble("total"));
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return facturaMaster;
  }

  public void actualizarFacturaMaster(FacturaMaster facturaMaster) {
  }

  public void eliminarFacturaMaster(int num_factura) {
  }

}
