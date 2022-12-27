public class Main {
    public static void main(String args[]) {
        int [][] data = {{11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {20, 19, 18, 17, 16}, {15, 14, 13, 12, 11}};
        
        System.out.println("data.length : " + data.length);
        System.out.println("data[0].length : " + data[0].length);
        
        for(int i = 0; i < data.length; i++) {
            for(int j = 0; j < data[0].length; j++) {
                System.out.println(data[i][j]);
            }
        }
        
        for(int [] loopArr : data) {
             for(int i : loopArr) {
                 System.out.println(i);
             }
        }
    }
}    
