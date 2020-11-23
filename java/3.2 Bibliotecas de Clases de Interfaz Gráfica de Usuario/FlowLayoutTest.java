import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JButton;

public class FlowLayoutTest {
  
  public FlowLayoutTest() {
    JFrame miVentana = new JFrame("FlowLayout Test");
    miVentana.setSize(320,160);
    miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    miVentana.setLayout(new FlowLayout());

    //Agregar los componentes gráficos o widgets que se necesiten
    JButton btn01 = new JButton("Botón 1");
    miVentana.add(btn01);
    JButton btn02 = new JButton("Botón 2");
    miVentana.add(btn02);
    JButton btn03 = new JButton("Botón 3");
    miVentana.add(btn03);
    JButton btn04 = new JButton("Botón 4");
    miVentana.add(btn04);
    JButton btn05 = new JButton("Botón 5");
    miVentana.add(btn05);
    JButton btn06 = new JButton("Botón 6");
    miVentana.add(btn06);

    miVentana.setVisible(true);
  }

  public static void main(String[] args) {
    new FlowLayoutTest();    
  }
}