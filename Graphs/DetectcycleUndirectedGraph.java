package Graphs;

import java.util.*;

public class DetectcycleUndirectedGraph {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, E;
        N = sc.nextInt();
        E = sc.nextInt();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i =0; i<N; i++) adj.add(i, new ArrayList<Integer>());    
        for(int i =0; i<E; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        boolean ans = isCycle(N,adj);
        if(ans)
            System.out.println("contain cycle");
        else
            System.out.println("Does not contain cycle");
    }
    
    private static boolean isCycle(int n, ArrayList<ArrayList<Integer>> adj) {
        boolean visited[] = new boolean[n];
        for(int i=0;i<n;i++){
            if(visited[i]==false){
                if(check(adj,i,visited,-1)==true) return true;
            }
        }
        return false;
    }
    // here we are using dfs to detect the cycle 

    private static boolean check(ArrayList<ArrayList<Integer>> adj, int src, boolean[] visited, int parent) {
        visited[src] = true;
        for(int v:adj.get(src)){
            if(visited[v]==false){
                if(check(adj,v,visited,src)==true) return true;
            }
            else if(v!=parent) return true;
        }
        return false;
    }
}
