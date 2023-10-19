//https://course.acciojob.com/idle?question=cdcb9e4d-fa09-4b0c-9e8e-2c23a7cf92ac
import java.util.*;
public class Buildings {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            max = Math.max(max, arr[i]);
        }
        sc.close();
        barGraph(arr, n);
    }

    public static void barGraph(int[] arr, int n) {
        // your code here

        int largest = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        int row = largest;
        int columns = n;

        for(int i=row;i>0;i--){
            for(int j=0;j<columns;j++){
                if(i<=arr[j]){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
