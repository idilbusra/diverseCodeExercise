package loops;

public class LoopsQ13 {
    /*
    Type a program to print the integers from 1 to 1000 without using any loop
     */
    public static void main(String[] args) {
        printNumbers(1000);
    }
    static void printNumbers(int number) {
        if(number > 0) {
            printNumbers(number - 1);
            System.out.print(number + " ");
        }
        return;
    }
}
