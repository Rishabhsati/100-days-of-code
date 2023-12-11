package Array_4;

import java.util.Scanner;

public class MazePathCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // int[][] nums = new int[n][m];
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         nums[i][j] = sc.nextInt();
        //     }
        // }
        int count = pathCount(m,n);
        System.out.println("number of unique paths : "+count);
    }

    private static int pathCount(int m,int n) {
        int N = m+n-2;
        int r = m-1;
        long ans = 1;
        for(int i=1;i<=r;i++){
            ans = ans * (N-r+i)/i;
        }
        return (int)ans;
    }
}
