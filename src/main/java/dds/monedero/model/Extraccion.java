package dds.monedero.model;

import java.time.LocalDate;

public class Extraccion extends Movimiento {

  public Extraccion(LocalDate fecha, double monto) {
    super(fecha, monto);
  }

  @Override
  public boolean fueDepositado(LocalDate fecha) {
    return false;
  }

  @Override
  public double calcularValor(Cuenta cuenta) {
    return cuenta.getSaldo() - getMonto();
  }

  @Override
  public boolean esDeposito(){
    return false;
  }

  @Override
  public boolean fueExtraido(LocalDate fecha) {
    return esDeLaFecha(fecha);
  }

}
