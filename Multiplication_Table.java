import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        
        for(int i=0; i<9; ++i) {
            System.out.println(n*(i + 1));
        }
    }
}  
