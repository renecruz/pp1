
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class Principal {

  JDesktopPane escritorio;
  JFrame ventana;
  NuevaVentaFrame nuevaVentaFrame;

  public Principal() {
    //Configurar contenedor
    ventana = new JFrame("Punto de Venta v1.0");
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setSize(800, 600);

    //Se agrega el manejador de ventanas internas
    escritorio = new JDesktopPane();
    ventana.add(escritorio);

    JMenuBar menuPrincipal = new JMenuBar();
    JMenu menuVentas = new JMenu("Ventas");
    JMenuItem mniNueva = new JMenuItem("Nueva");
    mniNueva.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent arg0) {
        if (nuevaVentaFrame == null || nuevaVentaFrame.isClosed()) {
          nuevaVentaFrame = new NuevaVentaFrame();
          escritorio.add(nuevaVentaFrame);
          nuevaVentaFrame.setVisible(true);
          nuevaVentaFrame.isSelected();
        } else {
          nuevaVentaFrame.isSelected();
        }
      }
    });
    menuVentas.add(mniNueva);
    menuVentas.add(new JMenuItem("Buscar"));
    menuVentas.add(new JMenuItem("Imprimir"));
    menuVentas.addSeparator();
    JMenuItem mniSalir = new JMenuItem("Salir");
    mniSalir.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        Object[] opciones = {"Si", "No"};
        int respuesta = JOptionPane.showOptionDialog(ventana,
            "¿Seguro que quiere salir?",
            "Pregunta",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            opciones,
            opciones[1]);

        // 0 = YES, 1 = NO y Cerrar Diálogo
        if (respuesta == 0) {
          System.exit(0);
        }
      }
    });
    menuVentas.add(mniSalir);

    JMenu menuAyuda = new JMenu("Ayuda");
    JMenuItem mniAcercaDe = new JMenuItem("Acerca de");
    menuAyuda.add(mniAcercaDe);
    mniAcercaDe.addActionListener(new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(ventana, 
                                      "Ejemplo desarrollado por René Cruz @Copyleft 2020", 
                                      "Punto de Venta v1.0", 
                                      JOptionPane.INFORMATION_MESSAGE);
      }
    });
    menuPrincipal.add(menuVentas);
    menuPrincipal.add(menuAyuda);
    ventana.setJMenuBar(menuPrincipal);

    ventana.setVisible(true);
  }

  public static void main(String[] args) {
    new Principal();
  }
}
