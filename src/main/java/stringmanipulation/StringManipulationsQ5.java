package stringmanipulation;

public class StringManipulationsQ5 {
    /*
     Create a String variable and print just the last non-space character on the console for any
String.
     */
    public static void main(String[] args) {
        String str = " Istanbul ";
        int indexOfLastNonSpace = str.trim().length()-1;
        String lastNonSpaceChar = str.substring(indexOfLastNonSpace, indexOfLastNonSpace+1);
        System.out.println("The non-space last character: " + lastNonSpaceChar);
    }
}
