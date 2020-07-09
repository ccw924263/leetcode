package leetcode;

import java.util.Arrays;

public class SearchInsertPosition {
    class Solution {
        public int searchInsert(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
                if (nums.length == 1){
                    return nums[i] >= target ? 0 : 1;
                }
                if(nums[i] >= target){
                    return i;
                }
            }
            return nums.length;
        }
    }
}
