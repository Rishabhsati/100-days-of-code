import java.util.*;
class Solution {
    public void printMultiplication(int[][] matrix1,int[][] matrix2,int n) {
        //Write code here and print output

        // A -> n * n
        // B -> n * n
        int result[][] = new int[n][n];

        for(int i=0; i<n; i=i+1)
        {
            for(int j=0; j<n; j=j+1)
            {
                // what is the value of result[i][j]
                // result[i][j] = matrix1[i][0] * matrix2[0][j] + matrix1[i][1] * matrix2[1][j] ...

                int sum = 0;

                // STEP 1: i=0, j=0
                // k=0, sum = 0 + matrix1[0][0] * matrix2[0][0] = 0 + 1 * 1 = 1
                // k=1, sum = 1 + matrix1[0][1] * matrix2[1][0] = 1 + 2*3 = 7
                for(int k=0; k<n; k=k+1)
                {
                    sum = sum + matrix1[i][k] * matrix2[k][j];
                }

                // i=0, j=0, result[0][0] = 7
                result[i][j] = sum;
            }
        }

        for(int i=0; i<n; i=i+1)
        {
            for(int j=0; j<n; j=j+1)
            {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class ArrayMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n;
            n = sc.nextInt();
            int[][] matrix1 = new int[n][n];
            int[][] matrix2 = new int[n][n];

            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++)
                    matrix1[i][j] = sc.nextInt();

            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++)
                    matrix2[i][j] = sc.nextInt();

            Solution Obj = new Solution();
            Obj.printMultiplication(matrix1,matrix2,n);
        }
        sc.close();
    }
}