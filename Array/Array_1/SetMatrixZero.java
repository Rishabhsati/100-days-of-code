package Array_1;

import java.util.ArrayList;
import java.util.Scanner;

public class SetMatrixZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        soln(matrix, row, col);
    }

    public static void soln(int[][] mat, int row, int col) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < row; i++) {
            boolean flag = false;
            for (int j = 0; j < col; j++) {
                if (mat[i][j] == 0) {
                    list.add(j);
                    flag = true;
                }
            }
            // to make entire row to zero
            if (flag) {
                for (int k = 0; k < col; k++) {
                    mat[i][k] = 0;
                }
            }
        }
        // to make every row of j index to zero
        for (int j : list) {
            for (int i = 0; i < row; i++) {
                mat[i][j] = 0;
            }
        }

        // for printing the answer
        System.out.println();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
