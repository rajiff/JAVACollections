import java.util.List;
import java.util.ArrayList;

class Employee {
  int age;
  String country;

  public Employee(int a, String c) {
    this.age = a;
    this.country = c;
  }
}

public class EmployeeList {
  public static void main(String[] args) {
    List<Employee> empList = new ArrayList<Employee>();

    empList.add(new Employee(24, "USA"));
    empList.add(new Employee(32, "USA"));
    empList.add(new Employee(52, "India"));
    empList.add(new Employee(19, "USA"));
    empList.add(new Employee(31, "UK"));
    empList.add(2, new Employee(31, "UK"));

    System.out.println("Array size is: " + empList.size());
  }
}