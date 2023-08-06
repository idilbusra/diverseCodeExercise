package arrays;

public class ArraysQ2 {
    /*
    Type code to find sum of the number of characters of array elements.
     */
    public static void main(String[] args) {
        String[] arr = new String[]{"busra", "idil", "coding", "hello", "world"};
        Integer sum = 0;
        for(String w : arr){
            sum = sum + w.length();
        }
        System.out.println(sum);
    }
}
