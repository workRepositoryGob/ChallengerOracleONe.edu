package model.Prueba;

import static javax.swing.BorderFactory.createTitledBorder;
import static javax.swing.JOptionPane.*;

import static util.Util.TITLE_MENU;

import exception.MyException;
import java.awt.Dimension;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import model.ConversionHandler;
import model.ConversionHandlerImpl;
import model.FacadePrueba;
import model.OptionHandler;
import model.OptionHandlerImpl;
import model.UIHandler;
import model.UIHandlerImpl;


public class Prueba01 {

  public static void main(String[] args) {

      UIHandler uiHandler = new UIHandlerImpl();
      ConversionHandler conversionHandler = new ConversionHandlerImpl();
      OptionHandler optionHandler = new OptionHandlerImpl(uiHandler, conversionHandler);

      FacadePrueba facade = new FacadePrueba(uiHandler, optionHandler);
      boolean rpta = true;

      while (rpta) {
        try {
          facade.executeSelectedOption();
        } catch (MyException e) {
          uiHandler.mostrarError("Error al procesar la opcion seleccionada");
          e.printStackTrace();
        }
        rpta = showConfirmDialog(null, "Desea continuar?", "Continuar", YES_NO_OPTION,
            QUESTION_MESSAGE, null) == 0;
      }
      }

  public static void dimensionarComboBox(JComboBox<String> comboBox, int additionalWidth) {
    Dimension prefSize = comboBox.getPreferredSize();
    prefSize.width += additionalWidth;
    comboBox.setPreferredSize(prefSize);
  }

  public static <T> JComboBox<T> crearComboBox(T[] options, String titledBorder) {
    JComboBox<T> comboBox = new JComboBox<>(options);
    comboBox.setBorder(createTitledBorder(titledBorder));
    return comboBox;
  }
}
