package javaTraining.Arrays;

public class test {
    public static void main(String[] args) {
        int [] nums ={3,6,4,1,5};
        int target = 11;
        test t = new test();
      //  System.out.println(t.twoSum(nums, target));
        t.sum();

    }
    public static void sum(){
        int [] nums ={1,2,3,4,5};
        System.out.println("length--> "+nums.length);
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }

    }
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {}
        }
        return null;
    }
}
