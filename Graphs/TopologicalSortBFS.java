package Graphs;

import java.util.*;

public class TopologicalSortBFS {
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
        TopologicalSorting(adj,N);
    }
    // KHAN'S ALGORITHM 
    private static void TopologicalSorting(ArrayList<ArrayList<Integer>> adj, int n) {
        int indegree[] = new int[n];
        for(int i=0;i<n;i++){
            for(int x : adj.get(i)) indegree[x]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            if(indegree[i]==0) q.add(i);
        }
        while(q.size()>0){
            int curr = q.poll();
            System.out.print(curr+" ");
            for(int y:adj.get(curr)){
                if(--indegree[y]==0){
                    q.add(y);
                }
            }
        }
    }
}
