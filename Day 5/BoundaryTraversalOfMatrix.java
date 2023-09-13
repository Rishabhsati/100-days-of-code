import java.util.*;

public class BoundaryTraversalOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        m = sc.nextInt();
        n = sc.nextInt();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();

        boundaryTraversal(m, n, matrix);
        sc.close();
    }

    public static void boundaryTraversal(int m, int n, int[][] matrix) {

        // m -> rows
        // n -> columns

        // If any of arrows does not print anything, then we will stop and not print from further arrow

        boolean didFirstArrowPrinted = false;

        // PRINT FIRST ROW
        for(int i=0; i<n; i=i+1)
        {
            didFirstArrowPrinted = true;
            System.out.print(matrix[0][i] + " ");
        }

        if(didFirstArrowPrinted == true)
        {
            boolean didSecondArrowPrinted = false;

            // PRINT LAST COLUMN
            for(int i=1; i<m; i=i+1)
            {
                didSecondArrowPrinted = true;
                System.out.print(matrix[i][n-1] + " ");
            }

            if(didSecondArrowPrinted == true)
            {
                boolean didThirdArrowPrint = false;

                // PRINT LAST ROW
                for(int i=n-2; i>=0; i=i-1)
                {
                    didThirdArrowPrint = true;
                    System.out.print(matrix[m-1][i] + " ");
                }

                if(didThirdArrowPrint == true)
                {
                    // PRINT FIRST COLUMN
                    for(int i=m-2; i>=1; i=i-1)
                    {
                        System.out.print(matrix[i][0] + " ");
                    }
                }

            }


        }


    }
}


