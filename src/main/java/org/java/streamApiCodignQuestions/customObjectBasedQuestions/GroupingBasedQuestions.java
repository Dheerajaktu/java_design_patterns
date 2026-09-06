package org.java.streamApiCodignQuestions.customObjectBasedQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class GroupingBasedQuestions {

    public static void main(String[] args) {

    }

    // Question: From a list of students, find the top 3 by score. ==> Find Top N
    // Highest Scoring Students
    public static void findNthHighestScore() {
        List<Student> students = Arrays.asList(
                new Student("Dheeraj", 99),
                new Student("Alice", 85),
                new Student("Bob", 92),
                new Student("Charlie", 88),
                new Student("Dave", 78),
                new Student("Eve", 91));

        List<String> topStudents = students.stream()
                .sorted(Comparator.comparingInt((Student s) -> s.score).reversed())
                .limit(3)
                .map(s -> s.name)
                .collect(Collectors.toList());
        System.out.println(topStudents);
    }

}
