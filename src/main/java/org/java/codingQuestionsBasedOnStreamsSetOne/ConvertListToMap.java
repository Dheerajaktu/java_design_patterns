package org.java.codingQuestionsBasedOnStreamsSetOne;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertListToMap {
    // Problem: Convert list of employees into a map where key is ID and value is name.
    // Expected O/P; { 1 = "Amit", 2 = "Neha", 3 = "Raj" }

    // Good question for interivew

    public static void main(String[] args) {

        List<Emp> empList = Arrays.asList(
                new Emp(1, "Amit"),
                new Emp(2, "Neha"),
                new Emp(3, "Raj")
        );

        Map<Integer, String> result = empList.stream().
                collect(Collectors.toMap(Emp::getId, Emp::getName));


        System.out.println("Final Result==>"+result);





    }
}


class Emp{
    private int id;
    private String name;


    public Emp(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}