public class Main {
    public static void main(String args[]) {
        int [] iArray = new int[] {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 24, 25, 27, 29};
        for (int i = 0; i < iArray.length; i++) {
            if (iArray[i] % 2 == 0) {
              System.out.println(iArray[i]);
              break;
            }
        }
    }
}  
