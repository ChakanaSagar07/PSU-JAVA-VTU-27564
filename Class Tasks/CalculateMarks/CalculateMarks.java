import java.util.Scanner;

public class CalculateMarks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        String input = sc.nextLine();

        String[] values = input.split("[,\\s]+");

        int total = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (String value : values) {
            int num = Integer.parseInt(value);

            total += num;

            if (num > max)
                max = num;

            if (num < min)
                min = num;
        }

        double average = (double) total / values.length;

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

        sc.close();
    }
}