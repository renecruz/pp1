import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptionV3  {
  public static void main(String args[]) throws IOException, FileNotFoundException {
    FileInputStream fis = null;
    fis = new FileInputStream("myfile.txt");
    int caracter;

    while ((caracter = fis.read()) != -1) {
      System.out.print((char) caracter);
    }
    fis.close();
  }
}