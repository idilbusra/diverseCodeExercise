package stringmanipulation;

public class StringManipulationsQ7 {
    /*
    Create a String variable and print all characters except the first character on the console.

     */
    public static void main(String[] args) {
        String str = "Java";
        String allCharacterExceptFirstCharacter = str.substring(1);
        System.out.println("All characters except the first character: " + allCharacterExceptFirstCharacter);



    }
}
