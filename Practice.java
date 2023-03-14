import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Employee {
  private String name;
  private String department;
  private int salary;
  private int age;

  public String getName() {
    return name;
  }
  public String getDepartment() {
    return department;
  }
  public int getSalary() {
    return salary;
  }
  public int getAge() {
    return age;
  }

  public Employee(String name, String department, int salary, int age) {
    this.name = name;
    this.department = department;
    this.salary = salary;
    this.age = age;
  }

}

public class Practice {
  public static void main(String[] args) {
    List<Employee> employees = Arrays.asList(new Employee ("Ankit", "Software", 2000000, 30),
                                             new Employee ("Sunny", "Software", 1800000, 29),
                                             new Employee ("Pallavi", "Pharma", 1250000, 30),
                                             new Employee ("Dev", "Marketing", 1400000, 26));
    String departmentFilter = "Software";

    List<Employee> filterEmployees = employees.stream().filter(s -> s.getDepartment().equals(departmentFilter)).collect(Collectors.toList());
      System.out.println("Showing Employess in " + departmentFilter +":");

    for(Employee emp : filterEmployees){
      System.out.println(emp.getName());
    }

    Map<String, Optional<Employee>> maxSalary = employees.stream().collect(Collectors.groupingBy(Employee :: getDepartment, Collectors.maxBy(Comparator.comparing(Employee :: getSalary))));
      System.out.println("Max salry of Employee by Department: ");

    maxSalary.forEach((department, employee) -> {
      System.out.println(department + " " + employee.get().getName() + " (" + employee.get().getSalary() + ")");
    });

    Map<String, Optional<Employee>> minSalary = employees.stream().collect(Collectors.groupingBy(Employee :: getDepartment, Collectors.minBy(Comparator.comparing(Employee :: getSalary))));
      System.out.println("Max salry of Employee by Department: ");

    minSalary.forEach((department, employee) -> {
      System.out.println(department + " " + employee.get().getName() + " (" + employee.get().getSalary() + ")");
    });

  }

}