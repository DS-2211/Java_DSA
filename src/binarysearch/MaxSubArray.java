package binarysearch;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        int m=2;
        System.out.println("The max poss split sum is :" + SplitArray(arr,m));



    }
    static int SplitArray(int[] arr,int m){
        int start=0,end=0;
        for(int i=0;i<arr.length;i++){
            start = Math.max(start,arr[i]);
            end += arr[i];
        }
        while(start<end){
            int mid=(start+end)/2;
            int sum=0,count=1;
            for(int num : arr){
                if(sum+num > mid){
                    sum=num;
                    count++;
                }
                else{
                    sum+=num;
                }
            }
            if(count>m){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        return start;
    }



}

