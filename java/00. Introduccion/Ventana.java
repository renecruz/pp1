import java.awt.*;
import javax.swing.*;

class Ventana {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Menú Principal");
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(400, 200));
		frame.pack();
		frame.setVisible(true);
	}
}