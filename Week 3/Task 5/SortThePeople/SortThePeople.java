import java.util.*;

public class SortThePeople {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;

        Integer[] index = new Integer[n];
        for (int i = 0; i < n; i++) {
            index[i] = i;
        }

        Arrays.sort(index, (a, b) -> heights[b] - heights[a]);

        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = names[index[i]];
        }

        return result;
    }

    // Main method for testing
    public static void main(String[] args) {
        SortThePeople obj = new SortThePeople();

        String[] names = {"Mary", "John", "Emma"};
        int[] heights = {180, 165, 170};

        String[] result = obj.sortPeople(names, heights);

        System.out.println(Arrays.toString(result));
    }
}