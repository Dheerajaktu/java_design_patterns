package org.java.youTubeMockInterviewQuestions;

public class VariableArgsDemo {
    public static void main(String[] args) {
        System.out.println("Sum 1: "+LetsHaveSum.getSum(1, 2));;
        System.out.println("Sum 2: "+LetsHaveSum.getAllSum(10, 20, 30, 40));;
        System.out.println("Sum 3: "+LetsHaveSum.getAllSum(10, 20, 30, 40, 5, 60, 70, 80, 90, 1000, 38292));
        System.out.println("Sum 4: "+LetsHaveSum.getAllSum(1,4,2,3,2,2,33,2,2,4,32,2,2,2,22,10, 20, 30, 40, 5, 60, 70, 80, 90, 1000, 38292));
    }
}

class LetsHaveSum {
    static int getSum(int a, int b){
        return a+b;
    }
    static int getAllSum(int... numbers){
        int total = 0;
        for(int n: numbers){
            total += n;
        }
        return total;
    }
}