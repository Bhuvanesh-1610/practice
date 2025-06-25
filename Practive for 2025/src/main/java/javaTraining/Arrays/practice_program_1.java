package javaTraining.Arrays;

public class practice_program_1 {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        // If no valid pair is found, return an empty array instead of null
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums = {3,2,3};
        int target = 6;
        practice_program_1 obj = new practice_program_1();
        int[] on=obj.twoSum(nums, target);
        System.out.println(on[0]+","+ on[1]);
    }
}
