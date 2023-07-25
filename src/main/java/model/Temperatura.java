package model;

import exception.MyException;
import java.math.BigDecimal;

public class Temperatura {

  BigDecimal cantidad;
  public Temperatura(BigDecimal cantidad) {
    this.cantidad = cantidad;
  }

  public BigDecimal getCantidad() {
    return cantidad;
  }

  public BigDecimal convertir(ConvertidorTemperatura convertidorTemperatura) throws MyException {
    if (cantidad == null || cantidad.compareTo(BigDecimal.ZERO) == 0 ) {
      throw new MyException("El monto no puede ser nulo o cero");
    }
    return cantidad.multiply(convertidorTemperatura.getValor());
  }
}
