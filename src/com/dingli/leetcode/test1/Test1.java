package com.dingli.leetcode.test1;

public class Test1 {

    /**
     * 两数之和
     *
     * 给定nums = [2,7,11,15],target = 9
     * 因为nums[0] + nums[1] = 2 + 7 = 9
     * 所以返回[0,1]
     */
    public static void main(String[] args) {

        int[] nums = {2,7,11,15};
        int target = 13;
        for (int i = 0; i <= nums.length; i++) {
            for(int j = i; j < nums.length; j++){
                if(i == j){
                    continue;
                }
                if(nums[i] + nums[j] == target){
                    System.out.println(i + " " + j);
                }
            }
        }

//        throw new IllegalArgumentException("No two sum solution");
    }

}
