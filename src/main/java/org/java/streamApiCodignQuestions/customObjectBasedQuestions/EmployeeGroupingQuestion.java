package org.java.streamApiCodignQuestions.customObjectBasedQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeGroupingQuestion {

    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(
            new Employee("Alice", "HR", 25),
            new Employee("Bob", "IT", 30),
            new Employee("Charlie", "HR", 30),
            new Employee("Dave", "IT", 25));

       Map<String, Map<Integer, List<String>>> grouped = list.stream()
                              .collect(Collectors.groupingBy(e -> e.department, 
                                Collectors.groupingBy(a -> a.age,
                                    Collectors.mapping(e -> e.name, Collectors.toList()) ) ));

        System.out.println("Group employees by department and then by age: "+ grouped);

    }

}

// Question: Group employees by department and then by age.
class Employee {

    String name, department;
    int age;

    Employee(String name, String department, int age) {
        this.name = name;
        this.department = department;
        this.age = age;
    }

}
