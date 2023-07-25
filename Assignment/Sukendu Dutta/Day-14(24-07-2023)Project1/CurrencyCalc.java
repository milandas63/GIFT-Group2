import java.util.Scanner;
public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Currency Conversion Options:");
        System.out.println("1. USD to INR");
        System.out.println("2. USD to EUR");
        System.out.println("3. USD to KWD");
        System.out.println("4. INR to USD");
        System.out.println("5. EUR to USD");
        System.out.println("6. KWD to USD");
        System.out.print("Enter your choice (1-6): ");
        int choice = scanner.nextInt();
        System.out.print("Enter the amount: ");
        double amount = scanner.nextDouble();
        double convertedAmount = 0.0;
        String fromCurrency = "";
        String toCurrency = "";
        switch (choice) {
            case 1:
                convertedAmount = usdToInr(amount);
                fromCurrency = "USD";
                toCurrency = "INR";
                break;
            case 2:
                convertedAmount = usdToEur(amount);
                fromCurrency = "USD";
                toCurrency = "EUR";
                break;
            case 3:
                convertedAmount = usdToKwd(amount);
                fromCurrency = "USD";
                toCurrency = "KWD";
                break;
            case 4:
                convertedAmount = inrToUsd(amount);
                fromCurrency = "INR";
                toCurrency = "USD";
                break;
            case 5:
                convertedAmount = eurToUsd(amount);
                fromCurrency = "EUR";
                toCurrency = "USD";
                break;
            case 6:
                convertedAmount = kwdToUsd(amount);
                fromCurrency = "KWD";
                toCurrency = "USD";
                break;
            default:
                System.out.println("Invalid choice. Please enter a number from 1 to 6.");
                System.exit(1);
        }
        System.out.println(amount + " " + fromCurrency + " is equal to " + convertedAmount + " " + toCurrency + ".");
        scanner.close();
    }
    public static double usdToInr(double usd) {
        return usd * 74.5;
    }
    public static double usdToEur(double usd) {
        return usd * 0.85;
    }
    public static double usdToKwd(double usd) {
        return usd * 0.3;
    }
    public static double inrToUsd(double inr) {
        return inr / 74.5;
    }
    public static double eurToUsd(double eur) {
        return eur / 0.85;
    }
    public static double kwdToUsd(double kwd) {
        return kwd / 0.3;
    }
}
