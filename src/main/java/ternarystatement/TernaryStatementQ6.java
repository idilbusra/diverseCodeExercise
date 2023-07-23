package ternarystatement;

public class TernaryStatementQ6 {
    /*
    If the number has 4 digits, the output will be “This number has 4 digits.” Otherwise, the
output will be “This number has no 4 digits.”
     */
    public static void main(String[] args) {
        int number = 3639;
        String str = (number>999 && number<10000) || (number>-10000 && number<-999) ? "Has 4 digits" : "Has no 4 digits";
        System.out.println(str);




    }
}
