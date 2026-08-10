import java.util.*;
import java.util.stream.*;

public class StreamPipelineInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter numbers:");
        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }

        // Stream pipeline
        List<Integer> result = numbers.stream()
                                      .distinct()            // remove duplicates
                                      .filter(x -> x > 20)   // greater than 20
                                      .map(x -> x * 2)       // multiply by 2
                                      .sorted()              // ascending order
                                      .collect(Collectors.toList());

        System.out.println("Result: " + result);

        sc.close();
    }
}