
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class NuevaVentaFrame extends JInternalFrame{

  private final JLabel lblID;
  private final JTextField txtID;
  private final JLabel lblProducto;
  private final JTextField txtProducto;
  private final JLabel lblDescripcion;
  private final JTextField txtDescripcion;
  private final JLabel lblUnidad;
  private final JComboBox cmbUnidad;
  private final JButton btnAgregarProducto;
  private final JPanel panelProducto;
  private final DefaultTableModel modeloProductos;
  private final JTable tblProductos;
  private final JScrollPane scrollProductos;
  private final JLabel lblPrecio;
  private final JTextField txtPrecio;
  private final JButton btnCerrar;

  public NuevaVentaFrame() {
    //Configurar el contenedor principal
    setTitle("Nueva Venta");
    setSize(340, 425);
    setLayout(null);

    //Crear y agregar los widgets
    lblID = new JLabel("ID:");
    lblID.setBounds(70, 10, 30, 30);
    add(lblID);
    txtID = new JTextField(5);
    txtID.setBounds(90, 10, 50, 30);
    add(txtID);

    lblUnidad = new JLabel("Unidad:");
    lblUnidad.setBounds(145, 10, 50, 30);
    add(lblUnidad);
    cmbUnidad = new JComboBox();
    cmbUnidad.addItem("Pieza");
    cmbUnidad.addItem("Kilo");
    cmbUnidad.addItem("Litro");
    cmbUnidad.addItem("Metro");
    cmbUnidad.addItem("Paquete");
    cmbUnidad.addItem("Rollo");
    cmbUnidad.addItem("Otro");
    cmbUnidad.setBounds(193, 10, 100, 30);
    add(cmbUnidad);

    lblProducto = new JLabel("Producto:");
    lblProducto.setBounds(30, 40, 60, 30);
    add(lblProducto);
    txtProducto = new JTextField(20);
    txtProducto.setBounds(90, 40, 200, 30);
    add(txtProducto);

    lblDescripcion = new JLabel("Descripción:");
    lblDescripcion.setBounds(10, 70, 80, 30);
    add(lblDescripcion);
    txtDescripcion = new JTextField(20);
    txtDescripcion.setBounds(90, 70, 200, 30);
    add(txtDescripcion);

    lblPrecio = new JLabel("Precio:");
    lblPrecio.setBounds(40, 100, 50, 30);
    add(lblPrecio);
    txtPrecio = new JTextField(6);
    txtPrecio.setBounds(90, 100, 100, 30);
    add(txtPrecio);

    btnAgregarProducto = new JButton("Agregar");
    btnAgregarProducto.setBounds(190, 100, 100, 30);
    add(btnAgregarProducto);

    panelProducto = new JPanel();
    panelProducto.setLayout(new BorderLayout());
    panelProducto.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),
        "Productos en la orden",
        TitledBorder.CENTER,
        TitledBorder.TOP));
    panelProducto.setBounds(10, 140, 300, 200);
    add(panelProducto);

    modeloProductos = new DefaultTableModel(new String[]{"ID",
      "PRODUCTO",
      "DESCRIPCIÓN",
      "UNIDAD",
      "PRECIO"}, 0);
    tblProductos = new JTable(modeloProductos);
    scrollProductos = new JScrollPane(tblProductos);
    panelProducto.add(scrollProductos);

    btnCerrar = new JButton("Cerrar");
    btnCerrar.setBounds(110, 350, 100, 30);
    add(btnCerrar);

    //Asociar Listeners con Widgets
    btnAgregarProducto.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        Producto producto = new Producto(Integer.valueOf(txtID.getText()), //id
                                         txtProducto.getText(), //producto 
                                         txtDescripcion.getText(), //descripción 
                                         cmbUnidad.getSelectedItem().toString(), //unidad
                                         Float.valueOf(txtPrecio.getText())); //precio
        modeloProductos.addRow(producto.toVector());
        limpiarCampos();
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

    //Hacer visible el contenedor
    setVisible(true);
  }

  public void limpiarCampos() {
    txtID.setText("");
    txtProducto.setText("");
    txtDescripcion.setText("");
    txtPrecio.setText("");
    txtID.requestFocus();
  }

}
