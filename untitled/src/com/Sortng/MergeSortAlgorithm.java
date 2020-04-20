package com.Sortng;

import java.util.Arrays;

public class MergeSortAlgorithm {
    public static void main(String[] args){
        int arr[] = {9,45,76,23,47,1,5,11};
        int[] sortedNumbers = sort(arr);
        System.out.println(Arrays.toString(sortedNumbers));
    }
    public static int[] sort(int arr[]){
        return mergeSort(arr,0,arr.length-1);
    }

    public static int[] mergeSort(int[] numbers,int first,int last)
    {
        if(first<last){
            int mid = first+(last-first)/2;
            mergeSort(numbers,first,mid);
            mergeSort(numbers,mid+1,last);
            merge(numbers,first,mid,last);
        }
        return numbers;
    }

    public static int[] merge(int[] numbers,int left,int mid,int right){
        int l = left;
        int r = mid+1;
        int k = 0;
        int temp[] = new int[numbers.length];

        while(l<=mid && r<=right){
            if(numbers[l]>=numbers[r]) {
                temp[k] = numbers[l];
                k++;
                l++;
            }
            else {
                temp[k] = numbers[r];
                k++;
                r++;
            }
        }
        while(l<=mid){
            temp[k] =  numbers[l];
            k++;
            l++;
        }

        while(r<=right){
            temp[k] = numbers[r];
            k++;
            r++;
        }
        l=left;
        k=0;
        while (l <= right) {
            numbers[l] = temp[k];
            l++;
            k++;
        }
        return numbers;

    }
}
