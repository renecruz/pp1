public class NoticieroTest {
  public NoticieroTest() {
    Noticiero noticiero = new Noticiero();
    Suscriptor suscriptor1 = new Suscriptor(noticiero, "Monica");
    Suscriptor suscriptor2 = new Suscriptor(noticiero, "Karla");
    Suscriptor suscriptor3 = new Suscriptor(noticiero, "Raúl");
    noticiero.agregarObserver(suscriptor1);
    noticiero.agregarObserver(suscriptor2);
    noticiero.agregarObserver(suscriptor3);

    //********* flujo de prueba *********
    //Actualiza nuevo noticia (estado)
    noticiero.setEstado("Científicos descrubren agua en la luna");
    noticiero.notifica();

    //Actualiza nuevo noticia (estado)
    noticiero.setEstado("Precio del petróleo a la baja");
    noticiero.notifica();

    //Remueve al suscriptor: Karla
    noticiero.removerObserver(suscriptor2);

    //Actualiza nuevo noticia (estado)
    noticiero.setEstado("¡Prepárate para las proximas vacaciones!");
    noticiero.notifica();
  }
  
  public static void main(String[] args) {
    new NoticieroTest();
  }
}
