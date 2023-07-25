package model;

import java.math.BigDecimal;

public enum ConvertidorTemperatura {

    CELSIUS_FAHRENHEIT("De Celsius a Fahrenheit"),
    CELSIUS_KELVIN("De Celsius a Kelvin"),
    FAHRENHEIT_CELSIUS("De Fahrenheit a Celsius"),
    FAHRENHEIT_KELVIN("De Fahrenheit a Kelvin"),
    KELVIN_CELSIUS("De Kelvin a Celsius"),
    KELVIN_FAHRENHEIT("De Kelvin a Fahrenheit");

    private final String nombre;

    private ConvertidorTemperatura(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public BigDecimal getValor() {
        return switch (this) {
            case CELSIUS_FAHRENHEIT -> new BigDecimal("1.8");
            case CELSIUS_KELVIN -> new BigDecimal("1");
            case FAHRENHEIT_CELSIUS -> new BigDecimal("0.5555555555555556");
            case FAHRENHEIT_KELVIN -> new BigDecimal("0.5555555555555556");
            case KELVIN_CELSIUS -> new BigDecimal("273.15");
            case KELVIN_FAHRENHEIT -> new BigDecimal("1.8");

        };
    }

    public String[] getNombres() {
        return new String[] {
            CELSIUS_FAHRENHEIT.getNombre(),
            CELSIUS_KELVIN.getNombre(),
            FAHRENHEIT_CELSIUS.getNombre(),
            FAHRENHEIT_KELVIN.getNombre(),
            KELVIN_CELSIUS.getNombre(),
            KELVIN_FAHRENHEIT.getNombre()
        };
    }
}
