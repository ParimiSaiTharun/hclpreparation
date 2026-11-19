import java.util.*;
import java.util.stream.*;

class Employee {

    int id;
    String name;
    String department;
    double salary;

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ID: " + id +
               ", Name: " + name +
               ", Department: " + department +
               ", Salary: " + salary;
    }
}

public class Main {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
            new Employee(1, "Ravi", "IT", 50000),
            new Employee(2, "Raj", "HR", 30000),
            new Employee(3, "Kiran", "IT", 70000),
            new Employee(4, "Arjun", "Finance", 45000),
            new Employee(5, "Sai", "HR", 60000)
        );

        // ==============================
        // 1. FILTER()
        // Select employees with salary > 40000
        // ==============================

        // employees.stream()
        //     .filter(e -> e.salary > 40000)
        //     .forEach(System.out::println);


        // ==============================
        // 2. MAP()
        // Convert employee names to uppercase
        // ==============================

        // employees.stream()
        //     .map(e -> e.name.toUpperCase())
        //     .forEach(System.out::println);


        // ==============================
        // 3. SORTED()
        // Sort employees by salary (descending)
        // ==============================

        // employees.stream()
        //     .sorted(Comparator.comparingDouble((Employee e) -> e.salary).reversed())
        //     .forEach(System.out::println);


        // ==============================
        // 4. DISTINCT()
        // Display unique departments
        // ==============================

        // employees.stream()
        //     .map(e -> e.department)
        //     .distinct()
        //     .forEach(System.out::println);


        // ==============================
        // 5. PEEK()
        // Display processing information
        // ==============================

        // employees.stream()
        //     .peek(e -> System.out.println("Processing: " + e.name))
        //     .forEach(System.out::println);


        // ==============================
        // 6. SKIP()
        // Skip first two employees
        // ==============================

        // employees.stream()
        //     .skip(2)
        //     .forEach(System.out::println);


        // ==============================
        // 7. REDUCE()
        // Calculate total salary
        // ==============================

        // double totalSalary = employees.stream()
        //     .map(e -> e.salary)
        //     .reduce(0.0, (a, b) -> a + b);

        // System.out.println("Total Salary: " + totalSalary);


        // ==============================
        // 8. ALLMATCH()
        // Check whether all employees earn above 6000
        // ==============================

        // boolean result = employees.stream()
        //     .allMatch(e -> e.salary > 6000);

        // System.out.println(result);


        // ==============================
        // 9. ANYMATCH()
        // Check whether at least one employee earns above 60000
        // ==============================

        // boolean result = employees.stream()
        //     .anyMatch(e -> e.salary > 60000);

        // System.out.println(result);


        // ==============================
        // 10. NONEMATCH()
        // Check whether no employee earns below 20000
        // ==============================

        // boolean result = employees.stream()
        //     .noneMatch(e -> e.salary < 20000);

        // System.out.println(result);


        // ==============================
        // 11. FINDANY()
        // Find any employee earning above 40000
        // ==============================

        // Optional<Employee> result = employees.stream()
        //     .filter(e -> e.salary > 40000)
        //     .findAny();

        // result.ifPresent(System.out::println);


        // ==============================
        // 12. TOARRAY()
        // Convert employee names into an array
        // ==============================

        // String[] names = employees.stream()
        //     .map(e -> e.name)
        //     .toArray(String[]::new);

        // System.out.println(Arrays.toString(names));


        // ==============================
        // 13. COUNT()
        // Count employees earning above 40000
        // ==============================

        // long count = employees.stream()
        //     .filter(e -> e.salary > 40000)
        //     .count();

        // System.out.println("Count: " + count);


        // ==============================
        // 14. FOR EACH()
        // Print all employees
        // ==============================

        // employees.stream()
        //     .forEach(System.out::println);


        // ==============================
        // 15. COLLECTORS.GROUPINGBY()
        // Group employees by department
        // ==============================

        // Map<String, List<Employee>> result = employees.stream()
        //     .collect(Collectors.groupingBy(e -> e.department));

        // System.out.println(result);


        // ==============================
        // 16. COLLECTORS.PARTITIONINGBY()
        // Divide employees based on salary > 40000
        // ==============================

        // Map<Boolean, List<Employee>> result = employees.stream()
        //     .collect(Collectors.partitioningBy(e -> e.salary > 40000));

        // System.out.println(result);


        // ==============================
        // 17. OPTIONAL.OF()
        // Create Optional with a non-null value
        // ==============================

        // Optional<String> value = Optional.of("Hello");
        // System.out.println(value);


        // ==============================
        // 18. OPTIONAL.OFNULLABLE()
        // Create Optional with a nullable value
        // ==============================

        // String name = null;
        // Optional<String> value = Optional.ofNullable(name);
        // System.out.println(value);


        // ==============================
        // 19. OPTIONAL.EMPTY()
        // Create an empty Optional object
        // ==============================

        // Optional<String> value = Optional.empty();
        // System.out.println(value);

    }
}
