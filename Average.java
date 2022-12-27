public class Main {
    public static void main(String args[]) {
        int [] grades = new int[] {172, 28, 39, 45, 62, 713, 98, 85, 75, 59, 65, 95, 91, 124, 75, 153, 74, 96, 95, 75};
        
        int sum = 0;
        int average;
        
        for (int i = 0; i<grades.length; i++) {
            sum += grades[i];
        }
        average = (sum/grades.length);
        int count = 0;
        for (int j = 0; j<grades.length; j++) {
            if (grades[j]>average) {
                count = count+1;
            }
        }
        System.out.println(count);
    }
}    
