import java.io.FileInputStream;
import java.io.IOException;

public class CheckedExceptionV2  {
  public static void main(String args[]) throws IOException {
    FileInputStream fis = null;
    fis = new FileInputStream("myfile.txt");
    int caracter;

    while ((caracter = fis.read()) != -1) {
      System.out.print((char) caracter);
    }
    fis.close();
  }
}