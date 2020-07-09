package leetcode.done;

/**
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 */
public class CountAndSay {
    class Solution {
        public String countAndSay(int n) {
            String temp = "1";
            for (int i = 2; i <= n; i++) {
                StringBuilder result = new StringBuilder();
                boolean flag = true;
                for (int j = 0; j < temp.length(); j++) {
                    for (int k = j + 1; k < temp.length(); k++) {
                        if (temp.charAt(k) != temp.charAt(j)){
                            result.append(k - j).append(temp.charAt(j));
                            if(k == temp.length() - 1){
                                result.append("1").append(temp.charAt(k));
                            }
                            j = k - 1;
                            flag = false;
                            break;
                        }else{
                            if(k == temp.length() - 1 && !flag){
                                result.append(k - j + 1).append(temp.charAt(j));
                            }
                        }
                    }
                }
                if(flag){
                    result.append(temp.length()).append(temp.charAt(0));
                }
                temp = result.toString();
            }
            return temp;
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

        String result = new CountAndSay().new Solution().countAndSay(7);
        System.out.println("输出：" + result);
    }
}
