package dao;

import java.util.List;
import entity.Producto;

public interface ProductoDAO {
  // Define las operaciones CRUD: Create, Read/Retrieve, Update, Delete
  public void agregarProducto(Producto producto); //Create
  public List<Producto> recuperarProductos(); //Read/Retrieve
  public Producto recuperarProducto(int id); //Read/Retrieve
  public void actualizarProducto(Producto producto); //Update
  public void eliminarProducto(int id); //Delete
}