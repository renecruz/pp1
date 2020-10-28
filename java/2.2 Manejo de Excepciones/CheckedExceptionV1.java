import java.io.FileInputStream;

public class CheckedExceptionV1  {
  public static void main(String args[])  {
    FileInputStream fis = null;
    fis = new FileInputStream("myfile.txt");
    int caracter;

    while ((caracter = fis.read()) != -1) {
      System.out.print((char) caracter);
    }
    fis.close();
  }
}