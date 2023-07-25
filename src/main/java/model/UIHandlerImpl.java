package model;

import static model.Prueba.Prueba01.crearComboBox;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.OK_CANCEL_OPTION;
import static javax.swing.JOptionPane.PLAIN_MESSAGE;
import static javax.swing.JOptionPane.QUESTION_MESSAGE;
import static javax.swing.JOptionPane.showConfirmDialog;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static util.Util.MONEDA;
import static util.Util.OPTIONS;
import static util.Util.TEMPERATURA;
import static util.Util.TITLE_CANT_MONEY;
import static util.Util.TITLE_CANT_TEMPERATURA;
import static util.Util.TITLE_INPUT;
import static util.Util.TITLE_MENU;
import static util.Util.TITLE_OPTION;
import static util.Util.TITLE_TIPO_MONEDA;

import java.math.BigDecimal;
import javax.swing.JComboBox;


/*clase estatica*/


public class UIHandlerImpl implements UIHandler {

  public JComboBox<String> getMenuOptions() {
    JComboBox<String> comboBox = crearComboBox(OPTIONS, TITLE_OPTION);
    int result=  showConfirmDialog(null, comboBox, TITLE_MENU, OK_CANCEL_OPTION, PLAIN_MESSAGE, null);
    if (result == OK_CANCEL_OPTION){
      return null;
    }
    return comboBox;
  }
  public BigDecimal getCantidadDeDinero() {
    String monto = showInputDialog(null, TITLE_CANT_MONEY, TITLE_INPUT, QUESTION_MESSAGE);
    if (monto==null){
      return null;
    }
    if (!monto.equals("") && monto.matches("[0-9]+\\.[0-9]+")||monto.matches("[0-9]+")) {
      return new BigDecimal(monto);
    }

    return new BigDecimal("0");
  }
  public ConvertidorMoneda getTipoMoneda() {
    JComboBox<ConvertidorMoneda> comboBox = crearComboBox(ConvertidorMoneda.values(), TITLE_TIPO_MONEDA);
   int result= showConfirmDialog(null, comboBox, MONEDA, OK_CANCEL_OPTION, PLAIN_MESSAGE,null);
    if (result == OK_CANCEL_OPTION){
      return null;
    }

   return (ConvertidorMoneda) comboBox.getSelectedItem();
  }


  public ConvertidorTemperatura getTipoTemperatura() {
    JComboBox<ConvertidorTemperatura> comboBox = crearComboBox(ConvertidorTemperatura.values(), TITLE_TIPO_MONEDA);
    showConfirmDialog(null, comboBox, TEMPERATURA, OK_CANCEL_OPTION, PLAIN_MESSAGE,null);
    return (ConvertidorTemperatura) comboBox.getSelectedItem();

  }

  public void mostrarResultado(BigDecimal resultado,String simbolo,String tipoMoneda) {
    showMessageDialog(null, "El total es: "+simbolo+" " + resultado+" "+tipoMoneda, "Resultado", INFORMATION_MESSAGE);
  }

  public void mostrarError(String mensaje) {
    showMessageDialog(null, mensaje, "Error", ERROR_MESSAGE);
  }

  public void mostrarMensaje(String mensaje) {
    showMessageDialog(null, mensaje);
  }

  public BigDecimal getCantidadDeTemperatura() {
    String cantidad = showInputDialog(null, TITLE_CANT_TEMPERATURA, TITLE_INPUT, QUESTION_MESSAGE);
    if (cantidad != null && !cantidad.equals("")) {
      return new BigDecimal(cantidad);
    }


    return null;
  }


}
