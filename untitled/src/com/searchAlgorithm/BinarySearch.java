package com.searchAlgorithm;

public class BinarySearch {
    public static void main(String[] args) {
        char arr[] = {'a','b','c','d'};//2 3 4 5 8
        System.out.println(binarySearch(arr, 'd'));
        int index = binarySearch(arr,'d');
        char c =  arr[index];
        System.out.println(c);

    }

    public static int binarySearch(char arr[], char key) {
        int start = 0;
        int end = arr.length - 1;
        int count = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            //System.out.println(mid);
            if (key == arr[mid]) {
                return mid;
            }
            count ++;
            if (key < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return -1;
    }
}
