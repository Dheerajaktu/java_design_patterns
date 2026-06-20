package org.java.codingQuestions;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LearnMethods {

    public static void main(String[] args) {
        String str = "dheeraj";

        // Let's process string char by char

        str.chars().forEach(c -> System.out.println("===>>"+(char)c));

        str.chars().forEach(System.out::println);
        // NOTE - chars() always return InStram();

        // Now we've InStram value means we've Unicode then we need to convert that into characters

        str.chars().mapToObj(c -> String.valueOf((char)c)).forEach(c -> System.out.println("==B=>>"+c));

        /*
        * WELL DONE, now we this chars
        * */
//                ==B=>>d
//                ==B=>>h
//                ==B=>>e
//                ==B=>>e
//                ==B=>>r
//                ==B=>>a
//                ==B=>>j

        // now let's store these chars in a list

        List<String> res = str.chars().mapToObj(c -> String.valueOf((char)c)).collect(Collectors.toList());


        System.out.println("LIST ==>>"+res);

        // Let's reverse our list now

        Collections.reverse(res);
        System.out.println("REVERSE ==>>"+res);

        // now we've list of chars now convert into complete string

        String finalRes = res.stream().map(c -> String.valueOf(c)).collect(Collectors.joining());

        System.out.println("FINAL ==>>"+finalRes);





    }
}
