package ifstatement;

public class IfStatementsQ3 {
    /*
     Type code to print
 a) "Valid Password" if the password has at least 6 characters different from space
 character
 b) "Do not use space character in password" if the password has any space
 character in any position
 c) "Invalid Password" if a and b conditions are not satisfied
     */
    public static void main(String[] args) {
        String password = "q1w2e3";
        if(password.replaceAll("\\S", "").length()>0){
            System.out.println("Do not use space character in password");
        }else if(password.replaceAll("\\s", "").length()>=6){
            System.out.println("Valid Password");
        }else{
            System.out.println("Invalid Password");
        }




    }
}
