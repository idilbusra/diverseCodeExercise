package arrays;

public class ArraysQ1 {
    /*
    Get the initials of the elements in a String array, if the String ends with 'b' or 'i'
     */
    public static void main(String[] args) {
        String[] words = new String[]{"busra", "idil.i", "busraidil", "Busra.i", "Idil"};
        String initials = "";
        for(String w : words){
            if(w.endsWith("b") || w.endsWith("i")){
                initials = initials + w.substring(0,1);
            }
        }
        System.out.println(initials);


    }
}
