package stringmanipulation;

public class StringManipulationsQ2 {
    /*
    Create 3 String variables for city's names. Print the sum of the number of characters in
all the 3 names except space characters.
     */
    public static void main(String[] args) {

        String cityName1 = "Istanbul";
        String cityName2 = "Bursa ";
        String cityName3 = "Gazi Antep";
        Integer c1 = cityName1.replaceAll("\\s","").length();
        Integer c2 = cityName2.replaceAll("\\s","").length();
        Integer c3 = cityName3.replaceAll("\\s","").length();
        System.out.println("Total number of characters different from space: " + (c1 + c2 + c3));




    }
}
