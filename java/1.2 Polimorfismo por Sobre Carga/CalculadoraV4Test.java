class CalculadoraV4 {
  public int sumar(int a, int b) {
    return (a+b);
  }

  public Double sumar(Double a, Double b) {
    return (a+b);
  }

  public int sumar(String a, String b) {
    return (Integer.parseInt(a) + Integer.parseInt(b));
  }

  public Double sumar(String a, String b) {
    return (Double.parseDouble(a) + Double.parseDouble(b));  
  }
  //error: method sumar(String,String) is already defined 😵
}

public class CalculadoraV4Test {
  public static void main(String[] args) {
    CalculadoraV4 calculadora = new CalculadoraV4();
    System.out.println("La suma de 3 + 6 es: " +  calculadora.sumar(3,6) ); // OK 👍🏼
    System.out.println("La suma de 2.5 + 9.2 es: " +  calculadora.sumar(2.5,9.2) ); // OK 👍🏼
    System.out.println("La suma de 3 + 6 es: " +  calculadora.sumar("3","6") ); // OK 👍🏼
    System.out.println("La suma de 2.5 + 9.2 es: " +  calculadora.sumar("2.5","9.2") ); 
    // NumberFormatException: For input string: "2.5" 😵
  }
}

//Explicar que se puede sobrecargar un método con más parametros, no solo cambiando el tipo de ellos...