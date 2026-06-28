package org.java.java21NewFeatures;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class SequencedCollectionsDemo {
    /* In java 21, java added new method those are common for
    * getFirst()
    * getLast()
    * addFirst()
    * addLast()
    * removeFirst()
    * removeLast()
    * reversed()
    * Note - We can use these methods in ArrayList, LinkedHashMap & LinkedHashSet
    * */
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(List.of(2,4,6,8,9,10));
        list.addFirst(5);
        list.addLast(40);

        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.addFirst(10);
        set.addLast(20);
        set.addLast(10); // duplicate ignored
    }
}
