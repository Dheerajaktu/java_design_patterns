package org.java.dsaLearning.stringBased;

import java.util.Stack;

public class ValidateParenthesesDemo {
    public static void main(String[] args) {
        String s = "()[]{}";
        boolean result = isValid(s);
        System.out.println("isValid: " + result);
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char ch: s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }else{
                if(stack.isEmpty()) return false;

                char top =  stack.pop();

                if(ch == ')' && top != '(' ) return false;

                if(ch == '}' && top != '{') return false;

                if(ch == ']' && top != '[') return false;

            }
        }
        return stack.isEmpty();
    }
}
