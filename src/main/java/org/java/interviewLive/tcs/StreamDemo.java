package org.java.interviewLive.tcs;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        demoOfMap();
    }

    public static void demoOfMap() {
        List<String> names = List.of("Rahul", "Amit", "Priya", "dheeraj");
        // find the length of each -
        List<Integer> result = names.stream().map(i -> i.length()).toList();
        System.out.println("==1=result==>> " + result);
        demoOfFlatMap();
    }

    public static void demoOfFlatMap() {
        List<List<String>> names = List.of(
                List.of("Dheeraj", "Princy"),
                List.of("Rikcy", "Champu"),
                List.of("Padva", "Padvi"));
        List<String> res = names.stream().flatMap(list -> list.stream()).toList();
        PartitionByDemo();
        System.out.println("==2=result==>> " + res);
    }

    public static void PartitionByDemo() {
        List<Integer> list = List.of(31, 3, 1, 341, 1, 3, 4, 2, 2, 4, 32, 122);

        // find odd even 
        Map<Boolean, List<Integer>> res = list.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println("====2 RES==>>"+ res);
    }

}
