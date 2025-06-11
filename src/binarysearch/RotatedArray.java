package binarysearch;

public class RotatedArray {

    public static void main(String[] args) {
        int target = 8;
        int[] arr ={4,5,6,7,7,7,8,8,9,0,1,2};
        int pivot;
        int low=0,high=arr.length-1;

        while(low<high){
            int mid=(low+high)/2;
            if(arr[mid]>arr[high]){
                low=mid+1;
            }
            else if (arr[mid] <arr[high]){
                high = mid;
            }
            else{
                high--;
            }
        }
        pivot = low;
        System.out.println("The target is at : "+FindR(arr,target,pivot));
        System.out.println(pivot);
    }

    static int FindR(int[] arr,int target,int pivot){
        int low,high;
        if(target >= arr[pivot] && target <= arr[arr.length-1] ){
            low = pivot;
            high = arr.length-1;
        }
        else{
            low=0;
            high = pivot - 1 ;
        }
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid]<target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return -1;
    }
}
