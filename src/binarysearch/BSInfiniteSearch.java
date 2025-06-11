package binarysearch;

public class BSInfiniteSearch {

    public static void main(String[] args) {
        int target = 19;
        int[] arr = {1,2,4,5,8,11,12,13,14,15,19,21};
        System.out.println("The Target is at : " + BSinfArr(arr,target));
    }

    static int BSinfArr(int[] arr,int target){
        int low = 0;
        int high = 1;
        while(high<arr.length && target>arr[high]) {
            int newlow = high;
            high = high + (high - low + 1) * 2;
            low = newlow;
        }
        while(low<=high){
            int mid = (low+high) / 2;
            if(target == arr[mid]){
                return mid;
            }
            if(target < arr[mid]){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return -1;
    }

}

