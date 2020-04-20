package com.stacksandHeaps;

import java.util.Scanner;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            stack.push(s.nextInt());
        printFifthElementFromEnd(stack);
    }
    public static void printFifthElementFromEnd(Stack<Integer> stack){
        if(stack.size()<5){
            System.out.println("There are no five elements in stack");
        }
        else{
            while(stack.size()>5){
                stack.pop();
        }
            System.out.println(stack.peek());


        }

    }
}
