import java.util.*;

public class DateTime {

    public static String findDay(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day); // month is 0-based in Calendar

        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

        String[] days = {
            "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY",
            "THURSDAY", "FRIDAY", "SATURDAY"
        };

        return days[dayOfWeek - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        int day = sc.nextInt();
        int year = sc.nextInt();

        String result = findDay(month, day, year);
        System.out.println(result);
    }
}