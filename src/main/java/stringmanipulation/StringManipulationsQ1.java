package stringmanipulation;

public class StringManipulationsQ1 {
    /*
    Create a String variable for person names which have just a single word.
Print the person name with the initial is in lowercase and all the other characters
     */
    public static void main(String[] args) {
        String nameOfPerson = " bUSRA ";
        String updatedNameOfPerson = nameOfPerson.trim().toUpperCase();
        updatedNameOfPerson = updatedNameOfPerson.substring(0,1).toLowerCase() + updatedNameOfPerson.substring(0,1);
        System.out.println(updatedNameOfPerson);

    }
}
