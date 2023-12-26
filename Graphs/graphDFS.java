package Graphs;

import java.util.*;

public class graphDFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        List<List<Integer>> ed = new ArrayList<>();
        for (int i = 0; i < e; i++) {
            List<Integer> l = new ArrayList<>();
            l.add(sc.nextInt());
            l.add(sc.nextInt());
            ed.add(l);
        }
        dfsTraversal(ed,n);
    }

    // Undirected graph
    public static void dfsTraversal(List<List<Integer>> Edges,int n){
        // creating graph
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        // adding n empty list in list of graph 
        for(int i=0;i<Edges.size();i++){
            graph.add(new ArrayList<Integer>());
        }
        // adding values in the empty graph
        for(int i=0;i<Edges.size();i++){
            int src = Edges.get(i).get(0);
            int dest = Edges.get(i).get(1);
            graph.get(src).add(dest);
            graph.get(dest).add(src);
        }

        boolean visited[] = new boolean[n];
        for(int i=0;i<n;i++){
            if(visited[i]==false){
                visited[i] = true;
                dfs(graph,visited,i);
            }
        }
        
    }
    // dfs method 
    public static void dfs(ArrayList<ArrayList<Integer>> graph, boolean[] visited,int src){
        visited[src] = true;
        System.out.print(src+" ");
        for(int v:graph.get(src)){
            if(visited[v]==false){
                visited[v] = true;
                dfs(graph, visited, v);
            }
        }
    }
}
