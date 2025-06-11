package binarysearch;

public class FindPeak {

    static int findPeak(int[] arr){
        int low = 0;
        int high = arr.length - 1;
        while(low<high){
            int mid = (low+high)/2;
            if(arr[mid]<arr[mid+1]){
                low = mid+1;
            }
            else{
                high = mid;
            }
        }
        return arr[low];
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,5,7,3,2};
        System.out.println("Peak element is : " + findPeak(arr));
    }

}
