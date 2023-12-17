package HeapDataStructure;

import java.util.*;
public class HeapSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        heapSort(arr, n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    // swap function to swap the values 
    private static void swap(int[] arr, int pi, int max) {
        int temp = arr[pi];
        arr[pi] = arr[max];
        arr[max] = temp;
    }

    // down heapify method to make the correct order of heap max one to sort array ascending order
    // private static void downHeapify(int[] arr, int pi, int limit) {
    //     int lci = pi*2 + 1; 
    //     int rci = pi*2 + 2;
    //     int max = pi;
    //     if(lci < limit && arr[lci]>arr[max]) max = lci; 
    //     if(rci < limit && arr[rci]>arr[max]) max = rci; 

    //     if(pi!=max){
    //         swap(arr,pi,max);
    //         downHeapify(arr, max, limit);
    //     }
    // }

    // down heapify method to make the correct order of heap here mini one to sort array in descending order 
    private static void downHeapify(int[] arr, int pi, int limit) {
        int lci = pi*2 + 1; 
        int rci = pi*2 + 2;
        int mini = pi;
        if(lci < limit && arr[lci]<arr[mini]) mini = lci; 
        if(rci < limit && arr[rci]<arr[mini]) mini = rci; 

        if(pi!=mini){
            swap(arr,pi,mini);
            downHeapify(arr, mini, limit);
        }
    }

    // to build max heap 
    private static void buildMAxHeap(int[] arr){
        for(int i=arr.length-1;i>=0;i--){
            downHeapify(arr,i,arr.length);
        }
    }

    private static void heapSort(int[] arr, int n) {
        buildMAxHeap(arr);
        for(int i=n-1;i>=0;i--){
            swap(arr, 0, i);
            downHeapify(arr, 0, i);
        }
    }
}
