package leetcode.undone;

public class ImplementStrstr {
    class Solution {
        public int strStr(String haystack, String needle) {
            if(needle == null || "".equals(needle)){
                return 0;
            }
            for (int i = 0; i <= haystack.length() - needle.length(); i++) {
                if(needle.charAt(0) == haystack.charAt(i)){
                    boolean flag = true;
                    for (int j = 1; j < needle.length(); j++) {
                        if(needle.charAt(j) != haystack.charAt(i+j)){
                            flag = false;
                            break;
                        }
                    }
                    if (flag){
                        return i;
                    }
                }
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        String haystack = "aaaaa";
        String needle = "aas";
        int result = new ImplementStrstr().new Solution().strStr(haystack,needle);
        System.out.println("输出：" + result);
    }
}
















