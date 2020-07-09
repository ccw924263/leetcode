package leetcode.done;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    class Solution {
        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            if(candies == null || candies.length == 0){
                return new ArrayList<>();
            }
            List<Boolean> result = new ArrayList<>();
            int MAX = candies[0];
            for (int i = 1; i < candies.length; i++) {
                MAX = Math.max(MAX,candies[i]);
            }
            for (int i = 0; i < candies.length; i++) {
                if(candies[i] + extraCandies >= MAX){
                    result.add(true);
                }else {
                    result.add(false);
                }
            }
            return result;
        }
    }
}
