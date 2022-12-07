package prac6.task11;

public class Kelvin implements Convertable{
    double degrees;
    public Kelvin (double degrees){
        this.degrees = degrees;
    }
    @Override
    public double convertToFahrenheit() {
        return this.convertToCelsius() / 5 * 9 + 32;
    }

    @Override
    public double convertToKelvin() {
        return degrees;
    }

    @Override
    public double convertToCelsius() {
        return degrees - 273;
    }
}
