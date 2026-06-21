package org.java.codingQuestionsBasedOnStreamsSetOne;

import java.util.Arrays;
import java.util.List;

public class FindMaximumSalary {

    //Problem: Find the highest salary from employee list.
    //Expected O/P: 75000

    public static void main(String[] args) {
        List<Integer> salaryList = Arrays.asList(40000, 60000, 75000, 50000);

        //Basically we need to find here max value from list

        int highestSalary = salaryList.stream().mapToInt(x -> x).max().getAsInt();

        System.out.println("highestSalary==>>"+highestSalary);



    }
}
