package leetcode.undone;

public class HouseRobber {
    class Solution {
        public int rob(int[] nums) {
            if(nums.length == 1){
                return nums[0];
            }
            if(nums.length == 2){
                return Math.max(nums[0],nums[1]);
            }
            if(nums.length == 3){
                return Math.max(nums[0]+nums[2],nums[1]);
            }
            //1,2,3,1
            int ans1 = Integer.MIN_VALUE; // F(1,m)
            int ans2 = Integer.MIN_VALUE; // F(1,m-1)
            int maxSum = nums[0]; // F(m)
            int tempNum = 0; // F(i)
            for (int i = 1; i < nums.length; i++) {
                tempNum += nums[i];
                if(maxSum < tempNum){
                    maxSum = tempNum;
                }
            }
            return maxSum;
        }
    }
}
