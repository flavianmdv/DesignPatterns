class CelsiusToFahrenheitConverter implements TemperatureConverter {
    @Override
    public double convert(double celsiusTemperature) {
        return (celsiusTemperature * 9/5) + 32;
    }
}