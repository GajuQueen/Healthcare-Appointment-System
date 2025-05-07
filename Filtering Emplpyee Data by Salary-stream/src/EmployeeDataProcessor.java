import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;


public class EmployeeDataProcessor {
    public static void main(String[] args) {
      List<Employee> employees = Arrays.asList(
              new Employee("Gaju", 20000),
              new Employee("Alice", 30000),
              new Employee("Sonia", 200),
              new Employee("Queen", 7000)
      );
        System.out.println(employees);

      List<Employee> employees2 = employees.stream()
              .filter(yoo -> yoo.getSalary() > 5000)
              .collect(Collectors.toList());

        System.out.println(employees2);
    }


}
