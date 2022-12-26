public class Main {
    public static void main(String args[]) {
        int [] grades = new int[] {3, 9, 27, 81, 243, 729, 2187, 6561, 19683, 59049, 177147};
        int sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        int average = (sum/grades.length);
        System.out.println(average);
    }
}  
