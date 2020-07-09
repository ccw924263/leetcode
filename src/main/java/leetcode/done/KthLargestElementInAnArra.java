package leetcode.done;

import java.util.Arrays;

public class KthLargestElementInAnArra {
    class Solution {
        public int findKthLargest(int[] nums, int k) {
            Arrays.sort(nums);
            return nums[nums.length - k];
        }
    }
    public static void main(String[] args) {
        int b = 4;
        int[] a = new int[]{3,2,3,1,2,4,5,5,6};
        int result = new KthLargestElementInAnArra().new Solution().findKthLargest(a,b);
        System.out.println("输出：" + result);
    }
}
