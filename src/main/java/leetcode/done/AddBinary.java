package leetcode.done;

public class AddBinary {
    class Solution {
        public String addBinary(String a, String b) {
            if("0".equals(a)){
                return b;
            }
            if ("0".equals(b)){
                return a;
            }
            int aLength = a.length(),bLength = b.length();
            if(aLength < bLength){
                return addBinary(b,a);
            }
            StringBuilder sb = new StringBuilder();
            boolean isAdd = false;
            for (int i = bLength - 1; i >= 0; i--) {
                if(isAdd){
                    if(Integer.valueOf(a.substring(i + aLength-bLength,i + aLength-bLength+1)) + Integer.valueOf(b.substring(i,i+1)) + 1 >= 2){
                        isAdd = true;
                        if(Integer.valueOf(a.substring(i + aLength-bLength,i + aLength-bLength+1)) + Integer.valueOf(b.substring(i,i+1)) + 1 == 2){
                            sb.append(0);
                        }else {
                            sb.append(1);
                        }
                    }else{
                        sb.append(Integer.valueOf(a.substring(i + aLength-bLength,i + aLength-bLength+1)) + Integer.valueOf(b.substring(i,i+1)) + 1);
                        isAdd = false;
                    }
                }else{
                    if(Integer.valueOf(a.substring(i + aLength-bLength,i + aLength-bLength+1)) + Integer.valueOf(b.substring(i,i+1)) == 2){
                        isAdd = true;
                        sb.append(0);
                    }else{
                        sb.append(Integer.valueOf(a.substring(i + aLength-bLength,i + aLength-bLength+1)) + Integer.valueOf(b.substring(i,i+1)));
                        isAdd = false;
                    }
                }
                if(isAdd && i == 0){
                    sb.append(1);
                }
            }
            if(aLength == bLength){
                sb.reverse();
                return sb.toString();
            }
            if(sb.toString().length() == bLength){
                sb.reverse();
                return a.substring(0,aLength - bLength) + sb.toString();
            }
            isAdd = false;
            for (int i = aLength - bLength - 1; i >= 0; i--) {
                int num = Integer.valueOf(a.substring(i,i+1));
                if(i == aLength - bLength - 1){
                    num = num + Integer.valueOf(sb.substring(sb.length() - 1,sb.length()));
                    if(num == 2){
                        isAdd = true;
                        sb.deleteCharAt(sb.length() - 1).append(0);
                    }else{
                        sb.deleteCharAt(sb.length() - 1).append(num);
                        isAdd = false;
                    }
                }else{
                    if(isAdd){
                        if(num + 1 == 2){
                            isAdd = true;
                            sb.append(0);
                        }else{
                            sb.append(num + 1);
                            isAdd = false;
                        }
                    }else{
                        sb.append(num);
                    }
                }
                if(isAdd && i == 0){
                    sb.append(1);
                }
            }
            return sb.reverse().toString();
        }
    }
    public static void main(String[] args) {
        String a = "11";
        String b = "1001";
        String result = new AddBinary().new Solution().addBinary(a,b);
        System.out.println("输出：" + result);
    }
}


















