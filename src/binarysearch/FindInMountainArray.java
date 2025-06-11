package binarysearch;

public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,8,4,1};
        int target = 4;
        int low=0,high=arr.length-1;
        while(low<high){
            int mid= (low+high)/2;
            if(arr[mid]<arr[mid+1]){
                low = mid+1;
            }
            else{
                high = mid;
            }
        }
        int peak = low;
        int resl = Findl(arr,target,peak);
        if(resl != -1){
            System.out.println("the ele is found at : " + resl);
        }
        else{
            System.out.println("the ele is found at : " + FindR(arr,target,peak));
        }
    }
    private static int Findl(int[] arr, int target, int peak) {
        int start = 0, end = peak;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    private static int FindR(int[] arr, int target, int peak) {
        int start = peak, end = arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;            }
        }
        return -1;
    }
}

