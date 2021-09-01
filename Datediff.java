import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Datediff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter date first:");
        String date1 = sc.nextLine();
        String arr[] = date1.split("/");
        int d1 = Integer.parseInt(arr[0]);
        int m1 = Integer.parseInt(arr[1]);
        int y1 = Integer.parseInt(arr[2]);

        System.out.print("enter date secound:");
        String date2 = sc.nextLine();
        String arr2[] = date2.split("/");
        int d2 = Integer.parseInt(arr2[0]);
        int m2 = Integer.parseInt(arr2[1]);
        int y2 = Integer.parseInt(arr2[2]);

        var FirstDate = LocalDate.of(y1, m1, d1);
        var SecoundDate = LocalDate.of(y2, m2, d2);

        var differance = Period.between(FirstDate, SecoundDate);

        System.out.println("differance is:" + differance.getYears() + "years " + differance.getMonths() + "months "
                + differance.getDays() + "days ");

    }
}
