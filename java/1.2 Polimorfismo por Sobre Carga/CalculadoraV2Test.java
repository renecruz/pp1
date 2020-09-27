class CalculadoraV2 {
  public int sumar(int a, int b) {
    return (a+b);
  }

  public double sumar(double a, double b) {
    return (a+b);
  }
}
public class CalculadoraV2Test {
  public static void main(String[] args) {
    CalculadoraV2 calculadora = new CalculadoraV2();
    System.out.println("La suma de 3 + 6 es: " +  calculadora.sumar(3,6) ); // OK 👍🏼
    System.out.println("La suma de 2.5 + 9.2 es: " +  calculadora.sumar(2.5,9.2) ); // OK 👍🏼
    System.out.println("La suma de 3 + 6 es: " +  calculadora.sumar("3","6") ); //Error 😧
  }
}

//Explicar que pasa si mandamos valores enteros como cadena