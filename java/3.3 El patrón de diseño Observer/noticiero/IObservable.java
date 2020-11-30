public interface IObservable {
  public void agregarObserver(IObserver IOb);
  public void removerObserver(IObserver IOb);
  public void notifica();
}
