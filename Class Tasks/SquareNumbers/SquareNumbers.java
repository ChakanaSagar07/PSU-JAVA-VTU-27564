import java.util.Scanner;

public class SquareNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter numbers: ");
        String input = sc.nextLine();

        String[] numbers = input.split(" ");

        System.out.print("Squares: ");

        for (String num : numbers) {
            int n = Integer.parseInt(num);
            System.out.print((n * n) + " ");
        }

        sc.close();
    }
}