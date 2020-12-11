package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import entity.Producto;

public class ProductoDAOImpl implements ProductoDAO {
  // Implementa las operaciones CRUD: Create, Read/Retrieve, Update, Delete

  // Crear nuevo producto en la lista
  public void agregarProducto(Producto producto) {
    // Código para agregar productos
  }

  // Recuperar todos los productos
  public List<Producto> recuperarProductos() {
    // Código para listar todos los productos
    return null;
  }

  // Recuperar un producto
  public Producto recuperarProducto(int id) {
    Producto producto = null;
    String SELECT_SQL = "SELECT id, nombre, descripcion, unidad_medida, precio FROM productos WHERE id = ?";
    try {
      PreparedStatement pstmt = Connector.getConnection().prepareStatement(SELECT_SQL);
      pstmt.setInt(1, id);
      ResultSet rs = pstmt.executeQuery();
      while (rs.next()) {
        producto = new Producto(rs.getInt("id"), rs.getString("nombre"), rs.getString("descripcion"), rs.getString("unidad_medida"), rs.getDouble("precio"));
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return producto;
  }

  // Actualizar producto existente
  public void actualizarProducto(Producto producto) {
    // Código para actualisar productos
  }

  // Eliminar producto existente
  public void eliminarProducto(int id) {
    // Código para eliminar productos
  }
}