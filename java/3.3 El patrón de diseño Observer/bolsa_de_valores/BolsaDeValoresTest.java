public class BolsaDeValoresTest {

  public BolsaDeValoresTest() {
    BolsaDeValores bolsaDeValores = new BolsaDeValores();
    CorredorDeBolsa corredorDeBolsa1 = new CorredorDeBolsa(bolsaDeValores, "(Fernanda - BBVA)");
    CorredorDeBolsa corredorDeBolsa2 = new CorredorDeBolsa(bolsaDeValores, "(Jhon F. - Wall Street)");
    CorredorDeBolsa corredorDeBolsa3 = new CorredorDeBolsa(bolsaDeValores, "(Sofia - Santander)");
    bolsaDeValores.agregarObserver(corredorDeBolsa1);
    bolsaDeValores.agregarObserver(corredorDeBolsa2);
    bolsaDeValores.agregarObserver(corredorDeBolsa3);

    //********* flujo de prueba *********
    //Actualiza nuevo movimiento (estado)
    bolsaDeValores.setEstado("Dolar Americano (USD) abre a la baja, Venta: $21.00, Compra $19.11");
    bolsaDeValores.notifica();

    //Actualiza nuevo movimiento (estado)
    bolsaDeValores.setEstado("Down Jones, Apertura: 29,746.11, Vol. 96.54M");
    bolsaDeValores.notifica();

    //Agregar nuevo corredor de bolsa (Mario - Banamex)
    CorredorDeBolsa corredorDeBolsa4 = new CorredorDeBolsa(bolsaDeValores, "(Mario - BANAMEX)");
    bolsaDeValores.agregarObserver(corredorDeBolsa4);

    //Actualiza nuevo movimiento (estado)
    bolsaDeValores.setEstado("NASDAQ, Apertura: 11,916.80, Vol. 1860M");
    bolsaDeValores.notifica();
  }
  
  public static void main(String[] args) {
    new BolsaDeValoresTest();
  }
}
