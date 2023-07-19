package stringmanipulation;

public class StringManipulationsQ11 {
    /*
    Type code to check if a String does not have any space character at the beginning and at
the end.
     */

    public static void main(String[] args) {

        String str = " Busra ";
        String trimString = str.trim();
        Boolean isTrimHave = str.equals(trimString);
        System.out.println(" Are there spaces at the beginning or end of the word? " + !isTrimHave);

    }
}
