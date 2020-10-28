public class ExceptionDemo {
  public static void main (String[] args) {
      System.out.println(divideArray(args));
  }

  private static int divideArray(String[] array) {
      String s1 = array[0];
      String s2 = array[1];
      return divideStrings(s1, s2);
  }

  private static int divideStrings(String s1, String s2) {
      int i1 = Integer.parseInt(s1);
      int i2 = Integer.parseInt(s2);
      return divideInts(i1, i2);
  }

  private static int divideInts(int i1, int i2) {
      return i1 / i2;
  }
}

/* Ejecutar por separado y ver los resultados: 
    java ExceptionDemo 100 20
    java ExceptionDemo 100 0
    java ExceptionDemo 100 cuatro
    java ExceptionDemo 100
*/
