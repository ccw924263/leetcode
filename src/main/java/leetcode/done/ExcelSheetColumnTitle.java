package leetcode.done;

public class ExcelSheetColumnTitle {
    class Solution {
        public String convertToTitle(int n) {
            if(n <= 0){
                return "";
            }
            StringBuilder res = new StringBuilder();
            while(n > 26){
                n--;
                char mod = (char)('A' + (n % 26));
                n = n / 26;
                res.append(mod);
            }
            n--;
            res.append((char)('A' + n));
            return res.reverse().toString();
        }
    }
    public static void main(String[] args) {
        String result = new ExcelSheetColumnTitle().new Solution().convertToTitle(24568);
        System.out.println("输出：" + result);
    }
}



















