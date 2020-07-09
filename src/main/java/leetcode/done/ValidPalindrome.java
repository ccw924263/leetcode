package leetcode.done;

public class ValidPalindrome {
    class Solution {
        public boolean isPalindrome(String s) {
            char leftC = ',',rightC = ',';
            int left = 0,right = s.length() - 1;
            for (int i = left; i < s.length(); i++) {
                if(left > right){
                    break;
                }
                leftC = s.charAt(i);
                if(('0' <= leftC && '9' >= leftC) || ('A' <= leftC && 'Z' >= leftC) || ('a' <= leftC && 'z' >= leftC)){
                    if('A' <= leftC && 'Z' >= leftC){
                        leftC = (char) (leftC + 32);
                    }
                }else{
                    continue;
                }
                for (int j = right; j >= i; j--) {
                    rightC = s.charAt(j);
                    if(('0' <= rightC && '9' >= rightC) || ('A' <= rightC && 'Z' >= rightC) || ('a' <= rightC && 'z' >= rightC)){
                        if('A' <= rightC && 'Z' >= rightC){
                            rightC = (char) (rightC + 32);
                        }
                        right = j - 1;
                        break;
                    }else{
                        continue;
                    }
                }
                if(leftC != rightC){
                    return false;
                }
                left = i + 1;
            }
            return true;
        }
    }
    public static void main(String[] args) {
        String s = "race a car";
        System.out.println(s.length());
        boolean result = new ValidPalindrome().new Solution().isPalindrome(s);
        System.out.println(result);
    }
}
