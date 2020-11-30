import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;

public class JPanelTest {
  
  public JPanelTest() {
    JFrame miVentana = new JFrame("BorderLayout Test");
    miVentana.setSize(320,160);
    miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    //Agregar los componentes gráficos o widgets que se necesiten
    JPanel panelNorte = new JPanel();
    panelNorte.setBackground(Color.BLUE);
    panelNorte.add(new JLabel("NORTE"));
    miVentana.add(panelNorte, BorderLayout.NORTH);

    JPanel panelSur = new JPanel();
    panelSur.setBackground(Color.RED);
    panelSur.add(new JLabel("SUR"));
    miVentana.add(panelSur, BorderLayout.SOUTH);

    JPanel panelEste = new JPanel();
    panelEste.setBackground(Color.YELLOW);
    panelEste.add(new JLabel("ESTE"));
    miVentana.add(panelEste, BorderLayout.EAST);

    JPanel panelOeste = new JPanel();
    panelOeste.setBackground(Color.CYAN);
    panelOeste.add(new JLabel("OESTE"));
    miVentana.add(panelOeste, BorderLayout.WEST);

    JPanel panelCentro = new JPanel();
    panelCentro.setBackground(Color.MAGENTA);
    panelCentro.add(new JLabel("CENTRO"));
    miVentana.add(panelCentro, BorderLayout.CENTER);
    miVentana.setVisible(true);
  }

  public static void main(String[] args) {
    new JPanelTest();    
  }
}