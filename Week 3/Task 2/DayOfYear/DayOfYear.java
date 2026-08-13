import java.time.LocalDate;
import java.util.Scanner;

public class DayOfYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter date (YYYY-MM-DD): ");
        String date = sc.nextLine();

        LocalDate d = LocalDate.parse(date);

        int dayOfYear = d.getDayOfYear();

        System.out.println("Day of the year: " + dayOfYear);

        sc.close();
    }
}