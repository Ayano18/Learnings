import java.util.HashMap;
import java.util.Scanner;

public class CurrencyConverterFromGemini {

    public static void main(String[] args) {
        // Define exchange rates (replace with actual rates or API call)
        HashMap<String, Double> rates = new HashMap<>();
        rates.put("USD", 1.0); // Base currency (US Dollar)
        rates.put("PHP", 51.0); // Philippine Peso
        rates.put("EUR", 0.90); // Euro
        rates.put("JPY", 114.0); // Japanese Yen
        rates.put("CNY", 6.70); // Chinese Yuan
        rates.put("INR", 78.0); // Indian Rupee
        rates.put("BTC", 0.000021); // Bitcoin (per USD) - Placeholder value, very volatile

        Scanner scanner = new Scanner(System.in);

        // Get user input for from and to currencies
        System.out.println("Welcome to Currency Converter!");
        System.out.println("Enter the currency you want to convert from (USD, PHP, EUR, JPY, CNY, INR, BTC): ");
        String fromCurrency = scanner.nextLine().toUpperCase();
        System.out.println("Enter the currency you want to convert to (USD, PHP, EUR, JPY, CNY, INR, BTC): ");
        String toCurrency = scanner.nextLine().toUpperCase();

        // Get amount to convert
        System.out.println("Enter the amount to convert: ");
        double amount = scanner.nextDouble();

        // Validate input currencies
        if (!rates.containsKey(fromCurrency) || !rates.containsKey(toCurrency)) {
            System.out.println("Invalid currency code. Please try again.");
            return;
        }

        // Calculate conversion
        double conversionRate = rates.get(toCurrency) / rates.get(fromCurrency);
        double convertedAmount = amount * conversionRate;

        // Display result
        System.out.printf("%.2f %s is equal to %.2f %s\n", amount, fromCurrency, convertedAmount, toCurrency);

        scanner.close();
    }
}
