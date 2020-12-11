package dao;

import java.util.List;
import entity.FacturaMaster;

public interface FacturaMasterDAO {
  // Define las operaciones CRUD: Create, Read/Retrieve, Update, Delete
  public int agregarFacturaMaster(FacturaMaster facturaMaster); //Create
  public List<FacturaMaster> recuperarFacturaMasters(); //Read/Retrieve
  public FacturaMaster recuperarFacturaMaster(int num_factura); //Read/Retrieve
  public void actualizarFacturaMaster(FacturaMaster facturaMaster); //Update
  public void eliminarFacturaMaster(int num_factura); //Delete
}
