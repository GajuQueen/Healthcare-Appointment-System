import java.util.HashMap;

public class Employee {
    String Name;
    int Salary;

    public Employee(String name, int salary) {
        Salary = salary;
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Employee " +
                " Name='" + Name+
                "   Salary=" + Salary ;
    }
}

