package ternarystatement;

public class TernaryStatementQ1 {
    /*
    Use ternary to print "Valid Password" if the password has at least 5 characters different
from space characters. "Invalid Password" if the password has less than 5 characters
different from space character.
     */
    public static void main(String[] args) {
        String password = "q1w2e3r4";
        String isValid = password.replaceAll("\\s","").length()>4 ? "Valid Password" : "Invalid Password";
        System.out.println(isValid);
    }
}
