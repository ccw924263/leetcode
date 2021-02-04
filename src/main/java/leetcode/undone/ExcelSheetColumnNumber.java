package leetcode.undone;

public class ExcelSheetColumnNumber {
    class Solution {
        public int titleToNumber(String s) {
            int sum = 0;
            for (int i = s.length() - 1; i >= 0; i--) {
                int num = s.charAt(i) - 'A' + 1;
                sum += num * Math.pow(26,s.length() - 1 - i);
            }
            return sum;
        }
    }
    public static void main(String[] args) {
        String s = "AB";
        int result = new ExcelSheetColumnNumber().new Solution().titleToNumber(s);
        System.out.println("输出：" + result);
    }
}
