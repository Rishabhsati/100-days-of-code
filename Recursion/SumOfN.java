import java.util.*;

class SumOfN{
    static int solve(int n,int k,int i){
        if(n==0 && k==0)
            return 1;
        if(i>9 || k==0)
            return 0;
        int ans = 0;
        ans+=solve(n-i,k-1,i+1);
        ans+=solve(n,k,i+1);
        return ans;
    }
    static int sumOfN(int n,int k){
        // write code here
        return solve(n,k,1);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        System.out.print(sumOfN(n,k));
    }
}