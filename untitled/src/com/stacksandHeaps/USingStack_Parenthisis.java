package com.stacksandHeaps;

import java.util.Stack;

public class USingStack_Parenthisis {
    static Stack<Character> mystack = new Stack<>();

    public static void main(String[] args) {
        System.out.println(match1("(()())"));

    }
    public static boolean match1(String paren){
        char[] ch = paren.toCharArray();
        for(char c : ch){
            if(c == '('){
                mystack.push('(');
            }
            else if(c == ')'){
                if(!mystack.isEmpty()){
                    mystack.pop();
                }
                else{
                    return false;
                }
            }
            else{
                System.out.print("Invalid");
            }
        }
        if(mystack.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}
