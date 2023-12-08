// package Stack;
import java.util.*;

class test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long arr[] = new long[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        nger(arr,n);
    }
    public static void nger(long[] arr,int n){
        Stack<Integer> st = new Stack<>();
        
        // NEXT GREATER ELEMENT TO THE RIGHT
        // for(int i=0;i<(int)n;i++){
        //     long currentElement = arr[i];
        //     while(!st.isEmpty() && currentElement > arr[st.peek()]){
        //         ans[st.peek()] = arr[i];
        //         st.pop();
        //     }
        //     st.push(i);
        // }
        // while(!st.isEmpty()){
        //     ans[st.peek()] = -1;
        //     st.pop();
        // }
        
        // previous greater element or next greater left
        // for(int i=n-1;i>=0;i--){
        //     long curr = arr[i];
        //     while(st.size()>0 && curr > arr[st.peek()]){
        //         ans[st.peek()] = arr[i];
        //         st.pop();
        //     }
        //     st.push(i);
        // }
        // while(st.size()>0){
            //     ans[st.peek()] = -1;
            //     st.pop();
            // }
            
        long nsr[] = new long[n];
        long nsl[] = new long[n];

        // NEXT SMALLER ELEMENT TO THE LEFT
        for(int i=n-1;i>=0;i--){
            long curr = arr[i];
            while(st.size()>0 && curr < arr[st.peek()]){
                // nsl[st.peek()] = arr[i];
                nsl[st.peek()] = i;
                st.pop();
            }
            st.push(i);
        }
        while(st.size()>0){
            nsl[st.peek()] = -1;
            st.pop();
        }
        
        
           
        // next smaller right 
        for(int i=0;i<n;i++){
            long currentElement = arr[i];
            while(!st.isEmpty() && currentElement < arr[st.peek()]){
                // nsr[st.peek()] = arr[i];
                nsr[st.peek()] = i;
                st.pop();
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            nsr[st.peek()] = -1;
            st.pop();
        }
        
        for(int i=0;i<n;i++){
            System.out.print(nsl[i]+" ");
        }
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print(nsr[i]+" ");
        }
        System.out.println();
        long area = 0;
        for(int i=0;i<(int)n;i++){
            long width = nsr[i] - nsl[i] - 1;
			long currArea = width * arr[i];
            area = Math.max(area,currArea);
        }
        System.out.println(area);
    }
}