import java.util.Scanner;

public class UncheckedException {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);  //InputStream
    System.out.print("Introduce un número: ");
    int numero = in.nextInt();
    System.out.println("El cuadrado de: " + numero + 
                       " = " + (numero * numero));
    in.close();
  }
}