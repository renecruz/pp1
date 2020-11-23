import javax.swing.JButton;
import javax.swing.JFrame;

public class GUITestV3 {
  private JFrame miVentana;
  private JButton btnOK;
  private JButton btnCancelar;
  private JButton btnAyuda;

  public GUITestV3() {
    //Configurar el contenedor
    miVentana = new JFrame("GUI Test v3.0");
    miVentana.setSize(320, 160);
    miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    //Agregar Widgets
    btnOK = new JButton("OK");
    miVentana.add(btnOK);
    btnCancelar = new JButton("Cancelar");
    miVentana.add(btnCancelar);
    btnAyuda = new JButton("Ayuda");
    miVentana.add(btnAyuda);

    //Mostrar contenedor
    miVentana.setVisible(true);
  }

  public static void main(String[] args) {
    new GUITestV3();    
  }
}