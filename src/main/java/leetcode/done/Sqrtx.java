package leetcode.done;

public class Sqrtx {
    class Solution {
        public int mySqrt(int x) {
            double d =  Math.sqrt(x);
//            Math.pow()
            return (int)d;
        }
    }
    public static void main(String[] args) {

        int result = new Sqrtx().new Solution().mySqrt(8);
        System.out.println("输出：" + result);
    }
}
