public class CorredorDeBolsa implements IObserver{
  private BolsaDeValores bolsaDeValores;
  private String nombreCorredorDeBolsa;

  public CorredorDeBolsa(BolsaDeValores bolsaDeValores, String nombreCorredorDeBolsa) {
    this.bolsaDeValores = bolsaDeValores;
    this.nombreCorredorDeBolsa = nombreCorredorDeBolsa;
  }

  public void actualizar() {
    System.out.println( nombreCorredorDeBolsa +    
                        ", movimiento: " + bolsaDeValores.getEstado());
  }
}
