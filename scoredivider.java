import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int grade = input.nextInt();
        
        if (grade >= 90) {
            System.out.println("Score is A");
        }
        else if (grade >= 80) {
            System.out.println("Score is B");
        }
        else if (grade >= 70) {
            System.out.println("Score is C");
        }
        else if (grade >= 60) {
            System.out.println("Score is D");
        }
        else {
            System.out.println("Score is F");
        }  
    }
}  
