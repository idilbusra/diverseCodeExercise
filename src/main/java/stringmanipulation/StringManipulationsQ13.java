package stringmanipulation;

public class StringManipulationsQ13 {
    /*
    Type code to check if a password is valid or not for the following conditions;
    Password must have at least 9 characters different from space character.
    Password must have at least 3 symbol.
     */
    public static void main(String[] args) {

        String password = "123654789BSR!!!";
        Boolean atLeastNineCharacters = password.replaceAll("\\s","").length()>8;
        Boolean atLeastThreeSymbols = password.replaceAll("\\s","").replaceAll("[A-Za-z0-9]","").length()>2;
        System.out.println("Is the password valid? " + (atLeastNineCharacters && atLeastThreeSymbols));
    }
}
