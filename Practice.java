import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Employee {
  private String name;
  private String department;
  private int salary;
  private int age;
  private String gender;
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

  public String getGender() {
    return gender;
  }

  public Employee(String name, String department, int salary, int age, String gender) {
    this.name = name;
    this.department = department;
    this.salary = salary;
    this.age = age;
    this.gender = gender;
  }

}

public class Practice {
  public static void main(String[] args) {
    List<Employee> employees = Arrays.asList(new Employee("Sunny", "Software", 1800000, 28, "M"),
                                             new Employee("Ankit", "Software", 2000000, 29, "M"),
                                             new Employee("Dev", "Marketing", 1400000, 24, "M"),
                                             new Employee("Pallavi", "Pharma", 1200000, 30, "F"),
                                             new Employee("Anushka", "HR", 1000000, 22, "F"),
                                             new Employee("Iti", "Marketing", 1500000, 25, "F"));

    //Department Filter
    String departmentFilter = "Software";

    List<Employee> filterEmployees = employees.stream().filter(s -> s.getDepartment().equals(departmentFilter)).collect(Collectors.toList());
      System.out.println("Showing Employess in " + departmentFilter +":");

    for(Employee emp : filterEmployees){
      System.out.println(emp.getName());
    }

    //Max Salry Filter
    Map<String, Optional<Employee>> maxSalary = employees.stream().collect(Collectors.groupingBy(Employee :: getDepartment,
                                                                   Collectors.maxBy(Comparator.comparing(Employee :: getSalary))));
      System.out.println("Max salry of Employee by Department: ");

    maxSalary.forEach((department, employee) -> {
      System.out.println(department + " " + employee.get().getName() + " " + employee.get().getSalary());
    });

    //Min Slary Filter
    Map<String, Optional<Employee>> minSalary = employees.stream().collect(Collectors.groupingBy(Employee :: getDepartment,
                                                                   Collectors.minBy(Comparator.comparing(Employee :: getSalary))));
      System.out.println("Max salry of Employee by Department: ");

    minSalary.forEach((department, employee) -> {
      System.out.println(department + " " + employee.get().getName() + " "+ employee.get().getSalary());
    });

    //N'th Highest Salary
    Optional<Integer> nHighestSalry = employees.stream().map(i -> i.getSalary()).sorted(Comparator.reverseOrder()).skip(2).findFirst();
      System.out.println("N'th Highest Salary: "+ nHighestSalry);

    //Average age of Male/Female
    Map<String, Double> averageAge = employees.stream().collect(Collectors.groupingBy(Employee :: getGender,
                                                        Collectors.averagingInt(Employee :: getAge)));
      System.out.println("Average of Male/Female: "+ averageAge);

    //Number of Employees in Each department
    Map<String, Long> numberOfEmployee= employees.stream().collect(Collectors.groupingBy(Employee :: getDepartment, Collectors.counting()));
      System.out.println("Number of Employees in Each Department: " +numberOfEmployee);

    //Distinct Departments
    List<String> distinctDepartment = employees.stream().map(Employee :: getDepartment).distinct().collect(Collectors.toList());
      System.out.println("Distinct Departments: " +distinctDepartment);


    //Character Occurence Counter
    String myString = "Hello Hi";

    Map<String, Long> charCount = Arrays.stream(myString.split("")).map(String :: toLowerCase).collect(Collectors.groupingBy(s -> s,
                                                                                                  LinkedHashMap :: new, Collectors.counting()));
      System.out.println(charCount);

  }

}