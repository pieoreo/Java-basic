import java.util.Scanner
public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your height");
        int height = scanner.nextInt();
        System.out.println("please enter your weight");
        double weight = scanner.nextDouble();
        BMI = (int)(weight/(height*height));
        System.out.println(BMI);
        scanner.close();
