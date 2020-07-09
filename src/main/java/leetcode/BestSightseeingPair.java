package leetcode;

import leetcode.done.ReverseInteger;

import java.util.Arrays;

public class BestSightseeingPair {
    class Solution {
        public int maxScoreSightseeingPair(int[] A) {
            int max = A[0] + A[1] - 1;
            for (int i = 2; i < A.length; i++) {
                //0+2
                max = Math.max(A[i-2] + i - 2 + A[i] - i,max);
                //1+2
                max = Math.max(A[i - 1] + i - 1 + A[i] - i,max);
            }
            return max;
        }
    }
    public static void main(String[] args) {
        int[] i = new int[]{10,4,6,4,10};
        int result = new BestSightseeingPair().new Solution().maxScoreSightseeingPair(i);
        System.out.println(result);
    }
}
