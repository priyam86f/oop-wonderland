//Version 1.5.0, some more refactoring
import java.text.NumberFormat;
import java.util.Scanner;

public class v6f {
    final static int months_in_year=12;
    final static int percent =100;
    public static void main(String[] args) {
       

        int principal_amount = (int) readNumber("Principal :", 1000, 1000000);
        double annual_interest_rate = readNumber("Annual Interest :", 0, 30);
        int period = (int) readNumber("Period (in years)", 0, 30);

        printMortgage(principal_amount, annual_interest_rate, period);
        printPaymentsSchedule(period, principal_amount, annual_interest_rate);

    }

    private static void printMortgage(int principal_amount, double annual_interest_rate, int period) {
        System.out.println("----------MORTGAGE----------");
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
              
        int number_of_payments = period * months_in_year;
        double monthly_interest_rate = annual_interest_rate / percent / months_in_year;

        double mortgage = principal_amount
                * (monthly_interest_rate * (Math.pow(1 + monthly_interest_rate, number_of_payments)))
                / ((Math.pow(1 + monthly_interest_rate, number_of_payments)) - 1);

        System.out.println("The monthly mortgage for a period of " + period + " years\nat an annual interest rate of "
                + annual_interest_rate + "% amounts to ----> " + mortgage);

    }
    
    public static double calculateBalance(
        int principal_amount,
        double annual_interest_rate,
        int period,
        int number_of_payments_made
    ){
        
        int number_of_payments = period * months_in_year;
        double monthly_interest_rate = annual_interest_rate / percent / months_in_year;

        double balance = principal_amount * (
            (Math.pow(1 + monthly_interest_rate, number_of_payments)) -
            (Math.pow(1 + monthly_interest_rate, number_of_payments_made))
    ) / (
            (Math.pow(1 + monthly_interest_rate, number_of_payments)) - 1
    );
        return balance;
    }

    public static void printPaymentsSchedule( int period,
    int principal_amount,
    double annual_interest_rate){
       
        System.out.println("------------------------------");
        System.out.println("PAYMENTS SCHEDULE");
        System.out.println("------------------------------");

        for(int month=1;month<period*months_in_year;month++){
            double balance = calculateBalance(principal_amount, annual_interest_rate, period, month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));

        }
    }
    

}


