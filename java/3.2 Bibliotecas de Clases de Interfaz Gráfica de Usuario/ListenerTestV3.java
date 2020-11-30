import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextField;

public class ListenerTestV3 {
  private JFrame ventana;
  private JLabel lblNombre;
  private JTextField txtNombre;
  private JLabel lblEdad;
  private JSpinner spnEdad;
  private JLabel lblLenguaje;
  private JComboBox cmbLenguajes;
  private JButton btnGuardar;
  private JButton btnSalir;

  public ListenerTestV3() {
    // Configurar el contenedor
    ventana = new JFrame("Listener Test v3.0");
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
    Icon iconSalir = new ImageIcon("salir.png");
    btnSalir = new JButton("Salir", iconSalir);
    ventana.add(btnSalir);
    
    //Asociar Listener con Widget  
    btnGuardar.addActionListener(new GuardarListener());
    btnSalir.addActionListener(new SalirListener());

    // Mostrar contenedor
    ventana.setVisible(true);
  }

  public static void main(String[] args) {
    new ListenerTestV3();
  }

  class GuardarListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
      String strMensaje = "Nombre: " + txtNombre.getText() + "\n";
      strMensaje += "Edad: " + spnEdad.getValue() + "\n";
      strMensaje += "Lenguaje: " + cmbLenguajes.getSelectedItem();
      System.out.println(strMensaje);
    }
  }
  
  class SalirListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
      System.exit(0); //Terminar la ejecución
    }
  }
}
