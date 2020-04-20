package com.Sortng;

public class BubbleSort {
    public static void main(String args[]){
        int arr[] ={13, 3242, 23, 2351, 352, 3915, 123, 32, 1, 5, 0};
        bubbleSot(arr);
        for(int i =0;i<arr.length;i++)
            System.out.print(arr[i] + " ");
        System.out.println();

    }
    public static void bubbleSot(int[] arr){
        for(int i =0;i<arr.length;i++){
            for(int j = 1;j<arr.length-i;j++){
                if(arr[j-1]>arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
