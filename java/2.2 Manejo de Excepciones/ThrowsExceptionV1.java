class Cuenta {
  private float saldo;
  
  public void setSaldo(float saldo) {
    this.saldo = saldo;
  }
  public float getSaldo() {
    return saldo;
  }

  public void hacerRetiro(float retiro) {
    saldo = saldo - retiro;
  }
}

public class ThrowsExceptionV1 {
  public static void main(String[] args) {
    Cuenta miCuenta = new Cuenta();
    miCuenta.setSaldo(1000.0f); // Deposito $1,000
    System.out.println("Saldo: " + miCuenta.getSaldo());
    System.out.println("Retirando 1500...");
    miCuenta.hacerRetiro(1500.0f); //Retiro $1,500
    System.out.println("Saldo: " + miCuenta.getSaldo());
  }
}