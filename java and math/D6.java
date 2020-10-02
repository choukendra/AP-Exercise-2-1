
class D6 {

    public static void main (String[] args) {
        //1. declare variables
        int roll = 0;
   
        
        roll = (int) (Math.random()*6) +1;
        System.out.println("Die roll 1 : " + roll);
        roll = (int) (Math.random()*6) +1;
        System.out.println("Die roll 2 : " + roll);
    }
}