package leetcode.problems.easy.array;

import java.util.Arrays;

public class RunningSum {

    public static void main(String args[]){
        int[] nums = new int[]{1,2,3,4};

        for(int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i-1];
        }
        System.out.println(Arrays.toString(nums));
    }
}
