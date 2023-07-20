package stringmanipulation;

public class StringManipulationsQ14 {
    public static void main(String[] args) {
 /*
  Type code to get initials of the first name and the last name of a given name. Middle name
        is out of scope
  */

        String nameFirst = "Busra Idile";
        String initializeOfFirstName = nameFirst.substring(0,1);
        int indexOfInitializeOfLastName = nameFirst.indexOf(" ") + 1;
        String initializeOfLastName = nameFirst.substring(indexOfInitializeOfLastName, indexOfInitializeOfLastName +1);
        System.out.println(initializeOfFirstName + initializeOfLastName);


    }
}
