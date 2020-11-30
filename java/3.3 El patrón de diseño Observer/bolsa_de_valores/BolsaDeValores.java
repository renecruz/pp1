import java.util.ArrayList;
import java.util.List;

public class BolsaDeValores implements IObservable{
  private List<IObserver> observers = new ArrayList<>();
  private String nuevoEstado;

  public void agregarObserver(IObserver IOb){
    observers.add(IOb);
  }

  public void removerObserver(IObserver IOb){
    observers.remove(IOb);
  }

  public void notifica(){
    for (IObserver iObserver : observers) {
      iObserver.actualizar();
    }
  }

  public String getEstado() {
    return nuevoEstado;
  }

  public void setEstado(String nuevoEstado) {
    this.nuevoEstado = nuevoEstado;
  }
}