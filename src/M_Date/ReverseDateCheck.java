package M_Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ReverseDateCheck {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter date 1 in format of dd-mm-yyyy : ");
        String stringDate = sc.nextLine();
        System.out.print("Enter date 2 in format of dd-mm-yyyy : ");
        String stringDate1 = sc.nextLine();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
        Date givenDate1 = simpleDateFormat.parse(stringDate);
        Date givenDate2 = simpleDateFormat2.parse(stringDate1);
        if(givenDate1.equals(givenDate2)){
            System.out.println("Given Two Days Are Identical");
        } else {
            System.out.println("Given Two Days Are not Identical");
        }
    }
}
