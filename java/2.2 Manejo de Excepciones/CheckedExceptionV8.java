import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CheckedExceptionV8 {

  private static void leerArchivo() {
    try {
      FileInputStream fis = null;
      fis = new FileInputStream("myfile.txt");
      int caracter;

      while ((caracter = fis.read()) != -1) {
        System.out.print((char) caracter);
      }
      fis.close();
    } catch (FileNotFoundException e) {
      // código para cuando no se encuentra el archivo o no se puede leer
      Logger.getGlobal().log(Level.SEVERE, e.toString());
    }  catch (IOException e) {
      // código para cuando haya error de entrada/salida
      Logger.getGlobal().log(Level.SEVERE, e.toString());
    }
  }

  public static void main(String args[]) {
    leerArchivo();
  }
}