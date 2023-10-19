//https://course.acciojob.com/idle?question=e0b796ef-2562-4a35-a728-c23b93d988c1
import java.util.*;
public class FindSplitPoint {
    static void findSplitPoint(int arr[], int n) {

        // Find totalSum
        int totalSum = 0;
        for(int i=0; i<n; i=i+1)
        {
            totalSum = totalSum + arr[i];
        }

        // ASSUMPTION METHOD
        boolean isSplitPresent = false;

        int greenPartSum = 0;
        for(int i=0; i<n-1; i=i+1)
        {
            greenPartSum = greenPartSum + arr[i];
            int redPartSum = totalSum - greenPartSum;

            if(greenPartSum == redPartSum)
            {
                isSplitPresent = true;

                // PRINT first part (GREEN PART) of the array
                for(int j=0; j<=i; j=j+1)
                {
                    System.out.print(arr[j] + " ");
                }

                System.out.println();

                // PRINT second part (RED PART) of the array
                for(int j=i+1; j<n; j=j+1)
                {
                    System.out.print(arr[j] + " ");
                }

                // we found out the split point, so we can stop the loop
                break;
            }
        }

        if(isSplitPresent == false)
        {
            System.out.println("Not Possible");
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        findSplitPoint(arr, n);

    }
}
