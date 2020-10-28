import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptionV6  {

  private static void leerArchivo() throws IOException, FileNotFoundException{
    FileInputStream fis = null;
    fis = new FileInputStream("myfile.txt");
    int caracter;

    while ((caracter = fis.read()) != -1) {
      System.out.print((char) caracter);
    }
    fis.close();
  } 
  public static void main(String args[]) {
    try {
      leerArchivo();
    } catch (FileNotFoundException e) {
      // código para cuando no se encuentra el archivo o no se puede leer
    }  catch (IOException e) {
      // código para cuando haya error de entrada/salida
    } 
  }
}