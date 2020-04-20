package com.prata;

public class ThirdLargestElement {
    public static void main(String[] args){
        int arr[] = {1,2};
        thirdMaxElement(arr);

    }
    public static void thirdMaxElement(int[] arr){
        int firstMax = Integer.MAX_VALUE,secondMax = Integer.MAX_VALUE,thirdMax = Integer.MAX_VALUE;
        for(int i =0;i<arr.length;i++){
            if(arr[i]<firstMax){
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = arr[i];
            }
            else if(arr[i]>firstMax && arr[i]<secondMax){
                thirdMax = secondMax;
                secondMax = arr[i];
            }
            else if(arr[i]>secondMax && arr[i] <thirdMax){
                thirdMax = arr[i];
            }
        }
        if(thirdMax!=Integer.MAX_VALUE){
            System.out.println(thirdMax);
        }
        else{
            System.out.println("No third Largest Element");
        }
    }
}
