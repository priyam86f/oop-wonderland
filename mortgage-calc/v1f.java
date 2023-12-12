import java.util.Scanner;

public class v1f {
    public static void main(String[] args) {
        //defining the variables
        int principal_amount=0;
        double mortgage=0;
        int period=0;
        int months_in_year=12;
        double annual_interest_rate=0;

        //taking the input
        System.out.println("Principal Amount :\n");
        Scanner scanner = new Scanner(System.in);
        principal_amount = scanner.nextInt();

        System.out.println("\nAnnual Interest Rate :\n");
        Scanner scanner2 = new Scanner(System.in);
        annual_interest_rate = scanner2.nextDouble();

        System.out.println("\nPeriod (in years) :\n");
        Scanner scanner3 = new Scanner(System.in);
        period = scanner3.nextInt();

        //adjusting number of payments and monthly interest rate as per the formula
        int number_of_payments = period * months_in_year;
        double monthly_interest_rate = annual_interest_rate / 100 / months_in_year;

        //mortgage calculation
        mortgage = principal_amount*(monthly_interest_rate*(Math.pow(1+monthly_interest_rate, number_of_payments)))
        /((Math.pow(1+monthly_interest_rate, number_of_payments))-1);

        System.out.println("The monthly mortgage for a period of "+period+" years\nat an annual interest rate of "+annual_interest_rate+"% amounts to ----> "+mortgage);
       
    }
}
