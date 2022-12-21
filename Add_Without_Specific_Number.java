public class Main {
    public static void main(String args[]) {
        int i = 0;
        int sum = 0;
        
        while(true) {
            i++;
            if (i % 3 == 0){
                continue;
            }
            sum += i;
            if(sum > 100) {
                break;
            }
        }
    }
}  
