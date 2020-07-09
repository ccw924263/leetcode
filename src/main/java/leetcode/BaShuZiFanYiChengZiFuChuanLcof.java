package leetcode;

import leetcode.done.LongestCommonPrefix1;

public class BaShuZiFanYiChengZiFuChuanLcof {
    class Solution {
        public int translateNum(int num) {
            if(num < 10){
                return 1;
            }
            int result = 1;
            String numStr = String.valueOf(num);
//            if(Integer.valueOf(numStr.substring(0,2)) < 10){
//                result = 1;
//            }else if (Integer.valueOf(numStr.substring(0,2)) <= 25){
//                result = 2;
//            }else if (Integer.valueOf(numStr.substring(0,2)) <= 99){
//                result = 1;
//            }
            for (int i = 1; i < numStr.length(); i++) {
                if (numStr.charAt(i) > 5) result += 1;
                if (numStr.charAt(i) <= 5) result += 2;
            }
            return result;
        }
    }
    public static void main(String[] args) {
        String[] strs = new String[]{"flower","flow","flight"};
//        strs = new String[]{"dog","racecar","car"};
//        strs = new String[]{"c","c","c"};
//        strs = new String[]{"aa","ab","c"};
//        strs = new String[]{"aa","ab"};
//        strs = new String[]{"aa","aa"};
//        strs = new String[]{"ca","a"};

        int result = new BaShuZiFanYiChengZiFuChuanLcof().new Solution().translateNum(624);
        System.out.println("输出：" + result);
    }
}
