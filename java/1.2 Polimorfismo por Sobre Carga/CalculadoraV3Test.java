class CalculadoraV3 {
  public int sumar(int a, int b) {
    return (a+b);
  }

  public double sumar(double a, double b) {
    return (a+b);
  }

  public int sumar(String a, String b) {
    return (Integer.parseInt(a) + Integer.parseInt(b));
  }
}

public class CalculadoraV3Test {
  public static void main(String[] args) {
    CalculadoraV3 calculadora = new CalculadoraV3();
    System.out.println("La suma de 3 + 6 es: " +  calculadora.sumar(3,6) ); // OK 👍🏼
    System.out.println("La suma de 2.5 + 9.2 es: " +  calculadora.sumar(2.5,9.2) ); // OK 👍🏼
    System.out.println("La suma de 3 + 6 es: " +  calculadora.sumar("3","6") ); // OK 👍🏼
    System.out.println("La suma de 2.5 + 9.2 es: " +  calculadora.sumar("2.5","9.2") ); //NumberFormatException 😵
  }
}

//Explicar que pasa si mandamos decimales como cadena, no hay error de compilación, pero si de ejecución...

// https://bit.ly/2ZYHwpx Intro
// https://bit.ly/301huBO 1.1 Encapsulamiento