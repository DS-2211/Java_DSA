package binarysearch;

import java.util.Arrays;

public class SearchMatriceOne {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int target =9;
        System.out.println("Target found at : " + Arrays.toString(Search(arr,target)));
    }
    static int[] Search(int[][] arr,int target){
        int row = 0;
        int col = arr.length -1;

        while(row<arr.length && col>=0){
            if(arr[row][col] == target){
                return new int[]{row,col};
            }
            if(arr[row][col] > target){
                col--;
            }
            else{
                row++;
            }
        }
        return new int[]{-1,-1};
    }
}

