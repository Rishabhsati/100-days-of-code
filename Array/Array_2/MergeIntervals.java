package Array_2;

import java.util.*;
import java.util.ArrayList;

public class MergeIntervals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m;
        m = sc.nextInt();
        int[][] A = new int[m][2];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < 2; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        int[][] ans = merge(A);
        for(int i = 0; i < m; i++) {
            System.out.print(ans[i][0]+" ");
            System.out.print(ans[i][1]+" ");
            System.out.println();
        }
    }


    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (x, y) -> Integer.compare(x[0], y[0]));
        int len = intervals.length;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int i=0;i<len;i++){
            int start = intervals[i][0];
            int end = intervals[i][1];
            // if the current interval does not
            // lie in the last interval:
            if(ans.isEmpty() || start > ans.get(ans.size()-1).get(1)){
                ArrayList<Integer> list = new ArrayList<>();
                list.add(start);
                list.add(end);
                ans.add(list);
            }
            // if the current interval
            // lies in the last interval:
            else{
                int new_end = ans.get(ans.size()-1).get(1);
                ans.get(ans.size()-1).set(1,Math.max(end,new_end));
            }
        }
        int [][] res = new int[ans.size()][2];
        for(int i=0;i<ans.size();i++){
            res[i][0]=ans.get(i).get(0);
            res[i][1]=ans.get(i).get(1);
        }
        return res;
    }
}
