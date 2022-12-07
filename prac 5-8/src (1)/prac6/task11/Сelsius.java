package prac6.task11;

public class Сelsius implements Convertable {
    double degrees;
    public Сelsius (double degrees){
        this.degrees = degrees;
    }
    @Override
    public double convertToFahrenheit() {
        return degrees / 5 * 9 + 32;
    }

    @Override
    public double convertToKelvin() {
        return degrees + 273;
    }

    @Override
    public double convertToCelsius() {
        return degrees;
    }
}
