package model;
import java.math.BigDecimal;
public enum ConvertidorMoneda {
  

  SOL_DOLAR("De soles a Dolares"),
  SOL_EURO("De soles a Euros"),
  SOL_YEN("De soles a Yenes"),
  SOL_LIBRA_ESTERLINA("De soles a Libras Esterlinas"),
  SOL_PESO_MEXICANO("De soles a Pesos Mexicanos"),
  SOL_PESO_COLOMBIANO("De soles a Pesos Colombianos"),
  SOL_PESO_ARGENTINO("De soles a Pesos Argentinos"),
  SOL_PESO_CHILENO("De soles a Pesos Chilenos"),
  DOLAR_SOL("De Dolar a Soles"),
  EURO_SOL("De Euro a Soles"),
  YEN_SOL("De Yen a Soles"),
  LIBRA_ESTERLINA_SOL("De Libra Esterlina a Soles");

  private final String nombre;

  private ConvertidorMoneda(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
    return nombre;
  }

  public BigDecimal getValor() {
    //valor de la moneda por tipo de moneda
    return switch (this) {

      case SOL_DOLAR -> new BigDecimal("0.2813");
      case SOL_EURO -> new BigDecimal("0.25");
      case SOL_YEN -> new BigDecimal("38.92");
      case SOL_LIBRA_ESTERLINA -> new BigDecimal("0.21");
      case SOL_PESO_MEXICANO -> new BigDecimal("4.71");
      case SOL_PESO_COLOMBIANO -> new BigDecimal("1140.72");
      case SOL_PESO_ARGENTINO -> new BigDecimal("75.13");
      case SOL_PESO_CHILENO -> new BigDecimal("228.81");
      case DOLAR_SOL -> new BigDecimal("3.56");
      case EURO_SOL -> new BigDecimal("4.0");
      case YEN_SOL -> new BigDecimal("0.026");
      case LIBRA_ESTERLINA_SOL -> new BigDecimal("4.66");

    };
  }

  public String[] getNombres() {
    return new String[] {
        SOL_DOLAR.getNombre(),
        SOL_EURO.getNombre(),
        SOL_YEN.getNombre(),
        SOL_LIBRA_ESTERLINA.getNombre(),
        SOL_PESO_MEXICANO.getNombre(),
        SOL_PESO_COLOMBIANO.getNombre(),
        SOL_PESO_ARGENTINO.getNombre(),
        SOL_PESO_CHILENO.getNombre(),
        DOLAR_SOL.getNombre(),
        EURO_SOL.getNombre(),
        YEN_SOL.getNombre(),
        LIBRA_ESTERLINA_SOL.getNombre()
    };
  }
}
