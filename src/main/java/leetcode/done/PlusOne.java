package leetcode.done;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.GZIPInputStream;

public class PlusOne {
    class Solution {
        public int[] plusOne(int[] digits) {
            boolean flag = false;
            List<Integer> list = new ArrayList<>();
            for (int i = digits.length - 1; i >= 0; i--) {
                if(i == digits.length - 1){
                    if(digits[i] + 1 == 10){
                        if(digits.length == 1){
                            list.add(0);
                            list.add(1);
                        }else {
                            list.add(0);
                        }
                        flag = true;
                    }else {
                        list.add(digits[i] + 1);
                    }
                }else{
                    if(flag){
                        if(digits[i] + 1 == 10){
                            if(i == 0){
                                list.add(0);
                                list.add(1);
                            }else {
                                list.add(0);
                            }
                            flag = true;
                        }else {
                            list.add(digits[i] + 1);
                            flag = false;
                        }
                    }else{
                        list.add(digits[i]);
                    }
                }
            }
            int[] result = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                result[i] = list.get(list.size() - 1 - i);
            }
            return result;
        }
    }
    public static void main(String[] args) {
        int[] i = new int[]{9,9};
//        int[] i = new int[]{7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
        int[] result = new PlusOne().new Solution().plusOne(i);
        for (int j = 0; j < result.length; j++) {
            System.out.println(result[j]);
        }
    }
}








