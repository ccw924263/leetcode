package leetcode.done;

import java.util.HashMap;
import java.util.Map;

public class ClimbingStairs {
    class Solution {
//        Map<Integer,Integer> map = new HashMap<>();
        public int climbStairs(int n) {
            if(n <= 0){
                return 0;
            }
            if(n <= 2){
                return n;
            }
            int count_1 = 1;
            int count_2 = 2;
            int count = 0;
            for (int i = 3; i <= n; i++) {
                count = count_1 + count_2;
                count_1 = count_2;
                count_2 = count;
            }
//            if(map.get(n) != null){
//                return map.get(n);
//            }
//            count = climbStairs(n-1) + climbStairs(n-2);
//            map.put(n,count);
            return count;
        }
    }
}
