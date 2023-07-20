package ifstatement;

public class IfStatementsQ2 {
    /*
    Type code to print
     "Spring" for March, April, May
  */
    public static void main(String[] args) {

        String monthName = "December";
        monthName = monthName.toLowerCase();
        if(monthName.equals("december") || monthName.equals("january") || monthName.equals("february")){
            System.out.println("Winter");
        }else if(monthName.equals("march") || monthName.equals("april") || monthName.equals("may")){
            System.out.println("Spring");
        }else if(monthName.equals("june") || monthName.equals("july") || monthName.equals("august")){
            System.out.println("Summer");
        }else if(monthName.equals("september") || monthName.equals("october") || monthName.equals("november")){
            System.out.println("Fall");
        }else{
            System.out.println("Invalid month name");
        }




    }

}
