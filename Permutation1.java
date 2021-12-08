package leetcode.problems.easy.array;

public class Permutation1 {

    //1920	: LeetCode Permutation
    //Build Array from
    //Solution 1
    //Performance o(n) , memory O(1)
    public int[] buildArray(int[] nums) {

        for(int i = 0 ; i < nums.length ; i++){
            nums[i] = nums.length * (nums[nums[i]]%nums.length) + nums[i] ;
        }
        for(int i = 0 ; i < nums.length ; i++){

            nums[i] = nums[i]/nums.length ;
        }

        return nums;

    }
}
