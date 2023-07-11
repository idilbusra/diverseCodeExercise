package variables;

import java.util.Scanner;

public class SwapQ6 {
    /*
    Type a code to swap two integers.

     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers two swap");

        int n1 = scan.nextInt();
        int n2 = scan.nextInt();

        n1 = n1 + n2;
        n2 = n1 - n2;
        n1 = n1 - n2;
        System.out.println("After swapping: " + n1 + " - " + n2);


    }
}
