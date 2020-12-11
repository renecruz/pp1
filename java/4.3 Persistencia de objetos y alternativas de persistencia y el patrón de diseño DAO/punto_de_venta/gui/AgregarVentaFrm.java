package gui;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import dao.ClienteDAOImpl;
import dao.Connector;
import dao.FacturaDetalleDAOImpl;
import dao.FacturaMasterDAOImpl;
import dao.ProductoDAOImpl;
import entity.Cliente;
import entity.FacturaDetalle;
import entity.FacturaMaster;
import entity.Producto;
import entity.ProductoEnVenta;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.text.NumberFormat;
import java.util.Locale;
import java.awt.Font; 

public class AgregarVentaFrm extends JInternalFrame {
  
  private static final long serialVersionUID = 1L;
  private final JPanel panelCliente;
  private final JPanel panelProductos;
  private final JLabel lblClaveCliente;
  private final JTextField txtClaveCliente;
  private final JButton btnBuscar;
  private final JLabel lblNombre;
  private final JLabel lblDireccion;
  private final JLabel lblRFC;
  private final JTextField txtNombre;
  private final JTextField txtDireccion;
  private final JTextField txtRFC;
  private final JButton btnAgregarProducto;
  private final JButton btnGuardar;
  private final JButton btnCerrar;
  private final JLabel lblSubTotal;
  private final JFormattedTextField txtSubTotal;
  private final JLabel lblIVA;
  private final JFormattedTextField txtIVA;
  private final JLabel lblTotal;
  private final JFormattedTextField txtTotal;
  private final DefaultTableModel modeloProductos;
  private final JTable tblProductos;
  private final JScrollPane scrollProductos;
  private double subtotal, iva, total;

  public AgregarVentaFrm() {
    // Configurar el contenedor
    setSize(400, 500);
    setTitle("Agregar Venta");
    setLayout(null);

    // Configurar widgets
    panelCliente = new JPanel();
    panelCliente.setLayout(null);
    panelCliente.setBorder(BorderFactory.createTitledBorder(
                                        BorderFactory.createEtchedBorder(), 
                                        "Datos del Cliente",
                                        TitledBorder.LEFT, 
                                        TitledBorder.TOP));
    panelCliente.setBounds(10, 5, 360, 120);
    add(panelCliente);

    lblClaveCliente = new JLabel("Clave:");
    lblClaveCliente.setBounds(15, 15, 50, 30);
    panelCliente.add(lblClaveCliente);
    txtClaveCliente = new JTextField(5);
    txtClaveCliente.setBounds(55, 15, 50, 30);
    panelCliente.add(txtClaveCliente);

    btnBuscar = new JButton("Buscar", Main.ICON_CONSULTAR);
    btnBuscar.setBounds(105, 15, 80, 30);
    panelCliente.add(btnBuscar);

    lblRFC = new JLabel("RFC:");
    lblRFC.setBounds(190, 15, 40, 30);
    panelCliente.add(lblRFC);

    txtRFC = new JTextField(13);
    txtRFC.setBounds(220, 15, 120, 30);
    txtRFC.setEnabled(false);
    panelCliente.add(txtRFC);

    lblNombre = new JLabel("Nombre:");
    lblNombre.setBounds(20, 45, 60, 30);
    panelCliente.add(lblNombre);

    txtNombre = new JTextField(40);
    txtNombre.setBounds(80, 45, 260, 30);
    txtNombre.setEnabled(false);
    panelCliente.add(txtNombre);

    lblDireccion = new JLabel("Dirección:");
    lblDireccion.setBounds(15, 75, 100, 30);
    panelCliente.add(lblDireccion);

    txtDireccion = new JTextField(50);
    txtDireccion.setBounds(80, 75, 260, 30);
    txtDireccion.setEnabled(false);
    panelCliente.add(txtDireccion);

    btnAgregarProducto = new JButton("Agregar Producto", Main.ICON_AGREGAR);
    btnAgregarProducto.setBounds(115,130,150,30);
    add(btnAgregarProducto);

    panelProductos = new JPanel();
    panelProductos.setBounds(10, 160, 360,150);
    panelProductos.setLayout(new BorderLayout());
    panelProductos.setBorder(BorderFactory.createTitledBorder(
                                      BorderFactory.createEtchedBorder(), 
                                      "Productos en la venta",
                                      TitledBorder.CENTER, 
                                      TitledBorder.TOP));
    add(panelProductos);
    modeloProductos = new DefaultTableModel(new String[]{"ID",
                                                        "NOMBRE",
                                                        "DESCRIPCIÓN",
                                                        "UNIDAD",
                                                        "PRECIO",
                                                        "CANTIDAD",
                                                        "IMPORTE"}, 0);
    tblProductos = new JTable(modeloProductos);
    scrollProductos = new JScrollPane(tblProductos);
    panelProductos.add(scrollProductos);

    lblSubTotal = new JLabel("SubTotal:");
    lblSubTotal.setBounds(200,310,60,30);
    add(lblSubTotal);
    txtSubTotal = new JFormattedTextField(NumberFormat.getCurrencyInstance(Locale.US));
    txtSubTotal.setHorizontalAlignment(JTextField.RIGHT);
    txtSubTotal.setBounds(260,310,110,30);
    add(txtSubTotal);

    lblIVA = new JLabel("I.V.A.:");
    lblIVA.setBounds(220,340,60,30);
    add(lblIVA);
    txtIVA = new JFormattedTextField(NumberFormat.getCurrencyInstance(Locale.US));
    txtIVA.setHorizontalAlignment(JTextField.RIGHT);
    txtIVA.setBounds(260,340,110,30);
    add(txtIVA);

    lblTotal = new JLabel("Total:");
    lblTotal.setBounds(220,370,60,30);
    add(lblTotal);
    txtTotal = new JFormattedTextField(NumberFormat.getCurrencyInstance(Locale.US));
    txtTotal.setHorizontalAlignment(JTextField.RIGHT);
    txtTotal.setFont(txtTotal.getFont().deriveFont(Font.BOLD, 14f));
    txtTotal.setBounds(260,370,110,30);
    add(txtTotal);

    btnGuardar = new JButton("Guardar", Main.ICON_GUARDAR);
    btnGuardar.setBounds(70,420,100,30);
    add(btnGuardar);

    btnCerrar = new JButton("Cerrar", Main.ICON_SALIR);
    btnCerrar.setBounds(200, 420, 100, 30);
    add(btnCerrar);

    // Asociar los Listeners con los widgets
    btnBuscar.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        if (!txtClaveCliente.getText().isEmpty()) {
          ClienteDAOImpl clienteDAO = new ClienteDAOImpl();
          Cliente cliente = clienteDAO.recuperarCliente(Integer.valueOf(txtClaveCliente.getText()));
          if (cliente != null) { // Existe cliente
            txtNombre.setText(cliente.getNombre());
            txtDireccion.setText(cliente.getDireccion());
            txtRFC.setText(cliente.getRfc());
          } else {
            JOptionPane.showMessageDialog(AgregarVentaFrm.this, 
                                          "Clave de cliente inexistente", 
                                          "Aviso",
                                          JOptionPane.INFORMATION_MESSAGE, 
                                          Main.ICON_ERROR);
            limpiarCamposCliente();
          }
        } else {
          txtClaveCliente.requestFocus();
        }
      }
    });

    btnAgregarProducto.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String id = (String) JOptionPane.showInputDialog(AgregarVentaFrm.this, 
                                              "Clave del producto:",
                                              "Aviso",
                                              JOptionPane.QUESTION_MESSAGE,
                                              Main.ICON_PREGUNTA,
                                              null,
                                              null);
        if (id != null) {
          if (!id.isEmpty()) {                                              
            ProductoDAOImpl productoDAO = new ProductoDAOImpl();
            Producto producto = productoDAO.recuperarProducto(Integer.valueOf(id));
            if (producto != null) {
              String cantidad = (String) JOptionPane.showInputDialog(AgregarVentaFrm.this, 
                                                            producto + "\nCantidad:",
                                                            "Aviso",
                                                            JOptionPane.QUESTION_MESSAGE,
                                                            Main.ICON_PREGUNTA,
                                                            null,
                                                            null);
              
              ProductoEnVenta productoEnVenta = new ProductoEnVenta(producto.getId(),
                                                                    producto.getNombre(),
                                                                    producto.getDescripcion(),
                                                                    producto.getUnidad_medida(),
                                                                    producto.getPrecio(),
                                                                    Double.valueOf(cantidad),
                                                                    (producto.getPrecio() * Double.valueOf(cantidad)));
              modeloProductos.addRow(productoEnVenta.toVector());
              subtotal += (producto.getPrecio() * Double.valueOf(cantidad));
              iva = (subtotal * 0.16); //16% IVA
              total = (subtotal + iva);
              txtSubTotal.setValue(subtotal);
              txtIVA.setValue(iva);
              txtTotal.setValue(total);
            } else {
              JOptionPane.showMessageDialog(AgregarVentaFrm.this, 
                                            "ID de producto inexistente", 
                                            "Aviso",
                                            JOptionPane.INFORMATION_MESSAGE, 
                                            Main.ICON_ERROR);
            }
          }
        }
        btnAgregarProducto.requestFocus();
        
      }
    });

    btnGuardar.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        FacturaMasterDAOImpl facturaMasterDAO = new FacturaMasterDAOImpl();
        int num_factura = facturaMasterDAO.agregarFacturaMaster(new FacturaMaster(0, //numero factura (0 por que SQLite asignará el siguiete disponible)
                                                                Connector.getCurrentDate(), //Obtener la fecha actual en formato SQL
                                                                Integer.valueOf(txtClaveCliente.getText()), // clave del cliente
                                                                Double.valueOf(txtSubTotal.getValue().toString()), // subtotal
                                                                Double.valueOf(txtIVA.getValue().toString()), // iva
                                                                Double.valueOf(txtTotal.getValue().toString()) // total
                                                                )); 
        
        // Agregar todos los productos en el JTable
        // ProductoEnVenta
        FacturaDetalleDAOImpl facturaDetalleDAO = new FacturaDetalleDAOImpl();
        for (int i = 0; i < modeloProductos.getRowCount(); i++) {          
          facturaDetalleDAO.agregarFacturaDetalle(new FacturaDetalle(num_factura,
                                                                (int) modeloProductos.getValueAt(i, 0),   //producto ID
                                                                (double) modeloProductos.getValueAt(i, 4),   //precio
                                                                (double) modeloProductos.getValueAt(i, 5),   //cantidad
                                                                (double) modeloProductos.getValueAt(i, 6))); //importe
        }
        
        JOptionPane.showMessageDialog(AgregarVentaFrm.this, 
                                    "Factura: " + num_factura + " guardada correctamente", 
                                    "Aviso",
                                    JOptionPane.INFORMATION_MESSAGE, 
                                    Main.ICON_AYUDA);
        //Limpiar campos y el modelo, mismo que limpia automaticamente el JTable
        limpiarCamposCliente();
        limpiarCamposVenta();
        modeloProductos.setRowCount(0);
      }
    });

    btnCerrar.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        try {
          setClosed(true);
        } catch (PropertyVetoException ex) {
          ex.printStackTrace();
        }
      }
    });

    // Hacer visible el contenedor
    setVisible(true);
  }

  public void limpiarCamposCliente() {
    txtClaveCliente.setText("");
    txtNombre.setText("");
    txtDireccion.setText("");
    txtRFC.setText("");
    txtClaveCliente.requestFocus();
  }

  public void limpiarCamposVenta() {
    txtSubTotal.setText("");
    txtIVA.setText("");
    txtTotal.setText("");
  }
}