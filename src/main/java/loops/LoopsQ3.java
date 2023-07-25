package loops;

public class LoopsQ3 {
    /*
    Type code to check a String is palindrome or not.
    If a String is the same with its reverse then it is called palindrome.
     */
    public static void main(String[] args) {
        String str = "radar";
        String str1 = "";
        Integer c= str.length()-1;
        do{
            String str2 = str.substring(c,c+1);
            str2 = str2 + str2;
            c--;
        }while(c<-1);
        if(str.equals(str1)){
            System.out.println(str + " is not palindrome");
        }else{
            System.out.println(str + " is palindrome");
        }

    }
}
