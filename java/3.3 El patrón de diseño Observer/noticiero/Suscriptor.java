public class Suscriptor implements IObserver{
  private Noticiero noticiero;
  private String nombreSuscriptor;

  public Suscriptor(Noticiero noticiero, String nombreSuscriptor) {
    this.noticiero = noticiero;
    this.nombreSuscriptor = nombreSuscriptor;
  }

  public void actualizar() {
    System.out.println( "Hey " + nombreSuscriptor +    
                        ", nueva noticia: " + noticiero.getEstado());
  }
}
