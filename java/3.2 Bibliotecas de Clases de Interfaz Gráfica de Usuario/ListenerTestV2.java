import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class ListenerTestV2 {
  private JFrame ventana;
  private JLabel lblEmail;
  private JTextField txtEmail;
  private JLabel lblSexo;
  private JRadioButton rdoFemenino;
  private JRadioButton rdoMasculino;
  private ButtonGroup rdoGrupoSexo;
  private JLabel lblComentario;
  private JCheckBox chkMusica;
  private JCheckBox chkLibros;
  private JCheckBox chkCine;
  private JButton btnGuardar;
  private JButton btnSalir;
  private JButton btnAyuda;

  public ListenerTestV2() {
// Configurar el contenedor
    ventana = new JFrame("Listener Test v2.0");
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setSize(320, 160);
    ventana.setLayout(new FlowLayout());

    // Agregar Widgets
    lblEmail = new JLabel("email:");
    ventana.add(lblEmail);
    txtEmail = new JTextField(20);
    ventana.add(txtEmail);
    lblSexo = new JLabel("Sexo:");
    ventana.add(lblSexo);
    rdoGrupoSexo = new ButtonGroup();
    rdoFemenino = new JRadioButton("Femenino");
    rdoMasculino = new JRadioButton("Masculino");
    rdoFemenino.setSelected(true);
    rdoGrupoSexo.add(rdoFemenino);
    rdoGrupoSexo.add(rdoMasculino);
    ventana.add(rdoFemenino);
    ventana.add(rdoMasculino);
    lblComentario = new JLabel("Preferencias:");
    ventana.add(lblComentario);
    chkMusica = new JCheckBox("Música");
    chkLibros = new JCheckBox("Libros");
    chkCine = new JCheckBox("Cine");
    ventana.add(chkMusica);
    ventana.add(chkLibros);
    ventana.add(chkCine);
    Icon iconGuardar = new ImageIcon("guardar.png");
    btnGuardar = new JButton("Guardar", iconGuardar);
    ventana.add(btnGuardar);
    Icon iconSalir = new ImageIcon("salir.png");
    btnSalir = new JButton("Salir", iconSalir);
    ventana.add(btnSalir);
    Icon iconAyuda = new ImageIcon("ayuda.png");
    btnAyuda = new JButton(iconAyuda);
    ventana.add(btnAyuda);
    
    //Asociar Listener con Widget  
    btnGuardar.addActionListener(new EnviarListener());
    btnSalir.addActionListener(new SalirListener());
    
    // Mostrar contenedor
    ventana.setVisible(true);
  }

  public static void main(String[] args) {
    new ListenerTestV2();
  }

  class EnviarListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
      System.out.println("Email: " + txtEmail.getText() + "\n" +
                         "Sexo: " + (rdoFemenino.isSelected()?"Femenino\n":"Masculino\n") +
                         "Preferencias: " + (chkMusica.isSelected()?"Música ":"") + 
                                            (chkLibros.isSelected()?"Libros ":"") +
                                            (chkCine.isSelected()?"Cine ":"") + "\n"
                        );
    }
  }
  
  class SalirListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
      System.exit(0); //Terminar la ejecución
    }
  }
}
