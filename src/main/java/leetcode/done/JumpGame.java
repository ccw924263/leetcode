package leetcode.done;

import java.util.HashMap;
import java.util.Map;

public class JumpGame {
    public static boolean canJump(int[] nums) {
        if(nums == null || nums.length <= 0){
            return false;
        }
        int count = nums.length;
        int k = 0;
        for (int i = 0; i < count; i++) {
            if(i > k){
                return false;
            }
            k = k > (i + nums[i]) ? k : (i + nums[i]);
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0};
        System.out.println(canJump(nums));
    }

}
