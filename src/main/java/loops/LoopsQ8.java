package loops;

public class LoopsQ8 {
    /*
    Type code to print numbers just in the decimal part of the given decimal number with a space.
     */
    public static void main(String[] args) {
        double number = 19.3256;
        String str = String.valueOf(number);
        int idx = str.indexOf(".");
        String partOfDecimal = str.substring(idx + 1);
        String s1 = "";
        for(Integer i=0; i<partOfDecimal.length(); i++){
            String s2 = partOfDecimal.substring(i,i+1);
            s1 = s1 + " " + s2;
        }
        System.out.println(s1);
    }
}
