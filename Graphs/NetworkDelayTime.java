package Graphs;

import java.util.*;

public class NetworkDelayTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m, k;
        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();
        int[][] a = new int[m][3];
        for (int i = 0; i < m; i++) {
            int u, v, w;
            u = sc.nextInt();
            v = sc.nextInt();
            w = sc.nextInt();
            a[i][0] = u;
            a[i][1] = v;
            a[i][2] = w;
        }
        Solution ob = new Solution();
        System.out.println(ob.networkDelayTime(a, n, k));
    }
}

class Pair {
    int first, second;

    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

class Solution {
    public int networkDelayTime(int[][] times, int N, int K) {
        // Write code here
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for (int i = 0; i <= N; i++)
            adj.add(new ArrayList<>());
        for (int i = 0; i < times.length; i++) {
            int src = times[i][0];
            int dest = times[i][1];
            int time = times[i][2];
            adj.get(src).add(new Pair(dest, time));
        }
        int dist[] = new int[N + 1];
        Arrays.fill(dist, (int) 1e9);
        PriorityQueue<Pair> pq = new PriorityQueue<>((x, y) -> (x.second - y.second));
        pq.add(new Pair(K, 0));
        dist[K] = 0;
        int res = -1;
        while (pq.size() > 0) {
            Pair curr = pq.poll();
            int node = curr.first;
            int time = curr.second;
            for (Pair adjpair : adj.get(node)) {
                int adjnode = adjpair.first;
                int adjtime = adjpair.second;
                if (dist[adjnode] > adjtime + time) {
                    dist[adjnode] = adjtime + time;
                    pq.add(new Pair(adjnode, adjtime + time));
                }
            }
        }
        for (int i = 1; i < dist.length; i++) {
            if (dist[i] == (int) 1e9) {
                return -1;
            }
            res = Math.max(res, dist[i]);
        }
        return res;
    }
}
