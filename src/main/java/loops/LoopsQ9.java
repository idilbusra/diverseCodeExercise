package loops;

public class LoopsQ9 {
    /*
    Type code to find the sum of the integers from 9 to 53
     */
    public static void main(String[] args) {
        int sum = 0;
        for(int i=9; i<54; i++){
            sum = sum+i;
        }
        System.out.println(sum);
    }
}
