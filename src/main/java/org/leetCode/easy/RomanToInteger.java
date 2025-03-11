package org.leetCode.easy;

import java.util.Map;

//문제링크 : https://leetcode.com/problems/roman-to-integer/description/
public class RomanToInteger {

    public static void main(String[] args) {
        int result = romanToInt("MCMXCIV");
        System.out.println(result);
    }
    public static int romanToInt(String s) {
        Map<Character, Integer> romanMap = Map.of(
             'I',             1
            ,'V',             5
            ,'X',             10
            ,'L',             50
            ,'C',             100
            ,'D',             500
            ,'M',             1000
        );

        int result = 0;
        char[] chars= s.toCharArray();
        for(int i = 0; i < chars.length; i++){
            //현재 알파벳이 뒤 알파벳보다 작을 경우 - 해줘여한다.
            Character currentSymbol = chars[i];
            Character nextSymbol = i + 1 < chars.length ? chars[i + 1] : 0;

            int currentVal = romanMap.getOrDefault(currentSymbol, 0);
            int nextVal = romanMap.getOrDefault(nextSymbol, 0);
            if(currentVal < nextVal){
                result -= currentVal;
            }else {
                result += currentVal;
            }
        }
        return result;
    }
}
