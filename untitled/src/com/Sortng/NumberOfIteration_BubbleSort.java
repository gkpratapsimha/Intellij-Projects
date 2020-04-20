package com.Sortng;

import java.util.Scanner;

public class NumberOfIteration_BubbleSort {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int iteration = input.nextInt();
        int size = input.nextInt();
        int arr[] = new int[size];
        for(int i =0;i<size;i++)
            arr[i] = input.nextInt();
        System.out.println(NumberOfSwaps(arr,iteration));
    }

    public static int NumberOfSwaps(int arr[],int M){
        int totalSwaps = 0;
        for(int i =0;i<M;i++){
            for(int j =1;j<(arr.length-i);j++){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                totalSwaps++;
            }
        }
        return totalSwaps;
    }
}
