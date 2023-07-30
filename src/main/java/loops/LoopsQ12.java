package loops;

public class LoopsQ12{
    /*
    Type code to print characters from 'a' to 'S' on the console by using while loop.
     */
    public static void main(String[] args) {
        char character = 'S';
        String result = "";
        while(character <='a'){
            result = result + character;
            character++;
        }
        System.out.println(result);
    }
}
