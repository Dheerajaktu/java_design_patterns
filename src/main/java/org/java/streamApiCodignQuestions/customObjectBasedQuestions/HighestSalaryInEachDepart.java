package org.java.streamApiCodignQuestions.customObjectBasedQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class HighestSalaryInEachDepart {

    public static void main(String[] args) {
        findHighestSalaryEachDepartment();
    }

    // Question: From a list of employees -
    // find the highest-paid employee in each department.
    public static void findHighestSalaryEachDepartment() {
        List<Employee> emp = Arrays.asList(
                new Employee("Alice", "HR", 50000),
                new Employee("Bob", "IT", 80000),
                new Employee("Charlie", "IT", 75000),
                new Employee("Dave", "HR", 60000),
                new Employee("Eve", "Finance", 70000),
                new Employee("Dheerajs", "ADMIN", 710000),
                new Employee("Princy", "ADMIN", 170000));

        Map<String, Employee> highestPaid = emp.stream()
                .collect(
                        Collectors.groupingBy(e -> e.department,
                                Collectors.collectingAndThen(
                                        Collectors.maxBy(
                                                Comparator.comparingDouble(e -> e.salary)),
                                        Optional::get)));

        System.out.println("highestPaid emp: " + highestPaid);

        /*
         * emp.stream() → Employees ki stream banayi.
         * groupingBy(e -> e.department) → Employees ko department-wise group kiya.
         * maxBy(...) → Har department mein highest salary wala employee nikala.
         * comparingDouble(e -> e.salary) → Comparison salary ke basis par kiya.
         * maxBy() → Result Optional<Employee> deta hai.
         * Optional::get → Optional ke andar se actual Employee nikala.
         * Final result → Map<String, Employee>
         * Key = Department
         * Value = Us department ka highest-paid employee.
         */

    }

}
