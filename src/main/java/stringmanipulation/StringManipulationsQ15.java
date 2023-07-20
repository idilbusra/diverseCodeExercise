package stringmanipulation;

public class StringManipulationsQ15 {
    /*
    Type a code to find the number of punctuation marks used in a String.
     */
    public static void main(String[] args) {

        String str = "Wow! Busra is 28 years old. ";
        int totalNumberOfCharacters = str.length();
        int charactersDifferentFromPunctuationMarks = str.replaceAll("\\p{Punct}", "").length();
        int numOfPunctuationMarks = totalNumberOfCharacters - charactersDifferentFromPunctuationMarks;
        System.out.println(numOfPunctuationMarks);





    }


}
