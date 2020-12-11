package dao;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import entity.Cliente;

public class ClienteDAOImpl implements ClienteDAO{
  // Implementa las operaciones CRUD: Create, Read/Retrieve, Update, Delete
  
  // Crear nuevo cliente en la lista
  public void agregarCliente(Cliente cliente) {
    // Código para agregar clientes
  }

  // Recuperar todos los clientes
  public List<Cliente> recuperarClientes() {
    // Código para listar todos los clientes
    return null;
  }

  // Recuperar un cliente
  public Cliente recuperarCliente(int clave) {
    Cliente cliente = null;
    String SELECT_SQL = "SELECT clave, nombre, direccion, rfc FROM clientes WHERE clave = ?";
    try {
      PreparedStatement pstmt = Connector.getConnection().prepareStatement(SELECT_SQL);
      pstmt.setInt(1, clave);
      ResultSet rs = pstmt.executeQuery();
      while (rs.next()) {
        cliente = new Cliente(rs.getInt("clave"), rs.getString("nombre"), rs.getString("direccion"), rs.getString("rfc"));
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return cliente;
  }

  // Actualizar cliente existente
  public void actualizarCliente(Cliente cliente) {
    // Código para actualisar clientes
  }

  // Eliminar cliente existente
  public void eliminarCliente(int clave) {
    // Código para eliminar clientes
  }
}
