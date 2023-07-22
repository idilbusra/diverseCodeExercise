package ternarystatement;

public class TernaryStatementQ3 {
    /*
    Type code to check the password
 If it has more than 5 characters, initial should be 'B'
 If it does not have more than 5 characters initial should be 'I'
 Solve the task by using nested-ternary
     */
    public static void main(String[] args) {
        String password = "12345687";
        String checkPassword = password.length() > 5 ? password.startsWith("B") ? "Valid" : "Invalid" : password.startsWith("I") ? "Valid" : "Invalid";
        System.out.println(checkPassword);
    }
}
