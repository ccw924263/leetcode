package leetcode.done;

public class MaximumSubarray {
    class Solution {
        public int maxSubArray(int[] nums) {
            if(nums == null || nums.length <= 0){
                return 0;
            }
            //-2,1,-3,4,-1,2,1,-5,4
            int ans = Integer.MIN_VALUE; // F(n,m)
            int minSum = 0; // F(m)
            int tempNum = 0; // F(i)
            for (int i = 0; i < nums.length; i++) {
                tempNum += nums[i];
                ans = Math.max(ans,tempNum - minSum); // F(i) - F(m)
                minSum = Math.min(minSum,tempNum);
            }
            return ans;
        }
    }
}
