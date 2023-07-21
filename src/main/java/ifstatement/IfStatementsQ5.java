package ifstatement;

public class IfStatementsQ5 {
    /*
     Type code to print the messages about the Body Mass Index(BMI) for the given BMI values
 Invalid BMI value < 0
 Underweight = <18.5
 Normal weight = 18.5–24.9
 Overweight = 25–29.9
 Obesity = BMI of 30 or greater
     */
    public static void main(String[] args) {
        double bmi = 12;
        if(bmi<0){
            System.out.println("Invalid BMI value");
        }else if(bmi<18.5){
            System.out.println("Underweight");
        }else if(bmi<24.9 && bmi>=18.5){
            System.out.println("Normal weight");
        }else if(bmi<29.9 && bmi>=25){
            System.out.println("Overweight");
        }else if(bmi>30){
            System.out.println("Obesity");
        }

    }
}
