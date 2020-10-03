public class NominaTest {
  public static void main(String[] args) {
    Vendedor vendedor = new Vendedor("Julio Mancera Castro", 32, 1.73f, "Electrónica");                
    System.out.println(vendedor);

    Gerente gerente = new Gerente("Maribel Estrada Contreras", 34, 1.70f, "Chalco");       
    System.out.println(gerente);
  }
}
