import java.util.*;
public class LargestSubArrayWith0Sum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println(maxLen(arr, n));
    }

    static int maxLen(int arr[], int n)
    {
        // Your code here
       HashMap<Integer,Integer> map = new HashMap<>();
       
       int sum = 0;
       int maxi = 0;
       
       for(int i=0;i<n;i++){
           sum+=arr[i];
           if(sum==0){
               maxi = i+1;
           }
           else{
               if(map.containsKey(sum)){
                   maxi = Math.max(maxi,i-map.get(sum));
               }
               else{
                   map.put(sum,i);
               }
           }
       }
       return maxi;
    }
}