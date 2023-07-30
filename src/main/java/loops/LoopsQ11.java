package loops;

public class LoopsQ11 {
    /*
    Type code to print characters from 'a' to 'x' on the console by using for loop
     */
    public static void main(String[] args) {
        int result = 0;
        for(char i = 'a'; i<='x'; i++){
            result = result + i;
        }
        System.out.println(result);
    }
}
