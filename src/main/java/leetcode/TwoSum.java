package leetcode;

class TwoSum {
    public static void main(String[] args) {
        System.out.print("a/b".replaceAll("\\/","_"));

    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        boolean flag = false;
        for(int i=0;i<nums.length;i++){
            if(flag){
                break;
            }
            for (int j = i+1; j < nums.length; j++) {
                if(flag){
                    break;
                }
                if((nums[i] + nums[j]) == target){
                    result[0] = i;
                    result[1] = j;
                    flag = true;
                }
            }

        }
        return result;
    }
}