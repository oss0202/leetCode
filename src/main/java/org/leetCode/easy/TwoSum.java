package org.leetCode.easy;

import java.lang.reflect.Array;
import java.util.Arrays;

//문제링크 : https://leetcode.com/problems/two-sum/
public class TwoSum {
    public static void main(String[] args) {
        //Input: nums = [2,7,11,15], target = 9
        int[] result = twoSum(new int[]{3, 2, 4}, 6);
        System.out.println(Arrays.toString(result));
    }

    /**
     * 첫번재 숫자부터 끝까지 하나씩 추가해서 더해보기
     * 3,2,4
     * - 3/2, 3/4, 2/4
     */
    public static int[] twoSum(int[] nums, int target) {
        int[] answers = new int[2];
        //첫번째 수
        forTwoSum:
        for(int i = 0; i < nums.length - 1; i++){
            //두번째 수
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target){
                    answers[0] = i;
                    answers[1] = j;
                    break forTwoSum;
                }
            }
        }
        return answers;
    }

}
