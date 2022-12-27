public class Main {
    public static void main(String args[]) {
        int [] iArray = new int[] {1, 2, 3, 4, 5};
        
        for(int i : iArray) {
            System.out.println(i);
        }
        int sum = 0;
        for (int i : iArray) {
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }
}      
