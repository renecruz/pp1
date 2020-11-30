import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUITestV9 {
  private JFrame miVentana;
  private JLabel lblUsuario;
  private JTextField txtUsuario;
  private JLabel lblPassword;
  private JTextField txtPassword;
  private JButton btnOK;
  private JButton btnCancelar;
  private JButton btnAyuda;

  public GUITestV9() {
    // Configurar el contenedor
    miVentana = new JFrame("GUI Test v9.0");
    miVentana.setSize(320, 160);
    miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    miVentana.setLayout(null);

    // Agregar Widgets
    lblUsuario = new JLabel("Usuario:");
    lblUsuario.setBounds(20, 10, 150, 30); // x, y, ancho, alto [Todo en pixeles]
    miVentana.add(lblUsuario);
    txtUsuario = new JTextField(20);
    txtUsuario.setBounds(100, 10, 200, 30);
    miVentana.add(txtUsuario);
    lblPassword = new JLabel("Contraseña:");
    lblPassword.setBounds(20, 40, 150, 30);
    miVentana.add(lblPassword);
    txtPassword = new JTextField(20);
    txtPassword.setBounds(100, 40, 200, 30);
    miVentana.add(txtPassword);
    btnOK = new JButton("OK");
    btnOK.setBounds(10, 90, 100, 30);
    miVentana.add(btnOK);
    btnCancelar = new JButton("Cancelar");
    btnCancelar.setBounds(110, 90, 100, 30);
    miVentana.add(btnCancelar);
    btnAyuda = new JButton("Ayuda");
    btnAyuda.setBounds(210, 90, 100, 30);
    miVentana.add(btnAyuda);

    // Mostrar contenedor
    miVentana.setVisible(true);
  }

  public static void main(String[] args) {
    new GUITestV9();
  }
}