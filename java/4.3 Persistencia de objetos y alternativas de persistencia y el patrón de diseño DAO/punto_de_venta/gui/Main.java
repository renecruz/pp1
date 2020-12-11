package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class Main {
  // Constantes para los iconos en toda la aplicación
  public static final Icon ICON_AGREGAR = new ImageIcon("icons/add.png");
  public static final Icon ICON_BORRAR = new ImageIcon("icons/delete.png");
  public static final Icon ICON_CONSULTAR = new ImageIcon("icons/search.png");
  public static final Icon ICON_MODIFICAR = new ImageIcon("icons/edit.png");
  public static final Icon ICON_GUARDAR = new ImageIcon("icons/save.png");
  public static final Icon ICON_SALIR = new ImageIcon("icons/exit.png");
  public static final Icon ICON_AYUDA = new ImageIcon("icons/help.png");
  public static final Icon ICON_ERROR = new ImageIcon("icons/error.png");
  public static final Icon ICON_PREGUNTA = new ImageIcon("icons/question.png");
  public static final Icon ICON_ESCRITORIO = new ImageIcon("icons/desktop.png");

  private AgregarVentaFrm agregarVentaFrm;

  public Main() {
    //Configurar contenedor principal
    JFrame ventana = new JFrame("Punto de Venta v1.0");
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setSize(800,600);
    
    //Se crea un DesktopPane
    JDesktopPane escritorio = new JDesktopPane();
    ventana.add(escritorio);

    //Crear el menu principal
    JMenuBar menuPrincipal = new JMenuBar();
    JMenu menuVentas = new JMenu("Ventas");
    JMenuItem mniAgregar = new JMenuItem("Agregar", ICON_AGREGAR);
    mniAgregar.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent arg0) {
        if (agregarVentaFrm == null || agregarVentaFrm.isClosed()) {
          agregarVentaFrm = new AgregarVentaFrm();
          escritorio.add(agregarVentaFrm);
          //agregarVentaFrm.setVisible(true);
          agregarVentaFrm.isSelected();
        } else {
          agregarVentaFrm.isSelected();
        } 
      }
    });
    
    //Menu de ventas
    JMenuItem mniBorrar = new JMenuItem("Borrar", ICON_BORRAR);
    JMenuItem mniConsultar = new JMenuItem("Consultar", ICON_CONSULTAR);
    JMenuItem mniModificar = new JMenuItem("Modificar", ICON_MODIFICAR);
    JMenuItem mniSalir = new JMenuItem("Salir", ICON_SALIR);
    mniSalir.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        Object[] opciones = {"Si", "No"};
        int respuesta = JOptionPane.showOptionDialog(ventana,
            "¿Seguro que quiere salir?",
            "Pregunta",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            ICON_PREGUNTA,
            opciones,
            opciones[1]);

        // 0 = YES, 1 = NO y Cerrar Diálogo
        if (respuesta == 0) {
          System.exit(0);
        }
      }
    });
    
    menuVentas.add(mniAgregar);
    menuVentas.add(mniBorrar);
    menuVentas.add(mniConsultar);
    menuVentas.add(mniModificar);
    menuVentas.addSeparator();
    menuVentas.add(mniSalir);
    menuPrincipal.add(menuVentas);    

    //Menu de ayuda
    JMenu menuAyuda = new JMenu("Ayuda");
    JMenuItem mniAcercaDe = new JMenuItem("Acerca de", ICON_AYUDA);
    menuAyuda.add(mniAcercaDe);
    mniAcercaDe.addActionListener(new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(ventana, 
                                      "Sistema desarrollado por René Cruz Flores (c) Copyleft 2020", 
                                      "Aviso", 
                                      JOptionPane.INFORMATION_MESSAGE, 
                                      ICON_ESCRITORIO);
      }
    });    
    menuPrincipal.add(menuAyuda);

    

    //Agregar el menu principal al contenedor
    ventana.setJMenuBar(menuPrincipal);

    //Mostrar el contenedor
    ventana.setVisible(true);
  }
  //Ejecutar: javac -cp lib/sqlite-jdbc-3.32.jar:. gui/Main.java
  public static void main(String[] args) {
    new Main();
  }
}