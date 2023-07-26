package loops;

public class LoopsQ5 {
    /*
    Type code to draw the following image by using a for loop.
    *
    * *
    * * *
    * * * *
     */
    public static void main(String[] args) {
        int lines = 4;
        for(Integer j = 1; j<= lines; j++){

            String str = "";

            for(Integer k=1; k<=j; k++){

                str = str + "* ";
            }
            System.out.println(str);
        }
    }
}
