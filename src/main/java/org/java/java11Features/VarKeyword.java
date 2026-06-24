package org.java.java11Features;

import java.util.HashMap;
import java.util.List;

public class VarKeyword {

    /*
    * var keyword got introduce in java 10 firstly
    * Main purpose of this keyword is reduce boilerplate code
    * During CT variable type get infer if we use var
    *
    * */

    public static void main(String[] args) {

        /* Without var */
        HashMap<String, List<Integer>> map = new HashMap<String, List<Integer>>();

        /* Without var */
        var map1 = new HashMap<String, List<Integer>>();


        System.out.println("Without var"+map);


        System.out.println("Wit var"+map1);




    }
}
