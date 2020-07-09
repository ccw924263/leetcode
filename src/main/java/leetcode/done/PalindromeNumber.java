package leetcode.done;

public class PalindromeNumber {
    class Solution {
        public boolean isPalindrome(int x) {
            if (x < 0) return false;
            if (x == 0) return true;
            String numStr = String.valueOf(x);
            StringBuilder sb = new StringBuilder();
            for (int i = numStr.length() - 1; i >= 0; i--) {
                sb.append(numStr.substring(i,i+1));
            }
            int num = 0;
            try {
                num = Integer.valueOf(sb.toString());
                if (num == x) return true;
                return false;
            } catch (NumberFormatException e) {
                return false;
            }
        }
    }
}
