package session_2;

import session_1.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestMains {

    public static void main(String[] args) {

        Emp e1 = new Emp("aniket", "Male", "IT", 30, 30000.00);
        Emp e2 = new Emp("nikhil", "Male", "HR", 20, 20000.00);
        Emp e3 = new Emp("Priyanka", "Female", "FIN", 24, 20000.00);
        Emp e4 = new Emp("Sandhya", "Female", "IT", 50, 50000.00);
        Emp e5 = new Emp("Ganesh", "Male", "HR", 35, 30000.00);
        Emp e6 = new Emp("Sarika", "Female", "ACC", 46, 40000.00);
        Emp e7 = new Emp("Akshay", "Male", "FIN", 23, 20000.00);
        Emp e8 = new Emp("Ragini", "Female", "IT", 22, 20000.00);

        List<Emp> empList = Arrays.asList(e1,e2,e3,e4,e5,e6,e7,e8);

        System.out.println("original list : " + empList);

        // increase salary by 10%, of employees having age greater than 25.
        List<Emp> salryHikedEmployees = empList.stream()
                .filter(e -> e.getAge() > 25)
                .map(e -> {
                        e.setSalary(e.getSalary() * 1.10);
                        return e;
                }).toList();

        System.out.println("salryHikedEmployees list : " + salryHikedEmployees);

        Emp second = empList.stream()
                .sorted(Comparator.comparingDouble(Emp::getSalary).reversed())
                .skip(1)
                .findFirst().get();

        List<Emp> seconds = empList.stream()
                .sorted(Comparator.comparingDouble(Emp::getSalary).reversed())
                .skip(1)
                .limit(1)
                .collect(Collectors.toList());


        System.out.println("second highest list : " + second);

        System.out.println("second highest list : " + seconds);

        Map<String, Double> agerageSalaryGenderWise = empList.stream()
                .collect(Collectors.groupingBy(Emp::getGender, Collectors.averagingDouble(Emp::getSalary)));

        System.out.println("agerageSalaryGenderWise list : " + agerageSalaryGenderWise);


    }
}
