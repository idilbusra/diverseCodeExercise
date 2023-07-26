package loops;

public class LoopsQ6 {
    /*
    Write the code to print even integers from 50 to 2 on the same line by adding "+" between the two consecutive ones.
     */
    public static void main(String[] args) {

        String str = "";
        for(Integer i=50; i>2; i--){
            if(i%2==0){
                str = str + i + " + Six";
            }
        }
        System.out.println(str);


    }
}
