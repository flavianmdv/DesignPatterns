public class Main {
    public static void main(String[] args) {
        TemperatureConverter celsiusToFahrenheitConverter = new CelsiusToFahrenheitConverter();

        double celsiusTemperature = 25.0;
        double fahrenheitTemperature = celsiusToFahrenheitConverter.convert(celsiusTemperature);
        System.out.println("Celsius: " + celsiusTemperature + " -> Fahrenheit: " + fahrenheitTemperature);

        TemperatureConverter fahrenheitToCelsiusConverter = new FahrenheitToCelsiusConverter();

        double fahrenheitTemperature2 = 77.0;
        double celsiusTemperature2 = fahrenheitToCelsiusConverter.convert(fahrenheitTemperature2);
        System.out.println("Fahrenheit: " + fahrenheitTemperature2 + " -> Celsius: " + celsiusTemperature2);
    }
}