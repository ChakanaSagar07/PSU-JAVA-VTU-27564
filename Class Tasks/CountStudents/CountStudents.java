import java.util.*;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class CountStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        List<Student> list = new ArrayList<>();

        // Input
        for (int i = 0; i < n; i++) {

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter marks: ");
            int marks = sc.nextInt();
            sc.nextLine();

            list.add(new Student(name, marks));
        }

        // Count using filter + count
        long count = list.stream()
                         .filter(s -> s.marks > 75)
                         .count();

        System.out.println("Students scoring above 75: " + count);

        sc.close();
    }
}