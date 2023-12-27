package Graphs;

import java.util.*;

public class TopologicalSortDFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, E;
        N = sc.nextInt();
        E = sc.nextInt();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i =0; i<N; i++) adj.add(new ArrayList<Integer>());    
        for(int i =0; i<E; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj.get(u).add(v);
        } 
        TopologicalSortingdfs(adj,N);
    }

    private static void TopologicalSortingdfs(ArrayList<ArrayList<Integer>> adj, int n) {
        boolean visited[] = new boolean[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            if(visited[i]==false) dfs(adj,i,st,visited);
        }
        while(st.size()>0){
            System.out.print(st.pop()+" ");
        }
    }

    private static void dfs(ArrayList<ArrayList<Integer>> adj, int src, Stack<Integer> st, boolean[] visited) {
        visited[src] = true;
        for(int x:adj.get(src)){
            if(visited[x]==false){
                dfs(adj,x, st, visited);
            }
        }
        st.push(src);
    }
}
