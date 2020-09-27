class CalculadoraV1 {
  public int sumar(int a, int b) {
    return (a+b);
  }
}

public class CalculadoraV1Test{
  public static void main(String[] args) {
    CalculadoraV1 calculadora = new CalculadoraV1();
    System.out.println("La suma de 3 + 6 es: " +  calculadora.sumar(3,6) ); // OK 👍🏼
    System.out.println("La suma de 2.5 + 9.2 es: " +  calculadora.sumar(2.5,9.2) ); //Error 😧
  }
} 

//Explicar que pasa si queremos mandar valores decimales