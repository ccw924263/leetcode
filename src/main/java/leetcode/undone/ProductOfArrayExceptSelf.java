package leetcode.undone;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductOfArrayExceptSelf {
    class Solution {
        public int[] productExceptSelf(int[] nums) {
            int[] result = new int[nums.length];
            for(int i=0;i<nums.length;i++){
                int count = 1;
                for (int j = 0; j < nums.length; j++) {
                    if(i != j){
                        count *= nums[j];
                    }
                }
                result[i] = count;
            }
            return result;
        }
    }
}
