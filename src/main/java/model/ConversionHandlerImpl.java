package model;

import exception.MyException;
import java.math.BigDecimal;

public class ConversionHandlerImpl implements ConversionHandler{

  @Override
  public BigDecimal convertirMoneda(BigDecimal monto, ConvertidorMoneda tipoMoneda) throws MyException {
    Moneda moneda = new Moneda(monto);
    return moneda.convertir(tipoMoneda);
  }

  @Override
  public BigDecimal convertirTemperatura(BigDecimal cantidad, ConvertidorTemperatura tipoTemperatura) throws MyException {
    Temperatura temperatura = new Temperatura(cantidad);
    return temperatura.convertir(tipoTemperatura);
  }
}
