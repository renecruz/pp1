import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;

public class GUITestV5 {
  private JFrame miVentana;
  private JButton btnOK;
  private JButton btnCancelar;
  private JButton btnAyuda;

  public GUITestV5() {
    // Configurar el contenedor
    miVentana = new JFrame("GUI Test v5.0");
    miVentana.setSize(320, 160);
    miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    miVentana.setLayout(new FlowLayout());

    //Agregar Widgets
    btnOK = new JButton("OK");
    miVentana.add(btnOK);
    btnCancelar = new JButton("Cancelar");
    miVentana.add(btnCancelar);
    btnAyuda = new JButton("Ayuda");
    miVentana.add(btnAyuda);

    // Mostrar contenedor
    miVentana.setVisible(true);
  }

  public static void main(String[] args) {
    new GUITestV5();
  }
}