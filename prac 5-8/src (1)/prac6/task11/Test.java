package prac6.task11;

import java.text.DecimalFormat;

public class Test {
    public static void main(String[] args) {
        double degrees = 32;
        DecimalFormat dF = new DecimalFormat( "#.##" );
        Сelsius c = new Сelsius(degrees);
        degrees = c.convertToFahrenheit();
        System.out.println(dF.format(c.convertToFahrenheit()) +" "+ dF.format(c.convertToKelvin()) + " " + dF.format(c.convertToCelsius()));
        Fahrenheit f = new Fahrenheit(degrees);
        System.out.println(dF.format(f.convertToFahrenheit()) +" "+ dF.format(f.convertToKelvin()) + " " + dF.format(f.convertToCelsius()));
        degrees = f.convertToKelvin();
        Kelvin k = new Kelvin(degrees);
        System.out.println(dF.format(k.convertToFahrenheit()) +" "+ dF.format(k.convertToKelvin()) + " " + dF.format(k.convertToCelsius()));
    }
}
