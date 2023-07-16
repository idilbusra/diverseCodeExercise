package stringmanipulation;

public class StringManipulationsQ8 {
    /*
    Create a String variable and print all characters except the last character on the console in
uppercases.
     */

    public static void main(String[] args) {
        String str = "Busra";
        Integer indexOfLastCharacter = str.length()-1;
        String allCharactersExceptLastCharacter = str.substring(0, indexOfLastCharacter).toUpperCase();
        System.out.println("All characters except the last character: " + allCharactersExceptLastCharacter);



    }
}
