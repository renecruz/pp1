class Cuenta {
  private float saldo;

  public void setSaldo(float saldo) {
    this.saldo = saldo;
  }

  public float getSaldo() {
    return saldo;
  }

  public void hacerRetiro(float retiro) {
    if (retiro > saldo) {
      try {
        throw new Exception("Fondos Insuficientes");
      } catch (Exception e) {
        e.printStackTrace();
      }
    } else {
      saldo = saldo - retiro;
    }
  }
}

public class ThrowsExceptionV2 {
  public static void main(String[] args) {
    Cuenta miCuenta = new Cuenta();
    miCuenta.setSaldo(1000.0f); // Deposito $1,000
    System.out.println("Saldo: " + miCuenta.getSaldo());
    System.out.println("Retirando 1500...");
    miCuenta.hacerRetiro(1500.0f); //Retiro $1,500 (Excepción)
    System.out.println("Saldo: " + miCuenta.getSaldo());
    System.out.println("Retirando 350...");
    miCuenta.hacerRetiro(350.0f); //Retiro $350
    System.out.println("Saldo: " + miCuenta.getSaldo());
  }
}