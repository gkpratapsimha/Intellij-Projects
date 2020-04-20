package com.Sortng;

public class SelectionSort {
    public static void main(String[] args){
        int arr[] = {7,5,4,2,1};
        selectionSort(arr);

    }
    public static void selectionSort(int arr[]){
        for(int i =0;i<arr.length;i++){
             int min = i;
             for(int j = i+1;j<arr.length;j++){
                 if(arr[j]<arr[min])
                     min = j;
                 int temp = arr[min];
                 arr[min] = arr[i];
                 arr[i] = temp;
             }
        }
        for(int i =0;i<arr.length;i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
