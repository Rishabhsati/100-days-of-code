import java.util.*;
import static java.lang.Math.ceil;

public class NthEvenFibonacciNumber{
    static long NthEvenFibonacci(long n) {
        //Write your code here
        if(n==1) return 2;
        if(n==2) return 8;
        return (4*NthEvenFibonacci(n-1)+NthEvenFibonacci(n-2))%(1000000007);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(NthEvenFibonacci(n));
    }
}
