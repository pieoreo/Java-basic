public class Main {
    public static void main(String args[]) {
        int[] grades = new int[] {200, 180, 140, 170, 120, 160, 180, 170, 150, 100, 130, 190,180, 120, 150, 0,140, 180, 190, 150};
        
        int highScore = grades[0];
        int lowScore = grades[15];
        int sum = 0;
        for (int i = 0; i<grades.length; i++) {
          sum += grades[i];
        }
        sum = sum - highScore - lowScore;
      
        int average = (sum/(grades.length-2));
        System.out.println(average);
    }
}  
