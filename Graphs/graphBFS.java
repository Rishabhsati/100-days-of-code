package Graphs;

import java.util.*;

public class graphBFS {
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
        bfsTraversal(ed,n);
    }

    private static void bfsTraversal(List<List<Integer>> ed, int n) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < ed.size(); i++) {
            graph.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < ed.size(); i++) {
            int src = ed.get(i).get(0);
            int dest = ed.get(i).get(1);
            graph.get(src).add(dest);
        }
        boolean visited[] = new boolean[n];
        for (int i = 0; i < visited.length; i++) {
            if(visited[i]==false){
                bfs(graph,i,visited);
            }
        }
    }

    private static void bfs(ArrayList<ArrayList<Integer>> graph, int src,boolean[] visited) {
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        visited[src] = true;
        while(q.size()>0){
            int curr = q.poll();
            System.out.print(curr + " ");
            for(int x:graph.get(curr)){
                if(visited[x] == false){
                    visited[x] = true;
                    q.add(x);
                }
            }
        }
    }
}
