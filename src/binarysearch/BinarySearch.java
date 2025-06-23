package binarysearch;

import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        int target = 32;
        int[] arr = { 1,2,4,6,14,32,34,56,67,88,89};
        int ind = Binarys(target,arr);
        if(ind!=-1) {
            System.out.println("the target is present at "+ind);
        }
        else{
            System.out.println("target is not present");
        }
        int index=Arrays.binarySearch(arr,target);
        System.out.println("the target is at "+index);
    }




    public static int Binarys(int target, int[] arr) {
        int low = 0;
        int high = arr.length-1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (target == arr[mid]) {
                return mid;
            } else {
                if (target < arr[mid]) {
                    high = mid-1;
                } else {
                    low = mid+1;
                }
            }
        }
        return -1;
    }
}

