import java.util.*;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        String[] arr = new String[n];

        System.out.println("Enter numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        // Custom sort
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

        // Edge case: if largest is 0
        if (arr[0].equals("0")) {
            System.out.println("Largest Number: 0");
        } else {
            String result = "";
            for (String s : arr) {
                result += s;
            }
            System.out.println("Largest Number: " + result);
        }

        sc.close();
    }
}