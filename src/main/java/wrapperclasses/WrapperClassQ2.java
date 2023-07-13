package wrapperclasses;

public class WrapperClassQ2 {
    /*
    Type a code to convert “250” String to byte and to convert “2000” String to short then print
the difference on the console.
     */
    public static void main(String[] args) {
        byte num1 = Byte.valueOf("250");
        short num2 = Short.valueOf("2000");
        System.out.println(num2 - num1);

    }
}
