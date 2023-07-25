package loops;

public class LoopsQ4 {
    /*
    Type code to print the unique numbers in an integer.
     */
    public static void main(String[] args) {
        Integer number = 141516;
        String str = String.valueOf(number);
        String str2 = "";
        for(Integer i = 0; i< str.length(); i++){
            String str3 = str.substring(i,i+1);
            if(str.indexOf(str3)== str.lastIndexOf(str3)){
                str2= str2 + str3;
            }
        }
        System.out.println(str);
    }
}
