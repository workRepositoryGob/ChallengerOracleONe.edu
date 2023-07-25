package model;

import exception.MyException;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Moneda {

  private BigDecimal monto;

  public Moneda(BigDecimal monto) {
    this.monto = monto;
  }
  public BigDecimal getMonto() {
    return monto;
  }
  public void setMonto(BigDecimal monto) {
    this.monto = monto;
  }

  public BigDecimal convertir(ConvertidorMoneda convertidorMoneda) throws MyException {

    if (monto == null || monto.compareTo(BigDecimal.ZERO) == 0 ) {
      throw new MyException("El monto no puede ser nulo o cero");
    }
    if(monto.compareTo(BigDecimal.ZERO) < 0){
      throw new MyException("El monto no puede ser negativo");
    }
    return monto.multiply(convertidorMoneda.getValor()).setScale(2, RoundingMode.HALF_UP);

  }



}
