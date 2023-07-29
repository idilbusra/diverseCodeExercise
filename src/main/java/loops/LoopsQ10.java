package loops;

public class LoopsQ10 {
    /*
    Type code to find the multiplication of the integers from 9 to 53
     */
    public static void main(String[] args) {
        int multiply = 1;
        for(int i=9; i<54; i++){
            multiply = multiply *i;
        }
        System.out.println(multiply);
    }
}
