import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter numbers: ");
        String input = sc.nextLine();

        String[] numbers = input.split("\\s+");

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for (String num : numbers) {
            set.add(Integer.parseInt(num));
        }

        System.out.print("Output: ");

        for (int num : set) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}