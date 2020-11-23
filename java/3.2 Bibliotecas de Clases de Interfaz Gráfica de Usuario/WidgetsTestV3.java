import java.awt.FlowLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextField;

public class WidgetsTestV3 {
  private JFrame ventana;
  private JLabel lblNombre;
  private JTextField txtNombre;
  private JLabel lblEdad;
  private JSpinner spnEdad;
  private JLabel lblLenguaje;
  private JComboBox cmbLenguajes;
  private JButton btnGuardar;
  private JButton btnCancelar;

  public WidgetsTestV3() {
    // Configurar el contenedor
    ventana = new JFrame("Widgets Test v3.0");
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setSize(320, 160);
    ventana.setLayout(new FlowLayout());

    // Agregar Widgets
    lblNombre = new JLabel("Nombre:");
    ventana.add(lblNombre);
    txtNombre = new JTextField(20);
    ventana.add(txtNombre);
    lblEdad = new JLabel("Edad:");
    ventana.add(lblEdad);
    spnEdad = new JSpinner();
    spnEdad.setValue(18);
    ventana.add(spnEdad);
    lblLenguaje = new JLabel("Lenguaje:");
    ventana.add(lblLenguaje);
    cmbLenguajes = new JComboBox();
    cmbLenguajes.addItem("Java");
    cmbLenguajes.addItem("Python");
    cmbLenguajes.addItem("C/C++");
    cmbLenguajes.addItem("Ruby");
    ventana.add(cmbLenguajes);
    Icon iconGuardar = new ImageIcon("guardar.png");
    btnGuardar = new JButton("Guardar", iconGuardar);
    ventana.add(btnGuardar);
    Icon iconCancelar = new ImageIcon("cancelar.png");
    btnCancelar = new JButton("Cancelar", iconCancelar);
    ventana.add(btnCancelar);

    // Mostrar contenedor
    ventana.setVisible(true);
  }

  public static void main(String[] args) {
    new WidgetsTestV3();
  }
}
