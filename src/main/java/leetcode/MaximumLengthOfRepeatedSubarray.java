package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaximumLengthOfRepeatedSubarray {
    class Solution {
        public int findLength(int[] A, int[] B) {
            int result = 0;
            int num = 0;
            Map<Integer,Integer> map = new HashMap<>();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < A.length; i++) {
                int a = A[i];
                for (int j = num; j < B.length; j++) {
                    int b = B[i];
                    if(b != a){
                        continue;
                    }
                }
            }
            int max = 0;
            for (int i = 0; i < list.size(); i++) {
                max = Math.max(max,list.get(i));
            }
            return max;
        }
    }
    public static void main(String[] args) {
        int[] A = new int[]{1,2,3,2,1};
        int[] B = new int[]{3,2,1,4,7};
        int result = new MaximumLengthOfRepeatedSubarray().new Solution().findLength(A,B);
        System.out.println("输出：" + result);
    }
}



























