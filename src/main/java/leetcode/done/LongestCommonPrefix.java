package leetcode.done;

import java.util.ArrayList;
import java.util.List;

public class LongestCommonPrefix {
    class Solution {
        public String longestCommonPrefix(String[] strs) {
            if(strs == null || strs.length <= 0){
                return "";
            }
            if(strs.length == 1){
                return strs[0];
            }
            String first = strs[0];
            for (int i = 1; i < strs.length; i++) {
                List<String> list = new ArrayList<>();
                if(i == 2 && first.equals("")){
                    break;
                }
                String next = strs[i];
                //TODO first与next相同部分，赋值给common
                for (int j = 0; j < first.length(); j++) {
                    String common = "";
                    if(!next.contains(first.substring(j,j+1))){
                        continue;
                    }else{
                        boolean flag = false;
                        common = first.substring(j,j+1);
                        for (int k = j + 1; k < first.length(); k++) {
                            if(flag){
                                break;
                            }
                            if(next.contains(first.substring(j,k+1))){
                                common = first.substring(j,k+1);
                            }else flag = true;
                        }
                    }
                    if(!"".equals(common)){
                        list.add(common);
                    }
                }
                if(list.size() > 0 && list.size() == 1){
                    first = list.get(0);
                }else if (list.size() > 1){
                    int firstLength = list.get(0).length();
                    int count = 0;
                    for (int j = 1; j < list.size(); j++) {
                        int nextLength = list.get(j).length();
                        if(nextLength > firstLength){
                            count = j;
                        }
                    }
                    first = list.get(count);
                }else first = "";
            }
            return first;
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

        String result = new LongestCommonPrefix().new Solution().longestCommonPrefix(strs);
        System.out.println("输出：" + result);
    }
}
