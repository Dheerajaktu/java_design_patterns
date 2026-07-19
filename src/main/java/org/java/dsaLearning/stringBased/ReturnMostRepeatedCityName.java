package org.java.dsaLearning.stringBased;

import java.util.HashMap;

public class ReturnMostRepeatedCityName {
    public static void main(String[] args) {
        String [] cites = {"Delhi","Agra","Mumbai","Pune", "Mumbai", "Bareilly", "Shamli", "Vijayawada"};
        String result = getMostRepeatedCityName(cites);
        System.out.println(result);
    }

    public static String getMostRepeatedCityName(String[] city) {
        String cityNameMax = "";
        int overallMax = 0;
        for(String cityName : city) {
            HashMap<Character, Integer> freqCount = new HashMap<>();
            int maxFreq = 0;
            for(char ch : cityName.toCharArray()) {
                freqCount.put(ch, freqCount.getOrDefault(ch, 0) + 1);
                if(freqCount.get(ch) > maxFreq) {
                    maxFreq = freqCount.get(ch);
                }
            }
            if(maxFreq > overallMax) {
                overallMax = maxFreq;
                cityNameMax = cityName;
            }

        }
        return cityNameMax;
    }
}
