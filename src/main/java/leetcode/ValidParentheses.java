package leetcode;

import java.util.*;

public class ValidParentheses {
    class Solution {
        public boolean isValid(String s) {
            if(s == null){
                return false;
            }
            if("".equals(s)){
                return true;
            }
            if(s.length() % 2 == 1){
                return false;
            }
            Deque<Character> stack = new ArrayDeque<>(s.length());
            for(int i = 0;i<s.length();i++){
                char c = s.charAt(i);
                if(c == '(' || c == '{' || c == '['){
                    stack.add(c);
                }else if(c == ')' && stack.peekLast() != null && stack.peekLast() == '('){
                    stack.removeLast();
                }else if(c == ']' && stack.peekLast() != null && stack.peekLast() == '['){
                    stack.removeLast();
                }else if(c == '}' && stack.peekLast() != null && stack.peekLast() == '{'){
                    stack.removeLast();
                }else{
                    return false;
                }
            }
            return stack.isEmpty();
        }
    }
    public static void main(String[] args) {
//        String strs = "[)";
//
//        boolean result = new ValidParentheses().new Solution().isValid(strs);
//        System.out.println("输出：" + result);
        int n = 100;
        n = fun(n);
        System.out.println(n);
    }

    private static int fun( int n) {
        if(n == 0 || n < 0){
            return 0;
        }
        //f(n) = n + f(n-1)
        return n + fun(n-1);
    }

}
