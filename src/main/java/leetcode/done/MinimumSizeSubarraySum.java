package leetcode.done;

public class MinimumSizeSubarraySum {
    class Solution {
        public int minSubArrayLen(int s, int[] nums) {
            int result = nums.length;
            boolean flag = false;
            for (int i = 0; i < nums.length; i++) {
                int tmp = 0;
                int sum = nums[i];
                if(sum >= s){
                    return  1;
                }
                for (int j = i + 1; j < nums.length; j++) {
                    sum += nums[j];
                    if (sum >= s){
                        tmp = j - i + 1;
                        result = Math.min(result , tmp);
                        flag = true;
                        break;
                    }
                }
            }
            return !flag ? 0 : result;
        }
    }
    public static void main(String[] args) {
        int s = 3;
        int[] nums = new int[]{1};
        int result = new MinimumSizeSubarraySum().new Solution().minSubArrayLen(s,nums);
        System.out.println("输出：" + result);
    }
}
