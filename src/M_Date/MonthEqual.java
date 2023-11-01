package M_Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class MonthEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter date in format of dd-mm-yyyy : ");
        String stringDate = sc.nextLine();
        System.out.print("Enter the Month to be Iterate : ");
        int count = sc.nextInt();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            Date givenDate = simpleDateFormat.parse(stringDate);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(givenDate);
            calendar.add(Calendar.MONTH,count);
            String addedDate = simpleDateFormat.format(calendar.getTime());
            System.out.println(stringDate+" is Added by "+count+" Months = "+addedDate);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


    }
}
