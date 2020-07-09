package leetcode.done;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleIi {
    class Solution {
        public List<Integer> getRow(int rowIndex) {
            List<List<Integer>> result = new ArrayList<>();
            List<Integer> tmpList = new ArrayList<>();
            tmpList.add(1);
            result.add(tmpList);
            for (int i = 1; i <= rowIndex; i++) {
                tmpList = generate(tmpList);
                result.add(tmpList);
            }
            return result.get(result.size() - 1);
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

        List<Integer> generate = new PascalsTriangleIi().new Solution().getRow(3);
        for (int i = 0; i < generate.size(); i++) {
            System.out.print(generate.get(i)+",");
        }
    }
}
