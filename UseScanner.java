import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("input lucky number");
        int luckynumber = scanner.nextInt();
        System.out.println("input score you want to get");
        double grade = scanner.nextDouble();
      
        System.out.println("name: " + name);
        System.out.println("luckynumber: " + luckynumber);
        System.out.println("grade: " + grade);
        
        scanner.close();
    }
}
