package com.Sortng;

import com.sun.source.tree.ClassTree;

public class QuickSortAlgorithm {
    public static void main(String[] args){
        int arr[] = {9,45,76,23,47,1,5,11};
        quickSort(arr,0,arr.length-1);
        for(int i =0;i<arr.length;i++)
            System.out.print(arr[i] + " ");
        System.out.println();

    }
    public static void quickSort(int arr[],int start,int end) {
        if (start < end) {
            int p = partition(arr,start,end);
            quickSort(arr,0,p-1);
            quickSort(arr,p+1, end);

        }
    }
    public static int partition(int arr[],int first,int last){
        int pivot = arr[last];
        int P = first;
        for(int i =first;i<last;i++){
            if(arr[i]<pivot){
                int temp = arr[i];
                arr[i] = arr[P];
                arr[P] = temp;
                P++;
            }
        }
        int temp2 = arr[P];
        arr[P] = arr[last];
        arr[last] = temp2;

        return P;
    }

}
