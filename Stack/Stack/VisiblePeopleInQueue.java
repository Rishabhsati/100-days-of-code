package Stack;

import java.util.*;


class Main {
	public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int heights[]=new int[n];
        for(int i=0;i<n;i++)
        heights[i]=sc.nextInt();

        VisiblePeopleInQueue ob = new VisiblePeopleInQueue();
        
        int ans[]=ob.solve(heights);
        
        for(int i=0;i<n;i++)
        System.out.print(ans[i]+" ");
        
        System.out.println();
        
	}
}

class VisiblePeopleInQueue{
    public int[] solve(int h[])
    {
        // your code here
        int len = h.length;
        int count[] = new int[len];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<len;i++){
            while(st.size()>0 && h[st.peek()] < h[i]){
                int idx = st.pop();
                count[idx]++;
            }
            if(st.size()>0){
                count[st.peek()]++;
            }
            st.push(i);
        }
        return count;
    }
}