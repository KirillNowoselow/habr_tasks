package classes.converterTemperature;

public class KelvinConverter implements Converter{
    @Override
    public double getValue(double value) {
        return value*273.16;
    }
}

