import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class Employee implements Comparable<Employee> {
  private int age;
  private String country;

  public Employee(int a, String c) {
    this.age = a;
    this.country = c;
  }

  public int getAge() {
    return age;
  }

  public String getCountry() {
    return country;
  }

  public String toString() {
    return "{Age: " + age + ", Country: " + country + "}";
  }

  @Override
  public int compareTo(Employee emp) {
    return this.age - emp.age;
  }
}

public class EmployeeList {
  public static void main(String[] args) {
    List<Employee> empList = new ArrayList<Employee>();

    empList.add(new Employee(24, "USA"));
    empList.add(new Employee(32, "USA"));
    empList.add(new Employee(52, "India"));
    empList.add(new Employee(19, "USA"));
    empList.add(new Employee(19, "India"));
    empList.add(new Employee(31, "UK"));
    empList.add(new Employee(31, "Russia"));

    // System.out.println("Array size is: " + empList.size());
    // System.out.println(Arrays.toString(empList.toArray()));

    empList.add(1, new Employee(31, "UK")); // adding duplicate and at a specofic index
    empList.set(0, new Employee(26, "Australia")); // this replaces existing element at 0th index

    // System.out.println("Array size is: " + empList.size());
    // System.out.println(Arrays.toString(empList.toArray()));

    // System.out.println(empList.get(new Employee(19, "USA")));

    /*
     * for (Employee e : empList) { System.out.println(e); }
     */

    // Simple sort using comparable interface
    // java.util.Collections.sort(empList); // sorts using Comparable::compareTo

    // Simplrt sort using flexible comparator for custom compare
    // java.util.Collections.sort(empList, Comparator.comparing((Employee emp) -> {
    // return emp.getAge();
    // // return emp.getCountry();
    // }));

    // Compare using chained comparisons for comparing using multiple attributes
    /*
     * java.util.Collections.sort(empList, Comparator.comparing((Employee emp) ->
     * emp.getAge()).thenComparing((Employee emp) -> emp.getCountry()));
     */

    // compare in reverse order
    /*
     * java.util.Collections.sort(empList, Comparator.comparing((Employee emp) ->
     * emp.getAge()) .thenComparing((Employee emp) -> emp.getCountry()).reversed());
     */

    /*
     * empList.iterator().forEachRemaining(emp -> { System.out.println(emp); });
     */

    // empList.stream().filter(emp -> emp.getAge() == 31).map(emp ->
    // emp.getCountry()).forEach(System.out::println);

    List<Employee> filteredEmpList = empList.stream().filter(emp -> emp.getCountry() != "China")
        .collect(Collectors.toList());
    filteredEmpList.stream().forEach(System.out::println);

    // filteredEmpList.parallelStream().forEach(System.out::println);

    System.out.println(filteredEmpList.stream().anyMatch(emp -> emp.getCountry().contains("P")));
  }
}