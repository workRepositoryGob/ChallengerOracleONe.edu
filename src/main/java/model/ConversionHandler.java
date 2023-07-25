package model;

import exception.MyException;
import java.math.BigDecimal;

public interface ConversionHandler {
  BigDecimal convertirMoneda(BigDecimal monto, ConvertidorMoneda tipoMoneda) throws MyException;
  BigDecimal convertirTemperatura(BigDecimal cantidad, ConvertidorTemperatura tipoTemperatura) throws MyException;
}
