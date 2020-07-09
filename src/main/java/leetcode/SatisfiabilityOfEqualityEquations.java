package leetcode;

import leetcode.done.LongestCommonPrefix;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SatisfiabilityOfEqualityEquations {
    class Solution {
        public boolean equationsPossible(String[] equations) {
            boolean result = true;
            Map<String,Integer> map = new HashMap<>();
            int number = 0;
            for (int i = 0; i < equations.length; i++) {
                if(map.get(equations[i].substring(0,1)) == null){
                    map.put(equations[i].substring(0,1),number);
                    number++;
                }
                if(map.get(equations[i].substring(3,4)) == null){
                    map.put(equations[i].substring(3,4),number);
                    number++;
                }
            }
            for (int i = 0; i < equations.length; i++) {
                String str = equations[i];
                if(str.contains("!=")){
                    if(map.get(str.substring(0,1)) == map.get(str.substring(3,4))){
                        return false;
                    }
                }
                if(str.contains("==")){
                    if(map.get(str.substring(0,1)) != map.get(str.substring(3,4))){
                        return false;
                    }
                }
            }
            return result;
        }
    }
    public static void main(String[] args) {
        String[] strs = new String[]{"a==b","b!=a"};
//        strs = new String[]{"dog","racecar","car"};
//        strs = new String[]{"c","c","c"};
//        strs = new String[]{"aa","ab","c"};
//        strs = new String[]{"aa","ab"};
//        strs = new String[]{"aa","aa"};
//        strs = new String[]{"ca","a"};

        boolean result = new SatisfiabilityOfEqualityEquations().new Solution().equationsPossible(strs);
        System.out.println("输出：" + result);
    }
}


















