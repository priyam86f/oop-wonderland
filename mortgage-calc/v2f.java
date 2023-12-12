//Version 1.1.0, implemented some basic error handling
import java.util.Scanner;

public class v2f {
    public static void main(String[] args) {
        //defining the variables
        int principal_amount=0;
        double mortgage=0;
        int period=0;
        int months_in_year=12;
        double annual_interest_rate=0;

       

        //taking the input
       
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Principal Amount :\n");
            principal_amount = scanner.nextInt();
            if(principal_amount>=1000 && principal_amount<=1000000)
                break;
                System.out.println("Please enter a value between 1,000 and 10,00,000.");
        }
        Scanner scanner2 = new Scanner(System.in);

        while(true){
        System.out.println("\nAnnual Interest Rate :\n");
        annual_interest_rate = scanner2.nextDouble();
        if(annual_interest_rate>=1&&annual_interest_rate<=30)
        break;
            System.out.println("Please enter a value between 0 and 30");
        
        }
        Scanner scanner3 = new Scanner(System.in);
        while(true){
        System.out.println("\nPeriod (in years) :\n");
        period = scanner3.nextInt();
        if(period>=0 && period<=30)
        break;
        System.out.println("Please enter a value between 0 and 30");
        }

        //adjusting number of payments and monthly interest rate as per the formula
        int number_of_payments = period * months_in_year;
        double monthly_interest_rate = annual_interest_rate / 100 / months_in_year;

        //mortgage calculation
        mortgage = principal_amount*(monthly_interest_rate*(Math.pow(1+monthly_interest_rate, number_of_payments)))
        /((Math.pow(1+monthly_interest_rate, number_of_payments))-1);

        System.out.println("The monthly mortgage for a period of "+period+" years\nat an annual interest rate of "+annual_interest_rate+"% amounts to ----> "+mortgage);
       
    }
}
