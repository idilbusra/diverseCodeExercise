package ternarystatement;

public class TernaryStatementQ7 {
    /*
    Print 'Odd' for odd integers, print ‘Even’ for even integers by using ternary.
     */
    public static void main(String[] args) {
        int number = 39;
        String result = number %2==0 ? "Even" : "Odd";
        System.out.println(result);
    }
}
