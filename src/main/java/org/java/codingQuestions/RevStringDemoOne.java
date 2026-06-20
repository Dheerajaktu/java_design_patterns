package org.java.codingQuestions;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RevStringDemoOne {
    public static void main(String[] args) {
        String str = "dheeraj";

        List<Character> list = str.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        System.out.println("===1===>>"+list);

        Collections.reverse(list);

        String result = list.stream().map(c -> String.valueOf(c)).collect(Collectors.joining());

        System.out.println("===2===>>"+result);





    }
}

