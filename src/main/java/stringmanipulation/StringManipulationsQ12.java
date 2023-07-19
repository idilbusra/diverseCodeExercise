package stringmanipulation;

public class StringManipulationsQ12 {
    public static void main(String[] args) {
        /*
         Type code to check if a String has an uppercase initial and question mark at the end.
         */

        String str = "Tom Hanks.";
        char firstCharacter = str.charAt(0);
        char lastCharacter = str.charAt(str.length()-1);
        Boolean isTheFirstCharacterUpper = firstCharacter >='A' && lastCharacter <='Z';
        Boolean isTheLastCharacterQuestion = lastCharacter =='?';
        Boolean isFirstUpperAndLastQuestion = isTheFirstCharacterUpper && isTheLastCharacterQuestion;
        System.out.println("Is the first char upper and the last char dot? " + isFirstUpperAndLastQuestion);
    }
}
