package leetcode.done;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    class Solution {
        public List<List<Integer>> generate(int numRows) {
            if(numRows == 0){
                return new ArrayList<>();
            }
            List<List<Integer>> result = new ArrayList<>();
            List<Integer> tmpList = new ArrayList<>();
            tmpList.add(1);
            result.add(tmpList);
            for (int i = 1; i < numRows; i++) {
                tmpList = generate(tmpList);
                result.add(tmpList);
            }
            return result;
        }
        public List<Integer> generate(List<Integer> numRows) {
            List<Integer> result = new ArrayList<>(numRows.size()+1);
            int init = 0;
            for (int i = 0; i < numRows.size(); i++) {
                if(i == 0){
                    result.add(init + numRows.get(i));
                }else{
                    result.add(numRows.get(i - 1) + numRows.get(i));
                }
            }
            result.add(1);
            return result;
        }
    }

    public static void main(String[] args) {

//        List<Integer> ss = new ArrayList<>();
//        ss.add(1);
//        ss.add(1);
////        ss.add(3);
////        ss.add(4);
////        ss.add(0);
////        ss.set(0,45);
//        List<Integer> ddd = generate(ss);
//        for (int i = 0; i < ddd.size(); i++) {
//            System.out.println(ddd.get(i));
//        }

        List<List<Integer>> generate = new PascalsTriangle().new Solution().generate(6);
        for (int j = 0; j < generate.size(); j++) {
            for (int i = 0; i < generate.get(j).size(); i++) {
                System.out.print(generate.get(j).get(i)+",");
            }
            System.out.println();
        }
    }
}
