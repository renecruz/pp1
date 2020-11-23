
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

public class ListenerTestV4 {

  private JFrame ventana;
  private JLabel lblPais;
  private JList lstPais;
  private JScrollPane spPaises;
  private JButton btnGuardar;

  public ListenerTestV4() {
    // Configurar el contenedor
    ventana = new JFrame("Listener Test v4.0");
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setSize(320, 160);

    // Agregar Widgets
    lblPais = new JLabel("País de origen:");
    ventana.add(lblPais, BorderLayout.NORTH);
    lstPais = new JList(
        new String[] { "México", "U.S.A.", 
                       "Canada", "U.K.", 
                       "España", "Argentia", 
                      "Brasil", "Alemania" }
                      );
    spPaises = new JScrollPane(lstPais);
    ventana.add(spPaises, BorderLayout.CENTER);
    Icon iconGuardar = new ImageIcon("guardar.png");
    btnGuardar = new JButton("Guardar", iconGuardar);
    ventana.add(btnGuardar, BorderLayout.SOUTH);

    // Asociar Listener con Widget
    btnGuardar.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String strMensaje = "País: " + lstPais.getSelectedValue();
        JOptionPane.showMessageDialog(ventana, strMensaje);
      }
    });

    // Mostrar contenedor
    ventana.setVisible(true);
  }

  public static void main(String[] args) {
    new ListenerTestV4();
  }
}
