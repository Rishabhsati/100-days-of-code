package Graphs;

import java.util.*;

public class DetectCycleInDirectedGraph {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V, E;
        V = sc.nextInt();
        E = sc.nextInt();
        ArrayList<Integer>[] adj = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < E; i++) {
            int u, v;
            u = sc.nextInt();
            v = sc.nextInt();
            adj[u].add(v);
        }
        // Solution obj = new Solution();
        boolean ans = isCyclic(V, adj);
        if (ans == true) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        // FOR KAHN'S ALGO || BFS

        boolean ans2 = isCycle(V, adj);
        if (ans2 == true) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    private static boolean isCyclic(int v, ArrayList<Integer>[] adj) {
        boolean visited[] = new boolean[v];
        boolean recSt[] = new boolean[v];
        for(int i=0;i<v;i++){
            if(visited[i]==false){
                if(check(0, visited, recSt, adj)==true){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean check(int src ,boolean[] visited,boolean[] recSt,ArrayList<Integer>[] adj){
        visited[src] = true;
        recSt[src] = true;
        for(int dest:adj[src]){
            if(visited[dest] == false && check(dest, visited, recSt, adj)) return true;
            else if(recSt[dest]==true) return true;
        }
        recSt[src]=false;
        return false;
    }

    // USING KAHN'S ALGO || BFS  TO DETECT CYCLE 
    public static boolean isCycle(int V, ArrayList<Integer>[] adj) {
        // Your code here
            int count = 0;
            int indegree[] = new int[V];
            for(int i=0;i<V;i++){
                for(int x:adj[i]) indegree[x]++;
            }
            Queue<Integer> q = new LinkedList<>();
            for(int i=0;i<V;i++){
                if(indegree[i]==0) q.add(i);
            }
            while(q.size()>0){
                int u = q.poll();
                for(int v:adj[u]){
                    if(--indegree[v]==0) q.add(v);
                }
                count++;
            }
            return (count!=V);
       }
}
