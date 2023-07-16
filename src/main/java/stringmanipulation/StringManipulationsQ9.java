package stringmanipulation;

public class StringManipulationsQ9 {
    /*
     Create a String variable and print all characters except the first character and the last
character on the console in uppercases.
     */
    public static void main(String[] args) {
        String str = "Java";
        Integer indexOfLastCharacter = str.length()-1;
        String allCharactersExceptLastCharactersInUpperCase = str.substring(1, indexOfLastCharacter).toUpperCase();
        System.out.println("All characters except the first and the last character: " + allCharactersExceptLastCharactersInUpperCase);




    }
}
