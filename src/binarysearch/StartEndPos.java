package binarysearch;

import java.util.*;

public class StartEndPos {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,5,5,6,7};
        int target = 5;
        int[] res=new int[2];
        res[0]=Pos(arr,target,true);
        res[1]=Pos(arr,target,false);
        System.out.println(Arrays.toString(res));
    }
    static int Pos(int[] arr, int target,boolean isFirst){
        int low=0,high=arr.length-1;
        int mid;
        int pos = -1;
        while(low<=high){
            mid=(low+high)/2;
            if(target == arr[mid]){
                pos = mid;
                if(isFirst){
                    high = mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else if(target < arr[mid]){
                high = mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return pos;
    }

}

