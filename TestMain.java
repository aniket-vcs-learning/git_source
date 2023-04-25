package session_1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestMain {

    public static void main(String[] args) {

        Employee e1 = new Employee("aniket", "Male", "IT", 30);
        Employee e2 = new Employee("nikhil", "Male", "HR", 20);
        Employee e3 = new Employee("Priyanka", "Female", "FIN", 40);
        Employee e4 = new Employee("Sandhya", "Female", "IT", 50);
        Employee e5 = new Employee("Ganesh", "Male", "HR", 25);
        Employee e6 = new Employee("Sarika", "Female", "ACC", 26);
        Employee e7 = new Employee("Akshay", "Male", "FIN", 33);
        Employee e8 = new Employee("Ragini", "Female", "IT", 22);


        List<Employee> empList = Arrays.asList(e1,e2,e3,e4,e5,e6,e7,e8);

        empList.forEach(e -> System.err.println(e.getName()+", "));
        System.out.println("-------------------------------------------------------");
        // print distinct departments:

        List<String> deptList = empList.stream()
                .map(Employee::getDepartment)
                .distinct()
                .toList();

        System.out.println("distinct list : " + deptList);

        // print count of employees from each department

        Map<String, Long> countsMap = empList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

        System.out.println("count by department : " + countsMap);

        // average age gender wise
        Map<String, Double> averageMap = empList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getAge)));

        System.out.println("average age by gender : " + averageMap);
    }
}
