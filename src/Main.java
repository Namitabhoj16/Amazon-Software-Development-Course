public class Main {
    public static void main(String args[]) {
        double amountInUSD = 100.0;
        double exchangeRateUSDToEUR = 0.85;

        double afterConversionToEUR = amountInUSD * exchangeRateUSDToEUR;

        double expenditureInEUR = 55.0;

        double afterExpenditureInEUR = afterConversionToEUR - expenditureInEUR;

        double afterConversionToUSD = afterExpenditureInEUR / exchangeRateUSDToEUR;

        System.out.println("Initial amount in USD: " + amountInUSD);
        System.out.println("Amount in EUR after conversion: " + afterConversionToEUR);
        System.out.println("Amount in EUR after expenditure: " + afterExpenditureInEUR);
        System.out.println("Amount in USD after converting back: " + afterConversionToUSD);

// Initial amount in USD


        System.out.println("Initial amount in USD: " + amountInUSD);

        // Convert USD to EUR
        amountInUSD *= exchangeRateUSDToEUR; // Equivalent to amountInUSD = amountInUSD * exchangeRateUSDToEUR;
        System.out.println("Amount in EUR after conversion: " + amountInUSD);

        // Expenditure of 55 EURO
        amountInUSD -= 55;
        System.out.println("Amount in EUR after expenditure: " + amountInUSD);

        // Convert EUR back to USD
        amountInUSD /= exchangeRateUSDToEUR; // Equivalent to amountInUSD = amountInUSD / exchangeRateEURToUSD;
        System.out.printf("Amount in USD after converting back: %.2f", amountInUSD);

    }
}

