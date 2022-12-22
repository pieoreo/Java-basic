import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter number of the menu.");
        int n = scan.nextInt();
        switch(n){
          case 1:
              System.out.println("You choose Americano.");
              break;
          case 2:
              System.out.println("You choose Cafelatte.");
              break;
          case 3:
              System.out.println("You choose Cappuccino.");
              break;
          case 4:
              System.out.println("You choose Frappuccino.");
              break;
          default:
              System.out.println("Please enter another number.");
        }
        System.out.println("Thank you for using it.");
    }
}  
