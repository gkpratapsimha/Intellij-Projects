package com.Sortng;

public class InsertionSort {
    public static void main(String[] args){
        int arr[] = {7,5,4,2,1,8};
        insertionSort(arr);
        for (int i=0;i<arr.length;i++)
            System.out.print(arr[i] + " ");
        System.out.println();

    }
    public static void insertionSort(int arr[]) {
        int i = 3;
        while (i < arr.length) {
            int j = i;
            while (j > 0 && arr[j - 1] >arr[j]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j = j - 1;
            }
            i = i + 1;

        }
    }
}
