package Graphs;

import java.util.*;

public class CourseSchdl {

    public static int canFinish(int n, int[][] prerequisites) {
        // write your code here

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < prerequisites.length; i++) {
            int src = prerequisites[i][0];
            int dest = prerequisites[i][1];
            graph.get(src).add(dest);
        }

        int indegree[] = new int[n];
        for (int i = 0; i < n; i++) {
            for (int x : graph.get(i))
                indegree[x]++;
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0)
                q.add(i);
        }
        int count = 0;
        while (q.size() > 0) {
            int curr = q.poll();
            for (int i : graph.get(curr)) {
                if (--indegree[i] == 0)
                    q.add(i);
            }
            count++;
        }
        if (count == n)
            return 1;
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int prerequisites[][] = new int[M][2];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < 2; j++)
                prerequisites[i][j] = sc.nextInt();
        }
        System.out.println(canFinish(N, prerequisites));

    }
}
