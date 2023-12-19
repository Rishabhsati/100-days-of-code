package Backtracking;

import java.util.Scanner;

public class FloodFill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int mat[][] = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j] = sc.nextInt();
            }
        }
        boolean visited[][] = new boolean[m][n];
        pathFinder(0, 0, mat, "", m, n,visited);
    }
    public static void pathFinder(int i,int j,int[][] mat,String psf,int m,int n,boolean[][] visited){
        if(i<0 || j<0 || i>=m || j>=n || mat[i][j] == 1 || visited[i][j]==true){
            return;
        }
        if(i==m-1 && j==n-1){
            System.out.println(psf);
            return;
        }
        // tldr
        visited[i][j] = true;
        pathFinder(i-1,j,mat,psf+"t",m,n,visited);
        pathFinder(i,j-1,mat,psf+"l",m,n,visited);
        pathFinder(i+1,j,mat,psf+"d",m,n,visited);
        pathFinder(i,j+1,mat,psf+"r",m,n,visited);
        visited[i][j]=false;
    }
}
