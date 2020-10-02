import java.util.Scanner;

class AreaToRadius {

    public static void main (String[] args) {
        //1. declare variables
        Scanner sc = new Scanner(System.in);
        double area = 0;
        double r = 0;
   
        
        //2. get user input
        System.out.println("CALCULATE A CIRCLE'S RADIUS: ");
        System.out.println(" ");
        System.out.print("Enter circle's area:" );
        area = sc.nextDouble();
        
        //3. calculate and display answer
        r = Math.sqrt (area / Math.PI);
        System.out.println("Circle has area " + area + " units^2 and radius " + r);
        
    }
}
