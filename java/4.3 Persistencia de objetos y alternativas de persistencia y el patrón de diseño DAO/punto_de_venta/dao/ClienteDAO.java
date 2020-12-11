package dao;

import java.util.List;
import entity.Cliente;

public interface ClienteDAO {
  // Define las operaciones CRUD: Create, Read/Retrieve, Update, Delete
  public void agregarCliente(Cliente cliente); //Create
  public List<Cliente> recuperarClientes(); //Read/Retrieve
  public Cliente recuperarCliente(int clave); //Read/Retrieve
  public void actualizarCliente(Cliente cliente); //Update
  public void eliminarCliente(int clave); //Delete
}
