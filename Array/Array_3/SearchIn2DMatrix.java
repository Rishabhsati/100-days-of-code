package Array_3;

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class SearchIn2DMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] mat = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat[i][j] = sc.nextInt();
            }
        }
        int t = sc.nextInt();
        int ans[] = BinarySearchIn2D(mat,t);
        System.out.println("element found at - ");
        System.out.print("row : " +ans[0]);
        System.out.println();
        System.out.print("col : " +ans[1]);
    }
    public static int[] BinarySearchIn2D(int[][] arr,int target){
        int start = 0;
        int end = arr[0].length-1;
        while(start<arr.length && end>=0){
            if(arr[start][end]>target){
                end--;
            }
            else if(arr[start][end]<target){
                start++;
            }
            else{
                return new int[]{start,end};
            }
        }
        return new int[]{-1,-1};
    }
}
