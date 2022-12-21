import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner input =  new Scanne(System.in);
        System.out.println("Enter your rank");
        int rank = input.nextLine();
        switch(rank){
          case 1:
              System.out.println("It's a gold medal!");
              break;
          case 2:
              System.out.println("It's a silver medal!");
              break;
          case 3:
              System.out.println("It's a bronze medal!");
              break;
          defualt:
              System.out.println("You finished the race!");
        }
    }    
}
