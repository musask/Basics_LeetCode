package leetcode.problems.easy.array;

import java.util.Arrays;

public class ArrayConcatenation {
//1929
//Concatenation of Array
    public static void main(String arg[]){
        int[] nums = new int[]{1,3,2,1};
        int[] ans = new int[nums.length*2];

//        Solution 1 , O(n*n)
//
//        for(int i = 0 ; i < ans.length ;i++){
//
//          ans[i] = nums[i];
//
//        }
//
//        for(int i = 0 ; i < nums.length ;i++){
//
//            ans[nums.length+i] = nums[i];
//
//        }

        //O(n)
        for(int i = 0 ; i < ans.length ;i++){
            if(i < nums.length) {

                ans[i] = nums[i];

            }
           else {

                ans[i] = nums[-(nums.length-i)];
            }

        }




    }
}

