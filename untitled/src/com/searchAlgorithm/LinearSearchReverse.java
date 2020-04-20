package com.searchAlgorithm;

import java.util.Scanner;

public class LinearSearchReverse {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int i;
        int count = input.nextInt();
        int array[] = new int[count];
        for (i = 0; i < count; i++) {
            array[i] = input.nextInt();
        }
        int key = input.nextInt();
        input.close();
        int result = 0;
        for( int i1 = array.length-1;i1>=0;i1--){
            if(array[i1]==key){
               result = (count-1)-i1;
            }

        }
        if(result>=0){
            System.out.println(result);
        }

    }
}
