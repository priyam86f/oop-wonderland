
//Version 1.3.0, extracting methods
import java.util.Scanner;

public class v4f {
    public static void main(String[] args) {
        // defining the variables
        int principal_amount = 0;
        int period = 0;
        double annual_interest_rate = 0;

        // taking the input
        principal_amount = (int) readNumber("Principal :", 1000, 1000000);
        annual_interest_rate = readNumber("Annual Interest :", 0, 30);
        period = (int) readNumber("Period (in years)", 0, 30);
        calculateMortgage(principal_amount, annual_interest_rate, period);

    }

    public static double readNumber(String prompt, double min, double max) {
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.println(prompt);
            value = scanner.nextDouble();
            if (value >= min && value <= max)
                break;
            System.out.println("Please enter a value between " + min + " and " + max);
        }
        return value;
    }

    public static void calculateMortgage(int principal_amount,
            double annual_interest_rate, int period) {
        int months_in_year = 12;
        int number_of_payments = period * months_in_year;
        double monthly_interest_rate = annual_interest_rate / 100 / months_in_year;

        double mortgage = principal_amount
                * (monthly_interest_rate * (Math.pow(1 + monthly_interest_rate, number_of_payments)))
                / ((Math.pow(1 + monthly_interest_rate, number_of_payments)) - 1);

        System.out.println("The monthly mortgage for a period of " + period + " years\nat an annual interest rate of "
                + annual_interest_rate + "% amounts to ----> " + mortgage);

    }

}
