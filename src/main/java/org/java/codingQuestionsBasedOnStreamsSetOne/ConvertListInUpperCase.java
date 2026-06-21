package org.java.codingQuestionsBasedOnStreamsSetOne;

import java.util.List;
import java.util.stream.Collectors;

public class ConvertListInUpperCase {

    //Problem : Convert all strings in a list to uppercase using Java 8 Streams.
    //O/P: ["JOHN", "ALICE", "BOB"]

    public static void main(String[] args) {
        List<String> names = List.of("john", "alice", "bob");

        List<String> names1 = names.stream().map(c -> c.toUpperCase()).collect(Collectors.toList());

        System.out.println("Result==>>"+ names1);





    }
}
