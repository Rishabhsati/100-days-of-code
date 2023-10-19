package Recursion;

import java.util.Scanner;

public class Count1 {
    static int count1(int n){
        if(n==0) return 0;
        if(n%10==1){
            return 1+count1(n/10);
        }
        n/=10;
        return count1(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(count1(n));
    }
}
