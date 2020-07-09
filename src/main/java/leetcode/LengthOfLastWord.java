package leetcode;

import leetcode.done.CountAndSay;

public class LengthOfLastWord {
    class Solution {
        public int lengthOfLastWord(String s) {
            if(s == null){
                return 0;
            }
            String[] strArr = s.split(" ");
            return strArr.length == 0 ? 0 : (strArr.length == 1 ? strArr[0].length() :
                    " ".equals(strArr[strArr.length - 1]) ? 0 :
                            strArr[strArr.length - 1].length());
        }
    }
    public static void main(String[] args) {
        String[] strs = new String[]{"flower","flow","flight"};

        int result = new LengthOfLastWord().new Solution().lengthOfLastWord(" ");
        System.out.println("输出：" + result);
    }
}
