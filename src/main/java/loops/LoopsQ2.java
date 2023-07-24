package loops;

public class LoopsQ2 {
    /*
    Type code to print repeated characters in a String.
     */
    public static void main(String[] args) {
        String str = "helloeveryonehelloworld";
        String s1 = "";
        Integer k =0;
        while(k < str.length()){
            String s2 = str.substring(k,+1);
            if(str.indexOf(s2)!= str.lastIndexOf(s2)){
                if(!s1.contains(s2)){
                    s1 = s1 + s2;
                }
            }
            k++;
        }
        System.out.println(s1);





    }
}
