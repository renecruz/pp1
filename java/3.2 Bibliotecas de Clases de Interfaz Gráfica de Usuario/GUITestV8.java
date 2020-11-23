import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class GUITestV8 {
  private JFrame miVentana;
  private JPanel panelDatos;
  private JPanel pUsuario;
  private JLabel lblUsuario;
  private JTextField txtUsuario;
  private JPanel pPassword;
  private JLabel lblPassword;
  private JTextField txtPassword;
  private JPanel panelBotones;
  private JButton btnOK;
  private JButton btnCancelar;
  private JButton btnAyuda;

  public GUITestV8() {
    // Configurar el contenedor
    miVentana = new JFrame("GUI Test v8.0");
    miVentana.setSize(320, 160);
    miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Agregar Widgets
    panelDatos = new JPanel();
    panelDatos.setLayout(new GridLayout(2, 1));
    pUsuario = new JPanel();
    lblUsuario = new JLabel("Usuario:");
    pUsuario.add(lblUsuario);
    txtUsuario = new JTextField(20);
    pUsuario.add(txtUsuario);
    panelDatos.add(pUsuario);
    pPassword = new JPanel();
    lblPassword = new JLabel("Contraseña:");
    pPassword.add(lblPassword);
    txtPassword = new JTextField(20);
    pPassword.add(txtPassword);
    panelDatos.add(pPassword);
    miVentana.add(panelDatos, BorderLayout.NORTH);
    panelBotones = new JPanel();
    btnOK = new JButton("OK");
    panelBotones.add(btnOK);
    btnCancelar = new JButton("Cancelar");
    panelBotones.add(btnCancelar);
    btnAyuda = new JButton("Ayuda");
    panelBotones.add(btnAyuda);
    miVentana.add(panelBotones, BorderLayout.CENTER);

    // Mostrar contenedor
    miVentana.pack();
    miVentana.setVisible(true);
  }

  public static void main(String[] args) {
    new GUITestV8();
  }
}