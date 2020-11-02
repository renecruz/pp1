class ClaseA {
  public int leerValor() {
    return 10;
  }
}

class ClaseB {
  public int leerValor() {
    return 20;
  }
}

class ClaseC extends ClaseA {
  // código de la clase
}
public class HerenciaSimple {
  public static void main(String[] args) {
    ClaseC objeto = new ClaseC();
    System.out.println(objeto.leerValor());
    // compila y ejecuta sin problemas 😏.
  }
}