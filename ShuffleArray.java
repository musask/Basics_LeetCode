package leetcode.problems.easy.array;

import java.util.Arrays;

public class ShuffleArray {

    public static void main(String arg[]){

    int[] nums = new int[]{2,5,1,3,4,7};

   int n = 3 ;

        int[] res = new int[nums.length];
        for(int i = 0; i < n; i++){
            res[2 * i] = nums[i];
            res[2 * i + 1] = nums[n+i];
        }

        System.out.println(Arrays.toString(res));



    }
}
