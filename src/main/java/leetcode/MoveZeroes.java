package leetcode;

public class MoveZeroes {
    class Solution {
        public void moveZeroes(int[] nums) {
            if(nums == null){
                return;
            }
            int length = nums.length,flag = 0;
            for (int i = 0; i < length; i++) {
                if(nums[i] != 0){
                    nums[flag] = nums[i];
                    flag++;
                }
            }
            for (int i = flag; i < length; i++) {
                nums[i] = 0;
            }
        }
    }
}
