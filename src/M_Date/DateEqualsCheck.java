package M_Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateEqualsCheck {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter date 1 in format of dd-mm-yyyy : ");
        String stringDate = sc.nextLine();
        System.out.print("Enter date 2 in format of dd-mm-yyyy : ");
        String stringDate2 = sc.nextLine();
        Date givenDate = simpleDateFormat.parse(stringDate);
        Date givenDate2 = simpleDateFormat.parse(stringDate2);
        if(givenDate.equals(givenDate2)){
            System.out.println("Given Two Days Are Identical");
        } else {
            System.out.println("Given Two Days Are not Identical");
        }

    }
    public static void getDate(){
        Date date = new Date();
        System.out.println(date.getTime());
    }

}
