package model;

import exception.MyException;
import javax.swing.JComboBox;

public class FacadePrueba {
  private UIHandler uiHandler;
  private OptionHandler optionHandler;

  public FacadePrueba(UIHandler uiHandler, OptionHandler optionHandler) {
    this.uiHandler = uiHandler;
    this.optionHandler = optionHandler;
  }

  public JComboBox<String> getMenuOptions() {
    return uiHandler.getMenuOptions();
  }

  public void executeSelectedOption() throws MyException {
    optionHandler.executeOption();
  }
}
