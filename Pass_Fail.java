import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int grade = input.nextInt();
      
        if (grade >= 70) {
            System.out.println("You passed.");
          
            if (grade >= 90) {
              System.out.println("You can also get scholarships.");
           }  
        }
      
        else {
            System.out.println("You failed.");
        }
    }
}  
