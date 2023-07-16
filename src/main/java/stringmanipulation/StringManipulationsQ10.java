package stringmanipulation;

public class StringManipulationsQ10 {
    /*
    Type code to check if a String has just a single space character any position in the middle.

     */

    public static void main(String[] args) {
        String str = "Tom Hanks";
        String trimMiddle = str.trim();
        String allExceptedSpace = trimMiddle.replaceAll("\\s", "");
        Boolean isSingleSpaceInTheMiddle = trimMiddle.length() - allExceptedSpace.length()==1;
        System.out.println("There is a space in the middle: " + isSingleSpaceInTheMiddle);

    }
}
