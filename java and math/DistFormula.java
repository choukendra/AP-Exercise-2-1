import java.util.Scanner;

class DistFormula {

    public static void main (String[] args) {
        //1. declare variables
        Scanner sc = new Scanner(System.in);
        double x1, y1 = 0, x2 = 0, y2 = 0;
        double dist = 0;
   
        
        //2. get user input
        System.out.println("DISTANCE CALCULATOR: ");
        System.out.println(" ");
        System.out.print("Enter x's coordinate of point 1:" );
        x1 = sc.nextDouble();
        System.out.print("Enter y's coordinate of point 1:" );
        y1 = sc.nextDouble();
        System.out.print("Enter x's coordinate of point 2:" );
        x2 = sc.nextDouble();
        System.out.print("Enter y's coordinate of point 2:" );
        y2 = sc.nextDouble();        
        
        //3. calculate and display answer
        dist = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.println("2 points have a distance of " + dist + " units");
        
    }
}