package com.searchAlgorithm;

public class LinearSearch {
    public static void main(String[] args){
        int arr[] = {1,2,2,3,4,5,0};
        System.out.println("Key found at position : "+linearSearch(arr,4));
    }

    public static int linearSearch(int arr[],int key)
    {
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == key){
                return  i;
            }
        }
        return -1;
    }
}
