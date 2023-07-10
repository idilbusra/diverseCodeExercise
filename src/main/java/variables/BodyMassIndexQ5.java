package variables;

public class BodyMassIndexQ5 {

     /*
    Type a code to find simple body mass index.
    NOTE: BMI(Body Mass Index) = weight *10000 / (height*height)
     */

    public static void main(String[] args) {
        int weight = 65;
        int height =171;

        double bodyMassIndex = weight *10000 / (height*height);

        System.out.println(bodyMassIndex);
    }
}
