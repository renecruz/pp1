import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;

public class GUITestV4 {
  private JFrame miVentana;
  private JButton btnOK;
  private JButton btnCancelar;
  private JButton btnAyuda;

  public GUITestV4() {
    // Configurar el contenedor
    miVentana = new JFrame("GUI Test v4.0");
    miVentana.setSize(320, 160);
    miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Agregar Widgets
    btnOK = new JButton("OK");
    miVentana.add(btnOK, BorderLayout.EAST);
    btnCancelar = new JButton("Cancelar");
    miVentana.add(btnCancelar, BorderLayout.CENTER);
    btnAyuda = new JButton("Ayuda");
    miVentana.add(btnAyuda, BorderLayout.WEST);

    // Mostrar contenedor
    miVentana.setVisible(true);
  }

  public static void main(String[] args) {
    new GUITestV4();
  }
}