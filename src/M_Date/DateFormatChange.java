package M_Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateFormatChange {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter date in format of dd-mm-yyyy : ");
        String stringDate = sc.nextLine();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("dd.MM.yyyy");
        Date givenDate = simpleDateFormat.parse(stringDate);
        String formatChanged = simpleDateFormat1.format(givenDate);
        System.out.println("After Fromat Changed : "+formatChanged);
    }
}
