package M_Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DaysBetween {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter date 1 in format of dd-mm-yyyy : ");
        String stringDate = sc.nextLine();
        System.out.print("Enter date 2 in format of dd-mm-yyyy : ");
        String stringDate1 = sc.nextLine();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date givenDate1 = simpleDateFormat.parse(stringDate);
        Date givenDate2 = simpleDateFormat.parse(stringDate1);
        int daysBetween = 0;
        Calendar startDate = Calendar.getInstance();
        startDate.setTime(givenDate1);
        Calendar endDate = Calendar.getInstance();
        endDate.setTime(givenDate2);
        while(startDate.before(endDate)){
            startDate.add(Calendar.DAY_OF_MONTH,1);
            daysBetween++;
        }

        System.out.println("Days Between Two Given Date is "+ daysBetween);
    }
}
