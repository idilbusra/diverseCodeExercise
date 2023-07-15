package stringmanipulation;

public class StringManipulationsQ6 {
    /*
    Create a String variable and find the sum of the ASCII values of the first and the last
characters of the String
     */
    public static void main(String[] args) {
        String str = "Istanbul";
        int indexOfLastChar = str.length()-1;
        int asciiOfFirst = str.charAt(0);
        int asciiOfLast = str.charAt(indexOfLastChar);
        System.out.println("Total ASCII values of first and last chars: " + (asciiOfFirst + asciiOfLast));

    }
}
