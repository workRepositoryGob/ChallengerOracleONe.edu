package util;

import static model.ConvertidorMoneda.*;
import static model.ConvertidorMoneda.SOL_EURO;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import model.ConvertidorMoneda;
import model.UIHandler;

public class Util {
  public static final int ADDITIONAL_WEIGHT = 200; // Ajusta este valor según tus necesidades
  public static final String TITLE_OPTION = "Seleccione una opcion de conversión";
  public static final String TITLE_INPUT = "Input";
  public static final String TITLE_TIPO_MONEDA = "Seleccione la moneda a la que desea convertir tu dinero";
  public static final String TITLE_CANT_MONEY = "Ingrese la cantidad de dinero que desea convertir: ";
  public static final String TITLE_CANT_TEMPERATURA = "Ingrese la cantidad de temperatura que desea convertir: ";
  public static final String TITLE_MENU = "Menu";
  public static final String MONEDA = "Moneda";
  public static final String TEMPERATURA = "Temperatura";
  public static final String[] OPTIONS = {"Seleccione Opcion","Conversor de Moneda", "Conversor de Temperatura"};
  public static final Map<String,String> SIMBOLOS = new HashMap<>();
  public static Map<String, String> getSimbolos(){
    SIMBOLOS.put("Dolares", "$");
    SIMBOLOS.put("Euros", "€");
    SIMBOLOS.put("Soles", "S/");
    SIMBOLOS.put("Pesos", "$");
    SIMBOLOS.put("Libras", "£");
    SIMBOLOS.put("Yenes", "¥");
    return SIMBOLOS;
  }

  public static final boolean validarCantidad(UIHandler uiHandler, BigDecimal cantidad){
    if (cantidad==null){
      uiHandler.mostrarMensaje("Operacion cancelada");
      return true ;
    }
    if (cantidad.equals(BigDecimal.ZERO)) {
      uiHandler.mostrarError("No ingresó una cantidad válida");
      return true;
    }
    return false;
  }
  public static final boolean validarTipoMoneda(UIHandler uiHandler, ConvertidorMoneda tipoMoneda){
    if (tipoMoneda==null){
      uiHandler.mostrarMensaje("Operacion cancelada");
      return true ;
    }

    return false;
  }
}
