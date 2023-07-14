package stringmanipulation;

public class StringManipulationsQ3 {
    /*
    Create a String variable, print the total number of alphabetical and numeric characters in
the String on the console.
     */
    public static void main(String[] args) {
        String s = " Busra 12345!!! ";
        Integer numberOfCharacter = s.replaceAll("\\s","").replaceAll("[^A-Za-z0-9]","").length();
        System.out.println("Total num of alphabetical and numeric characters chars:" + numberOfCharacter);





    }
}
