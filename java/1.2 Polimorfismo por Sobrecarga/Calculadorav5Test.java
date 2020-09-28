class CalculadoraV5 {
	public int sumar(int a, int b) {
		return (a+b);
	}

	public Double sumar(Double a, Double b) {
		return (a+b);
	}

	public int sumar(String a, String b) {
		return (Integer.parseInt(a) + Integer.parseInt(b));
	}

	public double sumar(String a, String b, char tipo) {
		if (tipo == 'i') {
			return (double) (Integer.parseInt(a) + Integer.parseInt(b));
		} else if (tipo == 'd'){
			return (Double.parseDouble(a) + Double.parseDouble(b));
		} else {
			return 0.0;
		}
	}
}

public class CalculadoraV5Test {
	public static void main(String[] args) {
		CalculadoraV5 calculadora = new CalculadoraV5();
		System.out.println("La suma de 3 + 6 es: " +  calculadora.sumar(3,6) ); // OK 👍🏼
		System.out.println("La suma de 2.5 + 9.2 es: " +  calculadora.sumar(2.5,9.2) ); // OK 👍🏼
		System.out.println("La suma de 3 + 6 es: " +  calculadora.sumar("3","6") ); // OK 👍🏼
		System.out.println("La suma de 2.5 + 9.2 es: " +  calculadora.sumar("2.5","9.2", 'd') ); // OK 👍🏼
	}
}

//Explicar que se puede sobrecargar un método con más parametros, no solo cambiando el tipo de ellos...