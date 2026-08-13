import java.util.*;

class Employee {
    int id;
    String name;
    String dept;
    double salary;

    Employee(int id, String name, String dept, double salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public String toString() {
        return id + " " + name + " " + dept + " " + salary;
    }
}

public class SalaryDescending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        List<Employee> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter id, name, dept, salary:");
            int id = sc.nextInt();
            String name = sc.next();
            String dept = sc.next();
            double salary = sc.nextDouble();

            list.add(new Employee(id, name, dept, salary));
        }

        list.sort(Comparator.comparingDouble((Employee e) -> e.salary).reversed());

        System.out.println("\nSalary Descending:");
        list.forEach(System.out::println);
    }
}