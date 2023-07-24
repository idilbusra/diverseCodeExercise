package switchstatement;

import java.util.ArrayList;
import java.util.List;

public class SwitchStatementQ2 {
    /*
    Type a code which prints the all month names starting with the given month numbers.
     */
    public static void main(String[] args) {
        List<String> nextMonths = new ArrayList<>();
        int month = 5;
        switch (month) {
            case 1: nextMonths.add("January");
            case 2: nextMonths.add("February");
            case 3: nextMonths.add("March");
            case 4: nextMonths.add("April");
            case 5: nextMonths.add("May");
            case 6: nextMonths.add("June");
            case 7: nextMonths.add("July");
            case 8: nextMonths.add("August");
            case 9: nextMonths.add("September");
            case 10: nextMonths.add("October");
            case 11: nextMonths.add("November");
            case 12: nextMonths.add("December");
                break;
            default: break;
        }
        if (nextMonths.isEmpty()) {
            System.out.println("Invalid month number");
        } else {
            for (String nameOfMonth : nextMonths) {
                System.out.print(nameOfMonth + " ");
            }
        }











    }
}
