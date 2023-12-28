package Graphs;

import java.util.*;

public class FloodFill{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] image = new int[n][m];
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                image[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();
        int y = sc.nextInt();
        int newColor = sc.nextInt();
        int[][] ans = floodFill(image, x, y, newColor);
        System.out.println("After the flood of new color");
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(j == m-1) {
                    System.out.print(ans[i][j] + "\n");
                }
                else {
                    System.out.print(ans[i][j] + " ");
                }
            }
        }
    }

    private static int[][] floodFill(int[][] image, int x, int y, int newColor) {
        int m = image.length;
        int n = image[0].length;
        int ini = image[x][y];
        int[][] ans = image;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(x,y));
        ans[x][y] = newColor;
        int drow[] = {-1,0,+1,0};
        int dcol[] = {0,+1,0,-1};
        while(q.size()>0){
            int currRow = q.peek().row;
            int currCol = q.peek().col;
            q.remove();
            for(int i=0;i<4;i++){
                int nrow = currRow + drow[i];
                int ncol = currCol + dcol[i];
                if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && ans[nrow][ncol]!=newColor && image[nrow][ncol]==ini){
                    q.add(new Pair(nrow, ncol));
                    ans[nrow][ncol] = newColor;
                }
            }
        }
        return ans;
    }
}

class Pair{
    int row,col;
    Pair(int r,int c){
        this.row = r;
        this.col = c;
    }
}