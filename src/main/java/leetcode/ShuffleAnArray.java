package leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ShuffleAnArray {
    class Solution {
        private int[] initNums;
        Random random = new Random();
        public Solution(int[] nums) {
            initNums = nums;
        }

        /** Resets the array to its original configuration and return it. */
        public int[] reset() {
            return initNums;
        }

        /** Returns a random shuffling of the array. */
        public int[] shuffle() {
            int count = initNums.length;
            for (int i = 0; i < count; i++) {

            }
            return null;
        }
    }
}




















