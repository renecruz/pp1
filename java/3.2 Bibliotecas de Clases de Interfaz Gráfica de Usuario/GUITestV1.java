import javax.swing.JFrame;

public class GUITestV1 {
  private JFrame miVentana;
  
  public GUITestV1() {
    //Configurar el contenedor
    miVentana = new JFrame("GUI Test v1.0");
    miVentana.setSize(320,160);
    miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    //Mostrar contenedor
    miVentana.setVisible(true);
  }

  public static void main(String[] args) {
    new GUITestV1();
  }
}