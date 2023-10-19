package Recursion;

import java.util.Scanner;

public class BinarySearchUsingRecursion {

    static int binarysearch(int[] arr , int s , int e , int target){
        if(s>e){
            return -1;
        }
        int mid = (s+e)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]>target){
            return binarysearch(arr,s,mid-1,target);
        }
        return binarysearch(arr,mid+1,e,target);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = sc.nextInt();
        System.out.println(binarysearch(arr,0,arr.length,target));
    }
}
