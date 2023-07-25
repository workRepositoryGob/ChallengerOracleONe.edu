package model;

import java.math.BigDecimal;
import javax.swing.JComboBox;

public interface UIHandler {
  JComboBox<String> getMenuOptions( );
  BigDecimal getCantidadDeDinero();
  ConvertidorMoneda getTipoMoneda();
  ConvertidorTemperatura getTipoTemperatura();
  void mostrarResultado(BigDecimal resultado,String simbolo,String tipoMoneda);
  void mostrarError(String mensaje);
  void mostrarMensaje(String mensaje);

  BigDecimal getCantidadDeTemperatura();
}
