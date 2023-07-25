package model;

import exception.MyException;
import java.math.BigDecimal;
import javax.swing.JComboBox;
import util.Util;

public class OptionHandlerImpl implements OptionHandler {

  private UIHandler uiHandler;
  private ConversionHandler conversionHandler;

  public OptionHandlerImpl(UIHandler uiHandler, ConversionHandler conversionHandler) {
    this.uiHandler = uiHandler;
    this.conversionHandler = conversionHandler;
  }

  @Override
  public void executeOption() throws MyException {
    JComboBox<String> menuOptions = uiHandler.getMenuOptions();
    if (menuOptions == null) {
      uiHandler.mostrarMensaje("Operacion cancelada");
      return;
    }
    int selectedOption = menuOptions.getSelectedIndex();

    switch (selectedOption) {
      case 1 -> {
        BigDecimal monto = uiHandler.getCantidadDeDinero();
        boolean validacionMOnto=Util.validarCantidad(uiHandler,monto);
        if (!validacionMOnto){
          ConvertidorMoneda tipoMoneda = uiHandler.getTipoMoneda();
          boolean validarTipoMoneda=Util.validarTipoMoneda(uiHandler,tipoMoneda);
          if (!validarTipoMoneda){
            BigDecimal total = conversionHandler.convertirMoneda(monto, tipoMoneda);
            String tipoMonedaString = tipoMoneda.getNombre().split(" ")[3];
            uiHandler.mostrarResultado(total, Util.getSimbolos().get(tipoMonedaString),tipoMonedaString);
          }
        }
      }
      case 2 -> {
        BigDecimal cantidad = uiHandler.getCantidadDeTemperatura();
        if (cantidad != null) {
          ConvertidorTemperatura tipoTemperatura = uiHandler.getTipoTemperatura();
          BigDecimal total = conversionHandler.convertirTemperatura(cantidad, tipoTemperatura);
          uiHandler.mostrarResultado(total, "", tipoTemperatura.getNombre().split(" ")[3]);
        } else {
          uiHandler.mostrarError("No ingresó una cantidad válida");
        }

      }
      default -> uiHandler.mostrarError("Opción no válida");

    }
  }
}
