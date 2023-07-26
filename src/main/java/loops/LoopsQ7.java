package loops;

public class LoopsQ7 {
    /*
    Type code to print all lowercase characters in a String with *
     */
    public static void main(String[] args) {
        String str = "busra hello world";
        str = str.replaceAll("[^a-z]", "");
        String str1 = "";
        Integer i=0;
        do{
            String str3 = str.substring(i,i+1);
            str1 = str1 + str3 + '*';
            i++;
        }while(i< str.length());
        System.out.println(str1);
    }
}
