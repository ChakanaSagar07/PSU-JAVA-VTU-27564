import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DaysBetweenDates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter first date (YYYY-MM-DD): ");
        String date1 = sc.nextLine();

        System.out.print("Enter second date (YYYY-MM-DD): ");
        String date2 = sc.nextLine();

        // Convert to LocalDate
        LocalDate d1 = LocalDate.parse(date1);
        LocalDate d2 = LocalDate.parse(date2);

        // Calculate difference
        long days = Math.abs(ChronoUnit.DAYS.between(d1, d2));

        // Output
        System.out.println("Number of days between two dates: " + days);

        sc.close();
    }
}