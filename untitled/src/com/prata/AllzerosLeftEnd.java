package com.prata;

public class AllzerosLeftEnd {
    public static void main(String[] args) {
        int arr[] = {3, 4, 5, 6 - 1, 2, 0, 2, 4, 1, 0};
        zeros(arr);
        for(int i =0;i<arr.length;i++)
            System.out.print(arr[i] + " ");
    }
    public static void zeros(int[] arr){
        int j =0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[j++]= arr[i];
            }
        }
        for(int i =j;i<arr.length;i++){
            arr[i] = 0;
        }
    }
}
