import java.util.*;
import java.util.stream.*;

public class EvenSquareStream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }

        System.out.println("Squares of even numbers:");

        numbers.stream()
               .filter(num -> num % 2 == 0)   // even numbers
               .map(num -> num * num)         // square
               .forEach(System.out::println); // print

        sc.close();
    }
}