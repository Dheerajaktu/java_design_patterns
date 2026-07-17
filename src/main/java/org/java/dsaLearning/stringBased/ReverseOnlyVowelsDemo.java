package org.java.dsaLearning.stringBased;

public class ReverseOnlyVowelsDemo {
    public static void main(String[] args) {
        String str = "leetcode"; // output --> holle
        String result = solution(str);
        System.out.println("Reversed String result: "+result);
    }

    public static String solution(String input){
        char[] arr = input.toCharArray();

        int left =  0;
        int right = arr.length-1;
        while(left < right){
            if(!isVowel(arr[left])) {
                left++;
            }else if(!isVowel(arr[right])) {
                right--;
            }else{
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return new String(arr);
    }
    public static boolean isVowel(char ch){
        ch = Character.toLowerCase(ch);
        return ch == 'a' || 'e' == ch || 'i' == ch || 'o' == ch || 'u' == ch;
    }
}
