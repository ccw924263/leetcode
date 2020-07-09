package leetcode.done;

import java.util.Arrays;

public class KthSmallestElementInASortedMatrix {
    class Solution {
        public int kthSmallest(int[][] matrix, int k) {
            int[] nums = new int[matrix.length * matrix[0].length];
            int count = 0;
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    nums[count] = matrix[i][j];
                    count++;
                }
            }
            Arrays.sort(nums);
            return nums[k - 1];
        }
    }
    public static void main(String[] args) {
        int[][] A = new int[][]{{1,  5,  9},{10, 11, 13},{12, 13, 15}};
        int result = new KthSmallestElementInASortedMatrix().new Solution().kthSmallest(A,8);
        System.out.println(result);
    }
}
