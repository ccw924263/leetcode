package leetcode.done;

import java.util.*;

public class ShuZuZhongShuZiChuXianDeCiShuLcof {
    public static void main(String[] args) {
        int[] nums = new int[]{4,1,4,6};
        int[] result = new ShuZuZhongShuZiChuXianDeCiShuLcof().new Solution().singleNumbers(nums);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
    class Solution {
        public int[] singleNumbers(int[] nums) {
            Map<Integer,Integer> map = new HashMap<>();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                if(map.get(nums[i]) != null){
                    map.put(nums[i],2);
                }else{
                    map.put(nums[i],1);
                }
            }
            for (int i : map.keySet()) {
                if(map.get(i) == 1){
                    list.add(i);
                }
            }
            int[] result = new int[2];
            for (int i = 0; i < list.size(); i++) {
                result[i] = list.get(i);
            }
            return result;
        }
    }
}
