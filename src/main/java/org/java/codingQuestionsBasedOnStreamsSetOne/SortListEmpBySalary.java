package org.java.codingQuestionsBasedOnStreamsSetOne;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortListEmpBySalary {
    // Sort employees based on salary in ascending order.
    // Expected Output: [Ravi(30000), Amit(50000), Dheeraj(170000), Modi(79000)]

    public static void main(String[] args) {
            List<Employee> employees = Arrays.asList(
                    new Employee(1, "Amit", 50000),
                    new Employee(2, "Ravi", 30000),
                    new Employee(3, "Dheeraj", 170000),
                    new Employee(4, "Modi", 150000)
            );

        System.out.println("Employee List==>"+employees);

        /* With Method Reference: */

        employees.stream().sorted(Comparator.comparing(Employee::getSalary))
                .forEach(System.out::println);


        /* Without Method Reference, using lambda function */
        employees.stream().sorted(Comparator.comparing(emp -> emp.getSalary()))
                .forEach(System.out::println);


        /*
        * NOTE - here sorted() method basically sort in asc order.
        * */
    }

}

class Employee {
    private int id;
    private String name;
    private int salary;
    public int getId() {
        return id;
    }

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }
}