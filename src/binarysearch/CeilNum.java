package binarysearch;

public class CeilNum {
    public static void main(String[] args) {
        int target=10;
        int[] arr= {1,2,3,4,7,9,11};
        System.out.println("the ceil of the number is : "+ Ceiling(arr,target));
    }

    static int Ceiling(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int res=-1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > target) {
                res = arr[mid];
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return res;
    }
}