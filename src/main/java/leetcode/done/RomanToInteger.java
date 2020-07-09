package leetcode.done;

public class RomanToInteger {
    class Solution {
        public int romanToInt(String s) {
//            1,5,10,50,100,500,1000
//            I， V， X， L，C，D 和 M
            if(s.equals("IV")){
                return 4;
            }
            if(s.equals("IX")){
                return 9;
            }
            if(s.equals("XL")){
                return 40;
            }
            if(s.equals("XC")){
                return 90;
            }
            if(s.equals("CD")){
                return 400;
            }
            if(s.equals("CM")){
                return 900;
            }
            int num = 0;
            //I,X,C
            for (int i = 0; i < s.length(); i++) {
                if (i <= s.length() - 2) {
                    if (s.substring(i, i + 1).equals("M")) {
                        num += 1000;
                    }
                    if (s.substring(i, i + 1).equals("D")) {
                        num += 500;
                    }
                    if (s.substring(i, i + 1).equals("C")) {
                        if(s.substring(i+1,i+2).equals("D")){
                            num += 400;
                            i++;
                        }else if(s.substring(i+1,i+2).equals("M")){
                            num += 900;
                            i++;
                        }else{
                            num += 100;
                        }
                    }
                    if (s.substring(i, i + 1).equals("L")) {
                        num += 50;
                    }
                    if (s.substring(i, i + 1).equals("X")) {
                        if(s.substring(i+1,i+2).equals("L")){
                            num += 40;
                            i++;
                        }else if(s.substring(i+1,i+2).equals("C")){
                            num += 90;
                            i++;
                        }else{
                            num += 10;
                        }
                    }
                    if (s.substring(i, i + 1).equals("V")) {
                        num += 5;
                    }
                    if (s.substring(i, i + 1).equals("I")) {
                        if(s.substring(i+1,i+2).equals("V")){
                            num += 4;
                            i++;
                        }else if(s.substring(i+1,i+2).equals("X")){
                            num += 9;
                            i++;
                        }else{
                            num += 1;
                        }
                    }
                } else {
                    if(s.substring(i,i+1).equals("M")){
                        num += 1000;
                    }
                    if(s.substring(i,i+1).equals("D")){
                        num += 500;
                    }
                    if(s.substring(i,i+1).equals("C")){
                        num += 100;
                    }
                    if(s.substring(i,i+1).equals("L")){
                        num += 50;
                    }
                    if(s.substring(i,i+1).equals("X")){
                        num += 10;
                    }
                    if(s.substring(i,i+1).equals("V")){
                        num += 5;
                    }
                    if(s.substring(i,i+1).equals("I")){
                        num += 1;
                    }
                }
            }
            return num;
        }
    }
}
