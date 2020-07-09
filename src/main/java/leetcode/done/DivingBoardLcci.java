package leetcode.done;

public class DivingBoardLcci {
    class Solution {
        public int[] divingBoard(int shorter, int longer, int k) {
            if(k == 0){
                return new int[0];
            }
            if(shorter == longer){
                return new int[]{shorter * k};
            }
            int[] result = new int[k+1];
            for (int i = 0; i <= k; i++) {
                result[i] = shorter * (k - i) + longer * i;
            }
            return result;
        }
    }
    public static void main(String[] args) {
        int[] result = new DivingBoardLcci().new Solution().divingBoard(1,2,3);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
