package Graphs;

import java.util.*;

class Pair{
    int u,v,tm;
    Pair(int r,int c,int t){
        this.u = r;
        this.v = c;
        this.tm = t;
    }
}
public class RottingOranges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[n][m];
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        orangesRotting(grid);
    }

    public static void orangesRotting(int[][] grid) {
        // m = number of row in the grid
        int m = grid.length;
        // n = number of col in the grid
        int n = grid[0].length;

        // creating a queue for storing the (row,col) and time taken of rotting orange
        Queue<Pair> q = new LinkedList<>();
        // visited array created to check that this index is checked or not 
        int visited[][] = new int[m][n];

        int freshCnt=0; // for the fresh oranges count 
        // adding all the initial rotting oranges index in the queue and mark them visited
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    q.add(new Pair(i,j,0));
                    visited[i][j] = 2;
                }
                else visited[i][j] = 0;
                if(grid[i][j]==1) freshCnt++; 
            }
        }
        int tm = 0;
        int drow[] = {-1,0,+1,0};
        int dcol[] = {0,+1,0,-1};
        int cnt = 0;
        // Applying BFS 
        while(q.size()>0){
            int r = q.peek().u;
            int c = q.peek().v;
            int t = q.peek().tm;
            tm = Math.max(tm,t);
            q.remove();
            for(int i=0;i<4;i++){
                int nrow = r + drow[i];
                int ncol = c + dcol[i];
                if(nrow<m && nrow>=0 && ncol<n && ncol>=0 && visited[nrow][ncol]==0 && grid[nrow][ncol]==1){
                    q.add(new Pair(nrow,ncol,t+1));
                    visited[nrow][ncol] = 2;
                    grid[nrow][ncol] = 2;
                    cnt++;
                }
            }
        }
        if(cnt == freshCnt) System.out.println("Time taken to rot all the nbr oranges : " + tm);
        else System.out.println("Its not possible to rot all the fresh oranges");
    }
}
