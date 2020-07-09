package leetcode.done;

public class LongestCommonPrefix1 {
    class Solution {
        public String longestCommonPrefix(String[] strs) {
            if(strs == null || strs.length <= 0){
                return "";
            }
            String first = strs[0];
            for (int i = 1; i < strs.length; i++) {
                if(i == 2 && first.equals("")){
                    break;
                }
                String common = "";
                String next = strs[i];
                if(first.length() >= next.length()){
                    for (int j = 0; j < next.length(); j++) {
                        if(first.substring(0,j+1).equals(next.substring(0,j+1))){
                            common = first.substring(0,j+1);
                        }
                    }
                }else{
                    for (int j = 0; j < first.length(); j++) {
                        if(next.substring(0,j+1).equals(first.substring(0,j+1))){
                            common = first.substring(0,j+1);
                        }
                    }
                }
                first = common;
            }
            return first;
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

        String result = new LongestCommonPrefix1().new Solution().longestCommonPrefix(strs);
        System.out.println("输出：" + result);
    }
}
