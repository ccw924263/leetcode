package leetcode.done;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BestTimeToBuyAndSellStock {
    class Solution {
        public int maxProfit(int[] prices) {
            if(prices == null || prices.length <= 1){
                return 0;
            }
            int count = prices.length;
            int maxNum = 0;
            for (int i = 0; i < count; i++) {
                for (int j = i + 1; j < count; j++) {
                    if(maxNum < (prices[j] - prices[i])){
                        maxNum = prices[j] - prices[i];
                    }
                }
            }
            return maxNum;
        }
    }
    class Solution1 {
        public int maxProfit(int[] prices) {
            if(prices == null || prices.length <= 1){
                return 0;
            }
            //7,1,5,3,6,4
            int count = prices.length;
            int maxNum = 0;
            int minNum = prices[0];
            for (int i = 1; i < count; i++) {
                maxNum = Math.max(maxNum, prices[i] - minNum);
                minNum = Math.min(minNum, prices[i]);
            }
            return maxNum;
        }
    }
}
