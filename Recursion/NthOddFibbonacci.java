package Recursion;

import java.util.*;

class NthOddFibbonacci{
    static int solve(int n){
        if(n==1)
            return 0;
        if(n==2)
            return 1;
        return solve(n-1) + solve(n-2);
    }
    public static int NthOddFibb(int n) {
        //Write code here
        n=(3*n+1)/2;
        int solve = solve(n);
        return solve;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        System.out.println(NthOddFibb(n));
    }
}