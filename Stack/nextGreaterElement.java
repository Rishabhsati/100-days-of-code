package Stack;

import java.util.*;
import java.io.*;
public class nextGreaterElement {

    static long[] nextLargerElement(long[] arr, int n)
    {
        //Write code here and print output
        Stack<Integer> st = new Stack<>();
        long[] ans = new long[n];
        for (int i = n-1; i>=0; i--) {
            while(st.size() > 0 && arr[st.peek()] <= arr[i]){
                st.pop();
            }
            if(st.size() == 0) {
                ans[i] = -1;
            }else{
                ans[i] = arr[st.peek()];
            }
            st.push(i);
        }
        return ans;
    }

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        String inputLine[] = br.readLine().trim().split(" ");
        long[] arr = new long[n];
        for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
        long[] res = nextLargerElement(arr, n);
        for (int i = 0; i < n; i++)
            System.out.print(res[i] + " ");
        System.out.println();
    }
}
