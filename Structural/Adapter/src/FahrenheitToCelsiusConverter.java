class FahrenheitToCelsiusConverter implements TemperatureConverter {
    @Override
    public double convert(double fahrenheitTemperature) {
        return (fahrenheitTemperature - 32) * 5/9;
    }
}