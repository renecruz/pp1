
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ListenerTestV1 {
  private JFrame ventana;
  private JLabel lblNombre;
  private JTextField txtNombre;
  private JLabel lblEmail;
  private JTextField txtEmail;
  private JLabel lblComentario;
  private JTextArea txtComentario;
  private JButton btnEnviar;
  private JButton btnSalir;

  public ListenerTestV1() {
    // Configurar el contenedor
    ventana = new JFrame("Listener Test v1.0");
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setSize(320, 240);
    ventana.setLayout(new FlowLayout());

    // Agregar Widgets
    lblNombre = new JLabel("Nombre:");
    ventana.add(lblNombre);
    txtNombre = new JTextField(20);
    ventana.add(txtNombre);
    lblEmail = new JLabel("email:");
    ventana.add(lblEmail);
    txtEmail = new JTextField(20);
    ventana.add(txtEmail);
    lblComentario = new JLabel("Comentario:");
    ventana.add(lblComentario);
    txtComentario = new JTextArea(5, 20);
    ventana.add(txtComentario);
    btnEnviar = new JButton("Enviar");
    ventana.add(btnEnviar);
    btnSalir = new JButton("Salir");
    ventana.add(btnSalir);

    //Asociar Listener con Widget  
    btnEnviar.addActionListener(new EnviarListener());
    btnSalir.addActionListener(new SalirListener());
    
    // Mostrar contenedor
    ventana.setVisible(true);
  }

  public static void main(String[] args) {
    new ListenerTestV1();
  }

  class EnviarListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
      System.out.println("Nombre: " + txtNombre.getText() + "\n" +
                         "Email: " + txtEmail.getText() + "\n" +
                         "Comentario: " + txtComentario.getText() );
    }
  }
  
  class SalirListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
      System.exit(0);
    }
  }
}
