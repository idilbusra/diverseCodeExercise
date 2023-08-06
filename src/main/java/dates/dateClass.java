package dates;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class dateClass {
    /*
    Type the code that finds out how many days Busra lived.
Date of birth of Busra is 19 of October 1995
     */
    public static void main(String[] args) {
        LocalDate birthdayOfBusra = LocalDate.of(1995, 10, 19);
        LocalDate presentDate = LocalDate.now();
        long numberDaysOfBusraLived = ChronoUnit.DAYS.between(birthdayOfBusra, presentDate);
        System.out.println("The number days of Busra lived is " + numberDaysOfBusraLived);





    }
}
