import java.util.Scanner;
public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Temperature Conversion Options:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Celsius to Kelvin");
        System.out.println("3. Fahrenheit to Celsius");
        System.out.println("4. Fahrenheit to Kelvin");
        System.out.println("5. Kelvin to Celsius");
        System.out.println("6. Kelvin to Fahrenheit");
        System.out.print("Enter your choice (1-6): ");
        int choice = scanner.nextInt();
        System.out.print("Enter the temperature value: ");
        double temperature = scanner.nextDouble();
        double convertedTemperature = 0.0;
        String fromUnit = "";
        String toUnit = "";
        switch (choice) {
            case 1:
                convertedTemperature = celsiusToFahrenheit(temperature);
                fromUnit = "Celsius";
                toUnit = "Fahrenheit";
                break;
            case 2:
                convertedTemperature = celsiusToKelvin(temperature);
                fromUnit = "Celsius";
                toUnit = "Kelvin";
                break;
            case 3:
                convertedTemperature = fahrenheitToCelsius(temperature);
                fromUnit = "Fahrenheit";
                toUnit = "Celsius";
                break;
            case 4:
                convertedTemperature = fahrenheitToKelvin(temperature);
                fromUnit = "Fahrenheit";
                toUnit = "Kelvin";
                break;
            case 5:
                convertedTemperature = kelvinToCelsius(temperature);
                fromUnit = "Kelvin";
                toUnit = "Celsius";
                break;
            case 6:
                convertedTemperature = kelvinToFahrenheit(temperature);
                fromUnit = "Kelvin";
                toUnit = "Fahrenheit";
                break;
            default:
                System.out.println("Invalid choice. Please enter a number from 1 to 6.");
                System.exit(1);
        }
        System.out.println(temperature + " " + fromUnit + " is equal to " + convertedTemperature + " " + toUnit + ".");
        scanner.close();
    }
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit + 459.67) * 5 / 9;
    }
    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }
    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin * 9 / 5) - 459.67;
    }
}
