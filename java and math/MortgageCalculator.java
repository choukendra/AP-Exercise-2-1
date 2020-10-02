
import java.util.Scanner;

class MortgageCalculator {

    public static void main (String[] args) {
        //1. declare variables
        Scanner sc = new Scanner(System.in);
        double p;
        double r;
        double n;
        double a;
   
        
        //2. get user input
        System.out.println("CALCULATE INVESTMENT: ");
        System.out.println(" ");
        System.out.print("Enter investment's principle amount: $" );
        p = sc.nextDouble();
        System.out.print("Enter investment's interest rate (between 0 &1):" );
        r = sc.nextDouble();        
        System.out.print("Enter number of years since principle amount deposited" );
        n = sc.nextDouble();        
        
        //3. calculate and display answer
        a = p*(Math.pow(1+r,n));
        System.out.println("Investment worth $" + a + " after " + n + " years");
        
    }
}