import java.util.*;
public class TransposeOfMatrix {

    public static int[][] matrixTranspose(int[][] mat, int n) {
        //Write your code here
        int m = mat[0].length;
        int ans[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ans[j][i]=mat[i][j];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();
        int ans[][] = matrixTranspose(matrix,n);

        for(int i=0; i<n; i++)
        {   for(int j=0; j<n; j++)
        {
            System.out.print(ans[i][j] + " ");
        } System.out.println(" ");
        }
    }
}
