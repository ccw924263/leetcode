package leetcode.done;

public class ReverseInteger {
    class Solution {
        public int reverse(int x) {
            int MAX = Integer.MAX_VALUE;
            int MIN = Integer.MIN_VALUE;
            if(x > MAX || x < MIN){
                return 0;
            }
            StringBuilder sb = new StringBuilder();
            if(x < 0){
                sb.append("-");
                x *= -1;
            }
            String str = String.valueOf(x);
            for (int i = str.length() - 1; i >= 0; i--) {
                sb.append(str.substring(i,i+1));
            }
            try {
                return Integer.valueOf(sb.toString());
            } catch (NumberFormatException e) {
                return 0;
            }
        }
    }

    public static void main(String[] args) {
        int result = new ReverseInteger().new Solution().reverse(-123);
        System.out.println(result);
    }
}
