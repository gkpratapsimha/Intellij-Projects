package com.stacksandHeaps;

public class Paraenthisis {
    public static void main(String[] args) throws Exception {
        System.out.println(match("{())}"));

    }
    public static boolean match(String paren) throws Exception {
        char[] ch = paren.toCharArray();
        int count1 = 0;
        int count2 = 0;
        for (char c : ch) {
            if (c == '(') {
                count1++;
            } else if (c == ')') {
                if (count1 > 0) {
                    count1--;
                } else if (c == '{') {
                    count2++;
                } else if (c == '}') {
                    if (count2 > 0) {
                        count2--;
                    } else {
                        return false;
                    }
                }
            }
        }
        if(count1==0 && count2==0) {
            return true;
        }
        else{
            return false;
        }

    }

}
