package classes.converterTemperature;

public class FahrenheitConverter implements Converter{
    @Override
    public double getValue(double value) {
        return 1.8*value+32;
    }
}
