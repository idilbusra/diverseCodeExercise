package loops;

public class LoopsQ1 {
    /*
    Type all integers which are divisible by 6 and divisible by 9 from 390 to 18 in the same line
with a space between two consecutive integers.
     */
    public static void main(String[] args) {
        String str = "";
        Integer number =390;
        while(number>17){
            if(number%6==0 && number%9==0){
                str = str + number + " ";
            }
            number--;
        }
        System.out.println(str);






    }

}
