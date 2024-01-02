package Graphs;

import java.util.*;
public class NumOfDistinctIsland {

    private static String toString(int r,int c){
        return Integer.toString(r) + " " + Integer.toString(c);
    }
    public static void dfs(int[][] grid,boolean[][] visited,int row ,int col,ArrayList<String> list,int row0,int col0){
        visited[row][col] = true;
        list.add(toString(row-row0,col-col0));
        int m = grid.length;
        int n = grid[0].length;
        int drow[] = {-1,0,+1,0};
        int dcol[] = {0,+1,0,-1};
        for(int i=0;i<4;i++){
            int nrow = row + drow[i];
            int ncol = col + dcol[i];
            if(nrow<m && ncol<n && nrow>=0 && ncol>=0 && visited[nrow][ncol]==false && grid[nrow][ncol]==1){
                dfs(grid,visited,nrow,ncol,list,row0,col0);
            }
        }
    }
  public static int countDistinctIslands(int[][] grid) {
    // write your code here
      HashSet<ArrayList<String>> hset = new HashSet<>();
      int m = grid.length;
      int n = grid[0].length;
      boolean[][] visited = new boolean[m][n];
      for(int i=0;i<m;i++){
          for(int j=0;j<n;j++){
              if(visited[i][j]==false && grid[i][j]==1){
                  ArrayList<String> list = new ArrayList<>();
                  dfs(grid,visited,i,j,list,i,j);
                  hset.add(list);
              }
          }
      }
      return hset.size();
  }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[n][m];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int ans = countDistinctIslands(grid);
        System.out.println(ans);
    }
}

