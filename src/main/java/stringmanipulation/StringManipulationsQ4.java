package stringmanipulation;

public class StringManipulationsQ4 {
   /*
    Create a String variable, print the number of non-digit characters in the String on the
    console.
    */
   public static void main(String[] args) {
       String str = "123aBcd4?--!548#";
       Integer numberOfNonDigitCharacters = str.replaceAll("[0-9]","").length();
       System.out.println("Total number of non-digit characters: " + numberOfNonDigitCharacters);
   }

}
