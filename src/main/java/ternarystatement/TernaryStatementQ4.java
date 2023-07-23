package ternarystatement;

public class TernaryStatementQ4 {
    /*
    Write a program to print the minimum of 2 integers on the console by using ternary.
     */
    public static void main(String[] args) {
        int firstNumber = 25;
        int secondNumber = 29;

        int result = firstNumber<secondNumber? firstNumber : secondNumber;

        System.out.println(result);
    }

}
