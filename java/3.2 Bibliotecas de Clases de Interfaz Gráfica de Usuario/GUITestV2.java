import javax.swing.JButton;
import javax.swing.JFrame;

public class GUITestV2 {
  private JFrame miVentana;
  private JButton btnOK;

  public GUITestV2() {
    //Configurar el contenedor
    miVentana = new JFrame("GUI Test v2.0");
    miVentana.setSize(320,160);
    miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    //Agregar Widgets
    btnOK = new JButton("OK");
    miVentana.add(btnOK);
    
    //Mostrar contenedor
    miVentana.setVisible(true);
  }

  public static void main(String[] args) {
    new GUITestV2();    
  }
}