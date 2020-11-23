import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JButton;

public class BorderLayoutTest {
  
  public BorderLayoutTest() {
    JFrame miVentana = new JFrame("BorderLayout Test");
    miVentana.setSize(320,160);
    miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    //Agregar los componentes gráficos o widgets que se necesiten
    JButton btnNorte = new JButton("Norte");
    miVentana.add(btnNorte, BorderLayout.NORTH);
    JButton btnSur = new JButton("Sur");
    miVentana.add(btnSur, BorderLayout.SOUTH);
    JButton btnEste = new JButton("Este");
    miVentana.add(btnEste, BorderLayout.EAST);
    JButton btnCentro = new JButton("Centro");
    miVentana.add(btnCentro, BorderLayout.CENTER);
    JButton btnOeste = new JButton("Oeste");
    miVentana.add(btnOeste, BorderLayout.WEST);

    miVentana.setVisible(true);
  }

  public static void main(String[] args) {
    new BorderLayoutTest();    
  }
}