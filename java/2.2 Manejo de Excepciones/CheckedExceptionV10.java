import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CheckedExceptionV10 {

  private static void leerArchivo() {
    FileInputStream fis = null;
    try {      
      fis = new FileInputStream("myfile.txt");
      int caracter;

      while ((caracter = fis.read()) != -1) {
        System.out.print((char) caracter);
      }      
    } catch (FileNotFoundException e) {
      // código para cuando no se encuentra el archivo o no se puede leer
      Logger.getGlobal().log(Level.SEVERE, e.toString());
    }  catch (IOException e) {
      // código para cuando haya error de entrada/salida
      Logger.getGlobal().log(Level.SEVERE, e.toString());
    } finally {
      try {
        fis.close();
      } catch (Exception e) {
        // código para cuando haya cualquier error
        // La clase Exception no requiere import
        Logger.getGlobal().log(Level.SEVERE, e.toString());
      } 
    }
  }

  public static void main(String args[]) {
    leerArchivo();
  }
}